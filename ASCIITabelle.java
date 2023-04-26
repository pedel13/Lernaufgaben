public class ASCIITabelle {

    public static void main(String[]args){

        char a = 'A';
        char z = 'Z';

        while ((int)a <= (int)z){
            char aKlein = Character.toLowerCase(a);
            System.out.print(a + " Gross: " + (int)a + " Klein: " + (int)aKlein);
            System.out.println();
            a++;
        }
    }
    
}
