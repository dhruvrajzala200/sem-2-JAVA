import java.util.*;
public class Area{
    public static void main(String[] args ){
        double rad;
        System.out.println("Enter radius=");
        Scanner sc= new Scanner(System.in);
        rad=sc.nextDouble();
        System.out.println("Area of circle="+ 3.14*rad*rad);
    }
}