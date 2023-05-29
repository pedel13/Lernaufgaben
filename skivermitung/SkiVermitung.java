import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkiVermitung {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        List <Schuh> schuhe = new ArrayList<Schuh>();
        List <Kleidung> kleidungen = new ArrayList<Kleidung>();
        List <Snowboard> snowboards = new ArrayList<Snowboard>();
        List <Ski> skis = new ArrayList <Ski>();
        List <Person> personen = new ArrayList <Person>();
        List <Produkt> produkte = new ArrayList <Produkt>();

        Snowboard snowboard1 = new Snowboard("Borten", 59.95, 1.85, 560,"Freeraid");
        snowboards.add(snowboard1);
        produkte.add(snowboard1);
        Snowboard snowboard2 = new Snowboard("2K", 60.95, 1.56, 570,"Freeraid");
        snowboards.add(snowboard2);
        produkte.add(snowboard2);
        Snowboard snowboard3 = new Snowboard("Head", 45.95, 1.85, 580,"Piste");
        snowboards.add(snowboard3);
        produkte.add(snowboard3);
        Snowboard snowboard4 = new Snowboard("Borten", 100.95, 1.63, 590,"Park");
        snowboards.add(snowboard4);
        produkte.add(snowboard4);

        Ski ski1 = new Ski("Borten", 100.95, 1.85, 660,"Park");
        skis.add(ski1);
        produkte.add(ski1);
        Ski ski2 = new Ski("2K", 46.95, 1.53, 670,"Freeraid");
        skis.add(ski2);
        produkte.add(ski2);
        Ski ski3 = new Ski("Head", 100.95, 1.93, 680,"piste");
        skis.add(ski3);
        produkte.add(ski3);
        Ski ski4 = new Ski("Borten", 80.55, 1.73, 690,"piste");
        skis.add(ski4);
        produkte.add(ski4);
             
        Schuh schu1 = new Schuh("Borten", 100.95, 1.85, "Grün", 360);
        schuhe.add(schu1);
        produkte.add(schu1);
        Schuh schu2 = new Schuh("2K", 46.95, 1.53, "Blau", 370);
        schuhe.add(schu2);
        produkte.add(schu2);
        Schuh schu3 = new Schuh("Head", 100.95, 1.93, "Rot", 380);
        schuhe.add(schu3);
        produkte.add(schu3);
        Schuh schu4 = new Schuh("Borten", 80.55, 1.73, "Grün", 390);
        schuhe.add(schu4);
        produkte.add(schu4);

        Person person1 = new Person("Patrick", "Wethli", "Florastrasse 13", 311096, "+41793666036", "c7678892");
        personen.add(person1);
        boolean menu = true;

        while (menu){
            System.out.println("Ski: 1; Snowboard: 2; Schuhe: 3; Kleidung: 4; person: 5; Quit: 6;");
            int auswahl = sc.nextInt();
            switch (auswahl){
                case 1:
                    System.out.println("Ski:  Hinzufügen: 1;  Suchen: 2");
                    int skiMenu = sc.nextInt();
                    switch (skiMenu){
                        case 1:
                                                 //Marke    Peis             Grösse          produktNr       art
                            Ski ski = new Ski(sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextInt(), sc.next());
                            skis.add(ski);
                            produkte.add(ski);
                            ski.printAttribut();
                            break;
                        case 2:
                            System.out.println("Marke: 1; Preis: 2; Grösse: 3; ProduktNr: 4; Art: 5");
                            int skiAttribut = sc.nextInt();
                            switch (skiAttribut){
                                case 1:
                                    System.out.println("welche Marke wollen sie");
                                    String markeSki = sc.next();
                                    for (Ski j: skis){
                                        if (j.getMarke().equals(markeSki)){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("was ist der nidrigster preis");
                                    double nidrigsterpreisSki = sc.nextDouble();
                                    System.out.println("was ist der hchst Preis");
                                    double hochstPreisSki = sc.nextDouble();
                                    for (Ski j: skis){
                                        if (j.getPreis() <= hochstPreisSki && j.getPreis() >= nidrigsterpreisSki){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("welche Grösse wollen sie");
                                    double skiGrosse = sc.nextDouble();
                                    for (Ski j: skis){
                                        if (skiGrosse == j.getGrosse()){
                                            j.printAttribut();
                                        }
                                    }
                                case 4:
                                    System.out.println("Welche ProduktNr Suchen sie");
                                    int skiProduktNr = sc.nextInt();
                                    for (Ski j: skis){
                                        if (j.getProduktNr() == skiProduktNr){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("wofür vewrwenden sie es");
                                    String skiArt = sc.next();
                                    for (Ski j: skis){
                                        if (j.getArt().equals (skiArt)){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                case 2: 
                    System.out.println("Snowboard:  Hinzufügen: 1; suchen: 2;");
                    int snowboardmenu = sc.nextInt();
                    switch (snowboardmenu){
                        case 1:
                                                                //Marke    Peis             Grösse          produktNr       art                    
                            Snowboard snowboard = new Snowboard(sc.next(), sc.nextDouble(), sc.nextDouble(), sc.nextInt(), sc.next());
                            snowboards.add(snowboard);
                            snowboard.printAttribut();
                            produkte.add(snowboard);
                            break;
                        case 2:
                            System.out.println("Marke: 1; Preis: 2; Grösse: 3; ProduktNr: 4; Art: 5");
                            int snowboardAttribut = sc.nextInt();
                            
                            switch (snowboardAttribut){
                                case 1:
                                    System.out.println("welche Marke Suchen sie?");
                                    String markenScheSnowboard = sc.next();
                                    for (Snowboard j: snowboards){
                                        if (markenScheSnowboard.equals(j.getMarke())){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Nidrigster Preis");
                                    double nidrigsterPreisSnowboard = sc.nextDouble();
                                    System.out.println("Höchster Preis");
                                    double hochsterPreisSnowboard = sc.nextDouble();
                                    for (Snowboard j: snowboards){    
                                        if (j.getPreis() >= nidrigsterPreisSnowboard && hochsterPreisSnowboard >= j.getPreis()){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("welche Grösse Suchen sie");
                                    double snowboardGrosse = sc.nextDouble();
                                    for (Snowboard j: snowboards){
                                        if (j.getGrosse() == snowboardGrosse){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 4: 
                                    System.out.println("welche Produktnummer suchen sie");
                                    int snowboardProduktNr = sc.nextInt();
                                    for (Snowboard j: snowboards){
                                        if (j.getProduktNr() == snowboardProduktNr){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 6:
                                    System.out.println("Für was wollen sie es verwenden");
                                    String snowboardArt = sc.next();
                                    for (Snowboard j: snowboards){
                                        if (j.getArt() == snowboardArt){
                                            j.printAttribut();
                                        }
                                    }
                            }
                            break;
                    }
                    break;

                case 3:
                    System.out.println("schuhe:  Hinzufügen: 1; Suchen: 2");
                    int schuhMenu = sc.nextInt();
                    switch (schuhMenu){
                        case 1:
                                                     //Marke          Peis             Grösse       farbe    produktNr  
                            Schuh schuh = new Schuh(sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next(), sc.nextInt());
                            schuhe.add(schuh);
                            produkte.add(schuh);
                            schuh.printAttribut();
                            break;
                        case 2:
                            System.out.println("Marke: 1; Preis: 2; Grösse: 3; Farbe: 4; ProduktNr: 5");
                            int schuhSuchMenu = sc.nextInt();
                            switch (schuhSuchMenu){
                                case 1:
                                    System.out.println("Welche Marke suchen sie");
                                    String schuhMarke = sc.next();
                                    for (Schuh j: schuhe){
                                        if (j.getMarke().equals(schuhMarke)){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("nidrigster Preis");
                                    double schuhNidrigsterPreis = sc.nextDouble();
                                    System.out.println("was ist der höchste Preis");
                                    double schuhHochstPreis = sc.nextDouble();
                                    for (Schuh j: schuhe){
                                        if (j.getPreis() <= schuhHochstPreis && j.getPreis() >= schuhNidrigsterPreis){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("welche grösse suchen sie");
                                    double schuhGrosse = sc.nextDouble();
                                    for (Schuh j: schuhe){
                                        if (j.getGrosse() == schuhGrosse){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("welche farbe suchen sie");
                                    String schuhFarbe = sc.next();
                                    for (Schuh j: schuhe){
                                        if (j.getFarbe().equals(schuhFarbe)){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("welche ProduktNr suchen sie");
                                    int schuhProduktNr = sc.nextInt();
                                    for (Schuh j: schuhe){
                                        if (j.getProduktNr() == schuhProduktNr){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                    break;

                    case 4:
                    System.out.println("Kleidung:  Hinzufügen: 1; Suchen: 2");
                    int kleidungsMenu = sc.nextInt();
                    switch (kleidungsMenu){
                        case 1:
                                                              //Marke         Peis             Grösse         farbe    produktNr 
                            Kleidung kleidung = new Kleidung(sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next(), sc.nextInt());
                            kleidungen.add(kleidung);
                            produkte.add(kleidung);
                            kleidung.printAttribut();
                            break;
                        case 2:
                            System.out.println("Kleidung:  Marke: 1; Preis: 2; Grösse: 3; Farbe: 4; ProduktNr: 5");
                            int kleidungsSuchMenu = sc.nextInt();
                            switch (kleidungsSuchMenu){
                                case 1:
                                    System.out.println("welche Marke suchen sie");
                                    String kleidungsMarke = sc.next();
                                    for (Kleidung j: kleidungen){
                                        if (j.getMarke().equals(kleidungsMarke)){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("was ist der nidrigster Preis");
                                    double nidrigsterPreisKleidung = sc.nextDouble();
                                    System.out.println("was ist der Höchste Preis");
                                    double hochstPreisKleidung = sc.nextDouble();
                                    for (Kleidung j: kleidungen){
                                        if (j.getPreis() < hochstPreisKleidung && j.getPreis() > nidrigsterPreisKleidung){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("welche Grösse suchen sie");
                                    double kleidungsGrosse = sc.nextDouble();
                                    for (Kleidung j: kleidungen){
                                        if (j.getGrosse() == kleidungsGrosse){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("welche Farbe suchen sie");
                                    String kleiderFarbe = sc.next();
                                    for (Kleidung j: kleidungen){
                                        if (j.getFarbe().equals(kleiderFarbe)){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("welche ProduktNr suchen sie");
                                    int kleiderProduktNr = sc.nextInt();
                                    for (Kleidung j: kleidungen){
                                        if (j.getProduktNr() == kleiderProduktNr){
                                            j.printAttribut();
                                        }
                                    }
                                    break;
                            }
                            break;
                    }   
                    break;  
                case 5:
                    System.out.println("person Erfassen: 1;  ändern: 2;  Bestellungen hinzufügen: 3");
                    int personenMenu = sc.nextInt();
                    switch (personenMenu){
                        case 1:
                                                         //Name      Nachname    Adresse   GeburtsDatum    TelephonNr    AusweissNr   
                            Person person = new Person(sc.next(), sc.next(), sc.next(),sc.nextInt(), sc.next(), sc.next());
                            personen.add(person);
                            person.printAttribut();
                            break;
                        case 2:


                        case 3:
                            System.out.println("geben sie ihre AusweisNr. ein");
                            String ausweissNr = sc.next();
                            boolean produktWahl = true;
                            for (Person p: personen){
                                if (p.getAusweisNr().equals(ausweissNr)){
                                    p.printAttribut();
                                    while (produktWahl){
                                        System.out.println("welche produktNr wollen sie Hinzufügen");
                                        int produktHinzufügen = sc.nextInt();
                                        for (Produkt i: produkte){
                                            if (produktHinzufügen == i.getProduktNr()){
                                                p.setAusgewehlteProdukte(i.getProdukt());
                                            }
                                        }
                                        System.out.println("Weiterschtöbern: Belibige Taste;     mehr Produkte Hinzufügen: Yas");
                                        String bestelMenu = sc.next();
                                        if (bestelMenu.equals("Yas")){
                                        }
                                        else {
                                            p.printProdukte();
                                            System.out.println("Wie viele Tage wollen sie es mieten");
                                            int tage = sc.nextInt();
                                            double mietPreis = p.warenkorbBerechnung() * tage;
                                            System.out.println("Ihr warenkorb Kostet momentan" + mietPreis);
                                            produktWahl = false;
                                        }
                                        
                                    



                                    
                                    }
                                }
                            }
                            break;
                    }
                    break;
                case 6:
                    menu = false;
                    break;
                case 7:
                    for (Snowboard j: snowboards){
      
                    }
                    break;
                
            }

        }

    }
    
}
