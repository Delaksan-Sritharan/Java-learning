import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> luckyNumberList = new ArrayList<Integer>();
        Random rand = new Random();
        while (luckyNumberList.size() < 6){
            int randomNumber = rand.nextInt(49)+1;
            if(!luckyNumberList.contains(randomNumber)){
                luckyNumberList.add(randomNumber);
            }
        }
    }
}
