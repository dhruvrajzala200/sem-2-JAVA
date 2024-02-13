class Horse{
    static int horseCount=0;
    String name;
    int age;
    String colour;

    Horse(){
        horseCount++;
    }
}
public class Lab_5_6 {
    public static void main(String[] args) {
        
   
   Horse horse1=new Horse();
   System.out.println(Horse.horseCount);
   Horse horse2=new Horse();
   System.out.println(Horse.horseCount);
    }
}