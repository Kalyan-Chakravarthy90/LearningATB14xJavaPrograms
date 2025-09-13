package Ex_02_JavaBasics;

public class Lab003_Functions {

    public static void main(String[] args) {

        int result = Math.max(10,20); // System Define Functions
        System.out.println(result);

        /* User Define Functions*/
        // Type 1: Function call without Param and Return Type
        f1();

        // Type 2: Function call without Param but with Return Type
        String result3 = Greetings();
        System.out.println(result3);

        // Type 3: Function call with Param and  with Return Type
        int result1 = add(10,20, 30);
        System.out.println(result1);
        // Type 4: Function call with Param and without Return Type
        Name_Age("Kalyan", 35);


    }

    // Type 1: Function Definition without Param and without Return Type
        static void f1(){       /*Step 1: Definition of Function*/
            System.out.println("Welcome");
        }
    // Type 2: Function Definition without Param but with Return Type
        static String Greetings(){
            System.out.println("Hi");
            return "Hello";
        }
    // Type 3: Function Definition with Param and  with Return Type
        static int add(int a, int b, int c){ /*Function which returns*/
           return a+b+c;
        }
    // Type 4: Function Definition with Param and without Return Type
        static void Name_Age(String name, int age){/*Function which doesn't return*/
            System.out.println(name + " is " + age + " years old");
        }
    // Type 5: Main Method Overloading
    public static void main(String args){
        System.out.println("Kalyan");
    }

    public static int main(int args) {
        return 10;
    }
    public static boolean main(boolean args) {
        return true;
    }

    public static float main(float args) {
        return 1;

    }

}





