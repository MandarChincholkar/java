import java.util.Scanner;

public class ArithmaticOperation{

	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 positive numbers :");

	int a = scan.nextInt();
	int b = scan.nextInt();
	System.out.println(a + "+" + b + " = " + (a+b));
	System.out.println(a + "-" + b + " = " + (a-b));
	System.out.println(a + "*" + b + " = " + (a*b));
	System.out.println(a + "/" + b + " = " + (a/b));
	System.out.println(a + "%" + b + " = " + (a%b));
	}



}