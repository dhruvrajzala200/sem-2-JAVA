import java.util.Scanner;
public class Power{
    public static void main(String [] args){
        System.out.println("Enter the number:");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a=sc.nextInt();
         int ans=0;
        for(int i=1;i<=a-1;i++){
            for(int j=0;j<n;j++){
                ans=ans+n;
            }
        }
        System.out.println("The answer is:"+ans);
    }
}