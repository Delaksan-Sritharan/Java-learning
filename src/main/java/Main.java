public class Main {
   int modelYear;
   String modelName;


    public Main(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[]args){
        Main myobj = new Main(2019,"Toyota Chr");
        System.out.println(myobj.modelYear + " " +myobj.modelName );
    }


}


