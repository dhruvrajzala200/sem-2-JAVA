/*Write a complete program to accept N integer numbers from the command line.
Raise and handle exceptions for following cases : 
a. - when a number is –ve 
b. - when a number is evenly divisible by 10 
c. - when a number is greater than 1000 and less than 2000 
d. - when a number is greater than 7000 
Skip the number if an exception is raised for it, otherwise add it to find total sum.*/
class MyException extends Exception {
    public MyException() {
        super();
    }
}

public class Lab_8_2 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                int num = Integer.parseInt(args[i]);
                if (num < 0 || num % 20 == 0 || num > 1000 && num < 2000 || num > 7000) {
                    throw new MyException();
                } else {
                    sum = sum + num;
                }
            }

            catch (MyException our) {
                our.printStackTrace();
            }
        }
        System.out.println("Total sum with exeption " + sum);
    }
}
