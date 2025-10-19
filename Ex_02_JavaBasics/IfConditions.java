package Ex_02_JavaBasics;

import java.util.Scanner;

public class IfConditions {
    public static void main(String[] args) {
        int side1, side2, side3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Angle of Side 1:");
        side1 = input.nextInt();
        System.out.println("Enter Angle of Side 2:");
        side2 = input.nextInt();
        System.out.println("Enter Angle of Side 3:");
        side3 = input.nextInt();
        if(side1 == side2 && side1 == side3){
            System.out.println("Its a Acute Triangle");

        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Its a isosceles Triangle");
        }else
            System.out.println("Its a Scalene Triangle");

    }
}
