import java.util.*;
public class DisplayN {
    public static void main(String[] args){
      Scanner sc =  new Scanner(System.in);
      
      System.out.println("Enter index of array =");
      int n;
       n =  sc.nextInt();
      int [] a = new int[n];
      int i=0;
          for(i=0;i<n;i++){
            System.out.println("Enter elemnet of array : ");
            a[i] =  sc.nextInt();
          }
        System.out.println("array = ");
      for(i=0;i<n;i++){
        System.out.println(a[i]);
      }
    }
    
}
