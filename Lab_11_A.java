
/*Refine the student manager program to manipulate the student 
information from files by using the BufferedReader and 
BufferedWriter*/
import java.util.*;
import java.io.*;

class Student {
    int age;
    String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name of student : " + name + " , Age of student : " + age;
    }
}

public class Lab_11_A {

    public static void main(String[] args) {
        String filename = "xyz.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            bw.write("Dhruvrajsinh,18\n");
            bw.write("jay,20\n");
            bw.close();
            System.out.println(" Successfully submited");

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String name_age[] = line.split(",");
                String name = name_age[0];
                int age = Integer.parseInt(name_age[1]);
                Student st = new Student(name, age);
                System.out.println(st);
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
