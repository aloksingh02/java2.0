import java.util.*;
import java.util.Scanner;
public class taking_input_from_user1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        System.out.println("enter the str1:" +str1);

        String str2 = sc.nextLine();
        System.out.println("enter the str2:" +str2);

        int x=sc.nextInt();
        System.out.println("enter the number:" +x);

        float f = sc.nextFloat();
        System.out.println("enter the decimal number:" +f);

    }
}
