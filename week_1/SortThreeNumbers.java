//Write a program that takes three integer command-line arguments
// and prints them in descending order
//Use Math.min() and Math.max(). Don't use if-else statement.

public class SortThreeNumbers {
    public static void main(String[] args){
        // your solution starts here
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = Math.max(a, Math.max(b,c));
        int min = Math.min(a, Math.min(b,c));
        int mid = a + b + c -min - max;
        System.out.println("The three integers in descending order: " + max + " " + mid + " "+ min);

    }
}
