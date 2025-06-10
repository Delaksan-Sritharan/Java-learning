import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
       cars.add(0,"Benz");
        System.out.println(cars.get(0));

    }

}