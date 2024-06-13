import java.util.*;
public class FacRec{
    public static int factor(int n){
        Scanner sc = new Scanner(System.in);
       
         if(n==0||n==1){
            return 1;
        }
        else{
            return n*factor(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number=");
        int n =  sc.nextInt();

        int f = factor(n);
        System.out.println("The factorial is = "+f);
    }
}
