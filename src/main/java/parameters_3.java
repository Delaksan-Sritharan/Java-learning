public class parameters_3 {
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied - You ar enot old enough!");
        }else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
