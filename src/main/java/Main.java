import java.util.*;

public class Main {
    public static void main(String[] args) {
        String word = "Delaksan is a future CEO of Wso2";
        int countWord = word.split("\\s").length;
        System.out.println(countWord);
    }
}
