abstract class Main{
    public String fname = "Delaksan";
    public int age = 20;
    public abstract void study();
}

class Student extends Main {
    public int graduationYear = 2028;

    public void study() {
        System.out.println("Studying all day long");

    }
}
