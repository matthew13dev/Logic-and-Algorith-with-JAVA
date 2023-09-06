import java.util.Scanner;

public class Cap03_Exercise01 {
	
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		Integer number = imput.nextInt();
		
		Integer number_squared = number * number;
		
		System.out.println("The number squared is: " + number + " is " + number_squared + ".");
		
		imput.close();
	}

}
