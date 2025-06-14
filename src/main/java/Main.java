import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList< Integer> capitalCities = new ArrayList<Integer>();
        capitalCities.add(4);
        capitalCities.add(7);
        capitalCities.add(8);
        capitalCities.add(23);
        Iterator<Integer> it = capitalCities.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if(i < 10){
                it.remove();
            }
        }
        System.out.println(capitalCities);

    }
}
