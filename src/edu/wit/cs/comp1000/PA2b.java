package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double discriminant = (b * b) - (4 * a * c);
		
		String result;
		if (discriminant < 0) {
			result = "Roots: imaginary";
		} else if (discriminant == 0) {
			double root = -b / (2 * a);
			result = String.format("Root: %.2f", root);
		} else {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			
			if (root1 > root2) {
				double temp = root1;
				root1 = root2;
				root2 = temp;
			}
			result = String.format("Roots: %.2f, %.2f", root1, root2);
		}
		System.out.println(result);
		input.close();
	}

}
