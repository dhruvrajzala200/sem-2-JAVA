import java.util.Scanner;
public class Lab_4_4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int rev[] = new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter value of element "+i);
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			rev[i] = arr[n-i-1];
		}
		System.out.println("Reverse array:");
		for(i=0;i<n;i++)
		{
			System.out.print("Value of element "+i);
			System.out.println(" = "+rev[i]);
		}
	}
}