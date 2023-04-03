public class STRING {
    //It is basically a class that represent the sequence of the character.
    //it provide many class method to perform the operation on sequence of character.
    //there are 2 way of representing the string
    //1.by literals = simply created by using the double quotes. i.e. String s = "alok"; CONSTANT POOL
    //2.by the keywords = String str1 = new String("alok"); creates in HEAP MEMORY

    public static void main(String[] args) {
//        1. LITERALS
//        String str1 = "alok kumar singh";
//        System.out.println(str1);

//        2. BY USING NEW KEYWORDS
//        String str = new String("alok kumar singh1");
//        System.out.println(str);

//        3.both example together
        String str1 = "alok";
        char ch[] = {'a','l','o','k'};
        String str2 = new String(ch);
        String str3 = new String("singh");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
