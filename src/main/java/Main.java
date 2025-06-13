import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars,Collections.reverseOrder());
for(String i : cars){
    System.out.println(i);
}
    }

}