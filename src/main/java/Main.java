public class Main {
     int x = 5;

    public static void main(String []args){
        Main myobj1 = new Main();
        Main myobj2 = new Main();
        myobj2.x = 25;
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
        myMethod();

    }
    static void myMethod(){
        System.out.println("Hello World!");
    }


}
