import java.util.regex.Matcher;

public class Test {


    public static void main(String[]args){
        char t = 1;
        while (t < 257){
            System.out.println(t);
            if (!Character.isLetter(t)){
                System.out.println("nein " + t);
            }
            t++;
        }
        System.out.println("fertig" + (int)t);
    }
}
