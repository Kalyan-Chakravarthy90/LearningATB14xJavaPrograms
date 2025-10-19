package Ex_02_JavaBasics;

import java.util.Scanner;

public class Factorial_for_loop {
    public static void main(String[] args) {

        Scanner Num = new Scanner(System.in);
        System.out.println("Enter a Number to find its Factorial: ");
        int j = Num.nextInt();
        int fact=1;
        for(  int i = 1 ; i<=j ; i++) {

            fact = fact * i;


        }
        System.out.println("Factorial of " + j+ " is = " + fact);
        System.out.println("Terminating session");
        }



    }

