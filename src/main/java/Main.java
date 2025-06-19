import java.util.*;

public class Main {
    public static void main(String[] args) {
       String str = "Hello";
       String Rstr = "";

       for (int i = 0; i < str.length();i++){
           Rstr = str.charAt(i) + Rstr;
       }
        System.out.println("Reversed String : "+ Rstr);
    }
}
