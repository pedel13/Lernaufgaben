#include <Arduino.h>
#include <WiFi.h>
#include <WiFiClient.h>
#include <AsyncTCP.h>
#include "Adafruit_MAX1704X.h"

//Global Variables

//Hotspot password
const char* ssid     = "Licht";
const char* password = "123456789";


int rly1 = 22; //confirmed

String rly1State = "off";

//Server
WiFiServer server(80);

// Variable to store the HTTP request
String header;

// Auxiliar variables to store the current output state
String output26State = "off";


void setup() {
  // put your setup code here, to run once:
  int result = myFunction(2, 3);

  Serial.begin(115200); //zahl mus noch angepast werden

  maxlipo.begin();

  //Setup pins
  pinMode(VBAT_PIN, INPUT);

  pinMode(rly1,OUTPUT); 
  
  digitalWrite(rly1, LOW);
  
  IPAddress local_ip(192, 168, 1, 1);
  IPAddress gateway(192, 168, 1, 1);
  IPAddress subnet(255, 255, 255, 0);

  WiFi.softAP(ssid, password);
  WiFi.softAPConfig(local_ip, gateway, subnet);
  server.begin();
}

void loop() {
  // put your main code here, to run repeatedly:
    WiFiClient client = server.available();   // Listen for incoming clients

  if (client) {                             // If a new client connects,
    Serial.println("New Client.");          // print a message out in the serial port
    String currentLine = "";                // make a String to hold incoming data from the client
    while (client.connected()) {            // loop while the client's connected
      if (client.available()) {             // if there's bytes to read from the client,
        char c = client.read();             // read a byte, then
        Serial.write(c);                    // print it out the serial monitor
        header += c;
        if (c == '\n') {                    // if the byte is a newline character
          // if the current line is blank, you got two newline characters in a row.
          // that's the end of the client HTTP request, so send a response:
          if (currentLine.length() == 0) {
            // HTTP headers always start with a response code (e.g. HTTP/1.1 200 OK)
            // and a content-type so the client knows what's coming, then a blank line:
            client.println("HTTP/1.1 200 OK");
            client.println("Content-type:text/html");
            client.println("Connection: close");
            client.println();
            
            // turns the GPIOs on and off

            // Pumps
            if (header.indexOf("GET /" + String(rly1)) >= 0) {
              digitalWrite(rly1, !digitalRead(rly1));
            }

                 // Display the HTML web page
            client.println("<!DOCTYPE html><html>");
            client.println("<h1>LICHT</h1>");
            client.println("<div id="knopf"><button class="off" onclick="knopfOff()" >ON</button></div>")
            // CSS to style the on/off buttons 
            // Feel free to change the background-color and font-size attributes to fit your preferences
            client.println("<style> body {display: flex; align-items: center; justify-content: space-around; flex-direction: column; margin: 0px; background-color: blue;}");
            client.println("h1 {font-size: 200px; color: aliceblue; padding-bottom: 26vw;}");
            client.println(".off{background-color: green;}");
            client.println(".on {background-color: darkred;}");
            client.println("button {font-size: 160px; color: white; height: 70vw; width: 70vw; border-radius: 50%;}</style></head>");
            
            // Web Page Heading
    /*        <script>
    function knopfOff() { 
        document.getElementById("knopf").innerHTML = `<button class="on" onclick="knopfOn()" >OFF</button>`
    }
    function knopfOn() {
        document.getElementById("knopf").innerHTML = `<button class="off" onclick="knopfOff()">ON</button>`
    }
</script>*/

            
            if (digitalRead(rly1)) {
              client.println("<p><a href=\"/" + String(rly1) + "/on\"><button class=\"button\">W Pump 1 On</button></a></p>");
            } else {
              client.println("<p><a href=\"/" + String(rly1) + "/off\"><button class=\"button button2\">W Pump1 off</button></a></p>");
            } 
          }
        }
      }
    }
  }
}
