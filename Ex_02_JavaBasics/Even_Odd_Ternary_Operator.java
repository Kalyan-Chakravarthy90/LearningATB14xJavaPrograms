package Ex_02_JavaBasics;

import java.util.Scanner;

public class Even_Odd_Ternary_Operator {
    public static void EvenOrOdd (int a) {


        String E_O = (a % 2 == 0) ? "Even" : "Odd"; // Ternary Operator
        System.out.println("Given Number is:" + E_O);
    }
    public static void WTC(){
        Scanner New_input =  new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String option;

        do {

            System.out.println("Do you want to continue: Yes : No");
            option = scanner.nextLine();
            if (option.equalsIgnoreCase("Yes")){
            System.out.println("Enter a Number:");
            int New_Number = New_input.nextInt();
            EvenOrOdd(New_Number);
            }else if (option.equalsIgnoreCase("No")){
                System.out.println("Thanks ! Terminating the session...");
                scanner.close();
            }else System.out.println("Invalid Option Select Yes or No");
        } while (!option.equalsIgnoreCase("No"));



    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Enter a Number:");
        int number = input.nextInt();
        EvenOrOdd(number);

        WTC();

    }

    }

