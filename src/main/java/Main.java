import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet< Integer> capitalCities = new HashSet<Integer>();
        capitalCities.add(4);
        capitalCities.add(7);
        capitalCities.add(8);
        for(int i = 0; i <=10; i++){
            if(capitalCities.contains(i)){
                System.out.println(i+" was found in the set");
            }else {
                System.out.println(i + " was not found in the set");
            }
        }
    }
}
