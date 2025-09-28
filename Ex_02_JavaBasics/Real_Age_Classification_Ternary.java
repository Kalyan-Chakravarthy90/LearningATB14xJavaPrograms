package Ex_02_JavaBasics;

import java.sql.SQLOutput;

public class Real_Age_Classification_Ternary {
    public static void main(String[] args){
        //Type 1: Command Line Arguments [CLI]
        // Age Classification
       String age = args[0];
        System.out.println(age);
       // To check data Type
        System.out.println(age instanceof String);

       // String to Integer parsing
        int age_int = Integer.parseInt(age);

        String result = age_int <18 ? "Minor" : age_int<=60 ? "Adult":"Senior Citizen";
        System.out.println(result);


    }


}
