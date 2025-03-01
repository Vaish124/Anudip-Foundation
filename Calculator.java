package com.vaishnavi;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        double num1, num2, result;
	        char operator;

	        System.out.print("Enter first number: ");
	        num1 = input.nextDouble();

	        System.out.print("Enter an operator (+, -, *, /): ");
	        operator = input.next().charAt(0);

	        System.out.print("Enter second number: ");
	        num2 = input.nextDouble();

	        switch (operator) {
	case '+':
        result = num1 + num2;
        break;
    case '-':
        result = num1 - num2;
        break;
    case '*':
        result = num1 * num2;
        break;
    case '/':
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println(" Division by zero is not allowed.");
            return;
        }
        break;
    default:
        System.out.println("Error: Invalid operator.");
        return;
}

System.out.println("Result: " + result);





	}

}
