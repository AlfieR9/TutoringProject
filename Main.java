import java.util.Scanner;
import java.lang.NumberFormatException;

public class Main {

    public static void main(String[] args) {

		//10 -> 11 -> 12
        LinkedNode node3 = new LinkedNode(12);
        LinkedNode node2 = new LinkedNode(11);
        LinkedNode node1 = new LinkedNode(10);

		LinkedList myList = new LinkedList();
		myList.add(node1);
		myList.add(node2);
		myList.add(node3);

        myList.printList();
        myList.removeTail();
		myList.removeTail();
		myList.removeTail();
		myList.removeTail();
		myList.removeTail();
		myList.removeTail();
		myList.removeTail();
		myList.removeTail();
        myList.printList();

    }

	public static void getAverage() {
		        //Create an array of 10 numbers,
        //Ask the user for 10 numbers.
        //Return the average

        //What if the user doesnt enter a number?
        //How can we get decimals? if so can we round them to 2 dp?
        //Can we ask the user if they want to use the program again? Otherwise we exit.

        boolean done = false;
		Scanner keyboard = new Scanner(System.in);

		while (!done) {

	        System.out.println("Enter 10 numbers");

	        float[] numbers = new float[10];
	        float total = 0;

	        for (int i = 0; i < numbers.length; i++) {
	        	try {
					numbers[i] = Float.parseFloat(keyboard.nextLine());
					total += numbers[i];
	        	} catch(NumberFormatException e) {
	        		System.out.println("Invalid input, try again");
	        		i--;
	        	}
	        }
	        
	        float average = Math.round((total / numbers.length) * 100) / 100;
	        System.out.println("This is the average: " + average);
	        
	        System.out.println("Do you want to continue? [Y/N]");
	        if (keyboard.nextLine().toLowerCase().equals("n")) {
	    		done = true;
	        }
	        
		}
		keyboard.close();
	}

}