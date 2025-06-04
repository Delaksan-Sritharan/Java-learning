import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter username : ");

        String userName = obj.nextLine();
        System.out.println("Username is : "+userName);
    }
}