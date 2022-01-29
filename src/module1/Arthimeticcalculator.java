package module1;
import java.util.Scanner;
public class Arthimeticcalculator {

	public static void main(String[] args) {
		int operation1 = 0;
		int operation2 = 0;
	    int result = 0;
	    double choose =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Arthimetic calculator");
		System.out.println("press 1 for Addition");
		System.out.println("press 2 for substraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for Division");
		System.out.println("press 5 for Modulus"); 
		choose  = sc.nextDouble();
		System.out.println("Enter the First Number");
		operation1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		operation2 = sc.nextInt();
	if(choose == 1) {
		result = operation1+operation2;
		System.out.println("sum is:" +result);
	}
	else if(choose == 2) {
		result = operation1-operation2;
		System.out.println("substraction is:" +result);
	}
	else if(choose == 3) {
		result = operation1*operation2;
		System.out.println("product is:" +result);
	}
	else if(choose == 4) {
		result = operation1/operation2;
		System.out.println("division is:" +result);
	}
	else if(choose == 5) {
		result = operation1%operation2;
		System.out.println("remainder is:" +result);
	}
	}
}
	
	
