import java.util.Scanner;

public class JavaCalculator {
	
	public static void main(String[] args) {
		
		double x = getValueOne();
		char operator = getOperator();
		double y = getValueTwo();
		printResult(x, y, operator);
		
	}
	
	//Gets the first value from the user
	public static double getValueOne() {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter Number");
		double x = scnr.nextDouble();
		return x;
		
	}
	
	//Prompts the user for an operator
	public static char getOperator() {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter an Operator: +, -, *, / ");
		char operator = scnr.next().charAt(0);
		return operator;
		
		
	}
	
	//Gets the second value from the user
	public static double getValueTwo() {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter Number");
		double y = scnr.nextDouble();
		return y;
	}
	//Checks the operator char and then applies the operation. Prints answer.
	public static void printResult(double x, double y, char operator) {
		
		if(operator == '+') {
			System.out.println("The Result is " + (x+y));
			
		}
		if(operator == '-') {
			System.out.println("The Result is " + (x-y));
		}
		if(operator == '*') {
			System.out.println("The Result is " + (x*y));
		}
		if(operator == '/') {
			System.out.println("The result is " + (x/y));
		}
		
		
	}

}
