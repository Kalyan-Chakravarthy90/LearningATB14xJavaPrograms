package Ex_02_JavaBasics;

import java.text.BreakIterator;

public class For_Loop_with_Break {
    public static void main(String[] args) {


        for (int i = 0; i <=10; i++) {
            System.out.println(i);
            if(i==5){

                System.out.println("Loop Ended");
                break;
            }
           // System.out.println(i);
        }
    }
}
