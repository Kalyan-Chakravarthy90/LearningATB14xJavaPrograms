package Ex_02_JavaBasics;

public class NineTableRecursive {

    // A recursive method to print the multiplication table
    public static void printTable(int number, int i) {
        // Base case: Stop the recursion when i is greater than 10
        if (i > 12) {
            return;
        }

        // Recursive step: Print the current line and call the method again
        System.out.printf("%d * %d = %d%n", number, i, number * i);
        printTable(number, i + 1);


    }

    public static void main(String[] args) {
        // Start the recursion with 9 and the initial multiplier of 1
        printTable(9, 1);

    }
}
