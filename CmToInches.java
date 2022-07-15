import java.util.Scanner;

class CmToInches{


	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length in of the stick in centimeters : ");
		int lengthInCm = scan.nextInt();
		scan.close();
		System.out.println("length is " + (lengthInCm/2.54) + "inches");
	}
}