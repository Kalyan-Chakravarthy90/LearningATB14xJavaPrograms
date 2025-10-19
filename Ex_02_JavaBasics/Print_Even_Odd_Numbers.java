package Ex_02_JavaBasics;

public class Print_Even_Odd_Numbers {
    public static void main(String[] args) {
        // To find even or numbers from 1 to 50
        for(int i=1; i<=50; i++){
            if(i%2==0){
                System.out.println(i + " is even number");
            }else
                System.out.println(i + " is odd Number");
        }
    }
}
