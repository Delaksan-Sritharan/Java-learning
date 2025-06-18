import java.util.*;

public class Main {
    public static void main(String[] args) {
      HashSet<Integer> luckyNumber = new HashSet<>();
      Random rand = new Random();

      while (luckyNumber.size()<6){
          int number = rand.nextInt(49) +1;
          luckyNumber.add(number);

          System.out.println("Your lucky lottery numbers are:");
          for(int num: luckyNumber){
              System.out.println(num + " ");
          }
      }
    }
}
