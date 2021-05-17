import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create an array of 10 numbers,
        //Ask the user for 10 numbers.
        //Return the average

        //What if the user doesnt enter a number?
        //How can we get decimals? if so can we round them to 2 dp?
        //Can we ask the user if they want to use the program again? Otherwise we exit.

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter 10 numbers");

        int[] numbers = new int[10];
        int total = 0;
        int average;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = keyboard.nextInt();
        }
        for (int a = 0; a < numbers.length; a++) {
            total += numbers[a];
        }

        System.out.println("This is the average: " + total / numbers.length);

    }

}