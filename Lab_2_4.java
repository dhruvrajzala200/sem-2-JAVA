import java.util.Scanner;
public class Lab_2_4{
      public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	System.out.print("Enter the radius of circle =");
      	double r = sc.nextDouble();
      	Double area = 3.14*r*r;
        System.out.print("Area of circle is ="+area);
	}
}
