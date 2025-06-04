public class MyAnimal implements Animal {
    @Override
    public void animalSound(){
        System.out.println("dee");
    }
    @Override
    public void run(){
        System.out.println("run");
    }
    public static void main(String []args){
        MyAnimal obj = new MyAnimal();
        obj.animalSound();
        obj.run();
    }
}
