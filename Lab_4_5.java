import java.util.*;
    public class Lab_4_5 {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the string =");
            String str=sc.nextLine();
            int i=0;
         for(char ch: str.toCharArray()){
            i++;
         }
        System.out.println("string lenght="+i);

         for(i=(str.length())/2;i<str.length();i++){
            System.out.print(""+str.charAt(i));
         }
    }
}
