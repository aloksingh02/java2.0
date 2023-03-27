import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class taking_input_from_user2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        String name;
//        int rollno;
//        float marks;
//
//        System.out.println("Enter the name:");
//        name = sc.nextLine();
//
//        System.out.println("Enter the rollno");
//        rollno = sc.nextInt();
//
//        System.out.println("Enter the marks");
//        marks= sc.nextFloat();
//
//        System.out.println("Name:"+name);
//        System.out.println("rollno:"+rollno);
//        System.out.println("marks:"+marks);
//        int a,b,c;
//        float s;
//        double area;


        // AREA OF TRIANGLE
//        System.out.println("Enter the value of a,b,c");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//
//        area = (a+b+c)/2;
//        //s = Math.sqrt((s-a)*(s-b)*(s-c));
//        System.out.println("Area of triangle is:"+area);


        //AREA OF QUARDRATIC
        int a,b,c;
        double r1,r2;

        System.out.println("enter the four side a,b,c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        r1=(-b+Math.sqrt(b*b-4*a*c)/2*a);
        r2=(b+Math.sqrt(b*b-4*a*c)/2*a);

        System.out.println("root of"+r1+"and"+r2);
    }
}
