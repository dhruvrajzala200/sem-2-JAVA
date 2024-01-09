import java.util.Scanner;
public class Lab_2_3{
	public static void main(String[]  args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Numebrs :");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("press + to add,press - to subtract,press * to multiply,press / to divide ");
		String s =sc.next();
		   switch(s){ 

		   case "+":
		   	System.out.println("Sum ="+(a+b));
		   	break;

           case "-":
           	System.out.println("Difference ="+(a-b));
           	break;

           case "*":
           	System.out.println("Multiplication ="+(a*b));
           	break;

           case "/":
           	if( b!=0)
           		System.out.println("Dividation ="+(a/b));
            else
            	System.out.println("Error : Enter non-zero Number");
            break;

           default:
			System.out.println("Enter a valid operation");
		   }
	}
}
