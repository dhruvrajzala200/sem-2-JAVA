import java.util.*;

class sentences{
      int count_i;
      int count_e;
      int count_a;
      int count_u;
      int count_o;

      public sentences(){
        this.count_i = 0;
        this.count_a = 0;
        this.count_e = 0;
        this.count_u = 0;
        this.count_o = 0;
      }
      public void processSentences(String s1){
        for (int i=0;i<s1.length();i++) {
            if(s1.charAt(i)=='a'||s1.charAt(i)=='A'){
                count_a++;
            }
            if(s1.charAt(i)=='e'||s1.charAt(i)=='E'){
                count_a++;
            }
            if(s1.charAt(i)=='i'||s1.charAt(i)=='I'){
                count_a++;
            }
            if(s1.charAt(i)=='o'||s1.charAt(i)=='O'){
                count_a++;
            }
            if(s1.charAt(i)=='u'||s1.charAt(i)=='U'){
                count_a++;
            }
        }
      }
}

public class Lab_5_3 {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);
    sentences sentence = new sentences();
    while(true) {
        System.out.println("Please Enter Sentence : ");
        String s1 = sc.nextLine();
        if(s1.equalsIgnoreCase("quit")){
            break;
        }
        else{
            sentence.processSentences(s1);
        }
    }
    System.out.println("a = "+sentence.count_a+"\ne = "+sentence.count_e+"\ni = "+sentence.count_i+"\no = "+sentence.count_o+"\nu = "+sentence.count_u);
    }
}
