import java.io.*;
import java.util.Scanner;

public class taking_input_from_user2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        int rollno;
        float marks;

        System.out.println("Enter the name:");
        name = sc.nextLine();

        System.out.println("Enter the rollno");
        rollno = sc.nextInt();

        System.out.println("Enter the marks");
        marks= sc.nextFloat();

        System.out.println("Name:"+name);
        System.out.println("rollno:"+rollno);
        System.out.println("marks:"+marks);

    }
}
