
/*WAP to create Account class, which is representing a bank account where we 
can deposit and withdraw money. if we want to withdraw money which exceed our 
bank balance? We will not be allowed, create InSufficientFundException to 
handle above situation and display proper error message*/
import java.util.*;

class Account {
    int bank_balance;

    public int deposite(int d) {
        bank_balance = bank_balance + d;
        return bank_balance;
    }

    public int withdraw(int w) {
        bank_balance = bank_balance - w;
        return bank_balance;
    }
}

class InsufficientFundException extends Exception {
    public InsufficientFundException() {
        super();
    }
}

public class Lab_8_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        System.out.println("Enter bank bal :");
        a.bank_balance = sc.nextInt();
        System.out.println("deposite or withdraw money:");
        String s = sc.next();
        if (s.equals("deposite")) {
            System.out.println(" moeney  you want to deposit : ");
            int d = sc.nextInt();
            System.out.println("Bank balance = " + a.deposite(d));
        } else {
            try {
                System.out.println(" money  you want to withdraw :  ");
                int w = sc.nextInt();
                if (w > a.bank_balance) {
                    throw new InsufficientFundException();
                } else {
                    System.out.println("Bank balance = " + a.withdraw(w));
                }
            } catch (InsufficientFundException e) {
                System.out.println("Error Message : Insufficient Funds");
                System.out.println("Bank balance = " + a.bank_balance);
            }
        }

    }
}
