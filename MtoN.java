import java.util.Scanner;

public class MtoN {
    public static void main(String[] args){
        int m,n;
         Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first number = ");
        m=sc.nextInt();
        System.out.println("enter second number =");
        n=sc.nextInt();

         if(m>n){
            int temp=m;
            m=n;
            n=temp;
         }
         int size = n-m;
         int[] a = new int[size+1];
         int sum=0;
         for(int i=0;i<=size;i++){
            a[i]=m;
            m++;
            sum = sum + a[i];
         }
            System.out.println("the sum from m to N is = "+sum);
    }
    
}
