import java.util.Scanner;
class Square{

	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the length of Sqaure :");
	int side = scan.nextInt();
	System.out.println("Perimeter of Square is " + (4*side));
	System.out.println("Area of Square is " + side*side);

	}	


}