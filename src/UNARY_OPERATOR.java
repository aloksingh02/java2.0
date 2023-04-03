public class UNARY_OPERATOR {
    //IN THIS WE PERFORM THE INCREMENT AND DECREMENT OPERATION(i.e X++,X--,++X,--X,+X, -X,~,!
    //Post Increment (i++) : Current value of ‘i’ is used and then it is incremented by 1.
    //Pre Increment (++i) : First ‘i’ is incremented by 1 and then it’s value is used.
    //Post Decrement (i-- ) : Current value of ‘i’ is used and then it is decremented by 1.
    //Pre Decrement (--i) : First ‘i’ is decremented by 1 and then it’s value is used.

    public static void main(String[] args) {
//        1. int a = 10;
//        System.out.println(a++);
//        //10 but form here the value of x is change to 11;
//        System.out.println(a++);
//        //now we get the 11 as output

//        2.++ --
//        int a = 10;
//        int b = 10;
//        System.out.println(a++ + ++a);
//        System.out.println(b++ + b++);

//        3.~,!
//        int a = 10;
//        int b = -11;
//        boolean c = true;
//        boolean d = false;
//        System.out.println(~a);
//        System.out.println(~b);
//        System.out.println(!c);
//        System.out.println(!d);

//        4.
//        int i = 11;
//        i = i++ + ++i;
//        System.out.println(i);

//        5.
//        int a = 11, b=22 , c;
//        c= a + b + a++ + b++ + ++a + ++b;
//        System.out.println("a ="+a);
//        System.out.println("b ="+b);
//        System.out.println("c ="+c);

//        6.
//        int i = 0;
//        i = i++ - --i + ++i - i--;
//        System.out.println(i);

//        7.
//        boolean b = true;
//        b= b++;
//        System.out.println();
//        it cant be applied on boolean type

//        8.
//        int i = 1, j=2 , k=3;
//        int m = i-- - j-- - k--;
//        System.out.println("i ="+i);
//        System.out.println("j ="+j);
//        System.out.println("k ="+k);
//        System.out.println("m ="+m);

//        9.
//        int ch = 'A';
//        System.out.println(ch++);
//        65 because of int++ hai

//        10.
//        char ch ='A';
//        System.out.println(++ch);
//        B

//        11.
//        char ch = "123".charAt(1);
//        System.out.println(ch++ + ++ch);
//        by ASCII value

//        12.
        char c = 'A', C = 'a';
        System.out.println(c++ * ++c);
    }
}