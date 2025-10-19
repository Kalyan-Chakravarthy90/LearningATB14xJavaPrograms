package Ex_02_JavaBasics;

import java.util.Scanner;

public class Factorial_While_loop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number to know its Factorial: ");

        if(num.hasNextInt()) {

           int ui = num.nextInt();

            if(ui == 0){
                System.out.println("Factorial for 0 is always 1");
            }
            if(ui <0 || ui> Integer.MAX_VALUE) {
                System.out.println("No factorial as Out of Bounds");
            }

            int fact = 1;
            while (ui >= 1) {
                fact = fact * ui;
                ui--;
            }
            System.out.println(fact);


        }
    }
}
