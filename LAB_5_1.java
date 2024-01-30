import java.util.*;
class Circle {
    double radius;
    double area;
    void areaCircle(double radius) {
        this.radius =  radius;
       area = Math.PI*radius*radius;
    }
}

public class LAB_5_1
{
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter the radius of circle =");
        double r = sc.nextDouble();
        Circle c =new Circle();
        c.areaCircle(r);
        System.out.println(c.area);

    }
}
