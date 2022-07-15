import java.util.Scanner;

public class Rectangle{

public static void main(String args[]){

	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the length of Rectangle : ");
	
	int length = scan.nextInt();
	
	System.out.print("Enter the breadth of rectangle : ");

	int breadth = scan.nextInt();

	System.out.println("perimeter of Rectangle is : " + (2*(length + breadth)));

	System.out.println("Area of Rectangle is : " + (length * breadth));
	}

}