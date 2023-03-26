import java.util.*;
public class taking_input_from_user {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int a = sc.nextInt();
        System.out.println("enter the number 2");
        int b = sc.nextInt();

          int c = a+b;
          int d = a-b;
          int e = a*b;
          int f = a/b;
          int g = a%b;

        System.out.println("result is:" +c);
        System.out.println("result is:" +d);
        System.out.println("result is:" +e);
        System.out.println("result is:" +f);
        System.out.println("result is:" +g);
    }
}
