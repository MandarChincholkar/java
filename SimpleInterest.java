import java.util.Scanner;

class SimpleInterest{

	public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	System.out.print("principal :" );
	int principal = scan.nextInt();
	System.out.print("Rate of Interest :" );
	float roi = scan.nextFloat();
	System.out.print("duration in years :" );
	float time = scan.nextFloat();
	System.out.print("simple interest is :" +(principal*roi*time));


	}




}