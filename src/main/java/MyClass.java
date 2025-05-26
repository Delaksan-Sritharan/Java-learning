import java.util.Scanner;

public class MyClass {
    public static void main(String[]args){
        Scanner myobj = new Scanner(System.in);
        System.out.print("Enter username: ");

        String userName = myobj.nextLine();
        System.out.println("Username : "+userName);

    }
}
