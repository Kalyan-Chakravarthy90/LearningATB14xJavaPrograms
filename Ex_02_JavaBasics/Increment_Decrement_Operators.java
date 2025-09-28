package Ex_02_JavaBasics;

public class Increment_Decrement_Operators {

    public static void main(String[] args) {

    // Increment
        // pre increment example: ++a [ a = a+1 ]
        int a = 10;
        //int b = ++a;
       /* System.out.println(a);
        System.out.println(b);
        // Post increment example: a++ . a = a and then +1
        int a_post = 10;
        int b_post = a_post++;
        System.out.println(a_post);
        System.out.println(b_post); */

        System.out.println(a++ + ++a);


    // Decrement
        int b = 10;
        //int b = ++a;
       /* System.out.println(a);
        System.out.println(b);
        // Post increment example: a++ . a = a and then +1
        int a_post = 10;
        int b_post = a_post++;
        System.out.println(a_post);
        System.out.println(b_post); */

        System.out.println(b-- + --b);
    }
}
