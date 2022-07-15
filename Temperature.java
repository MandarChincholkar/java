import java.util.Scanner;

class Temperature{

	public static void main(String args[]){

	System.out.println("Enter the Temperature in degree celcius :");
	Scanner scan = new Scanner(System.in);
	int celciusTemp = scan.nextInt();
	scan.close();
	System.out.println("given temperature in kelvin is " + (celciusTemp + 273.15f));
	System.out.println("given temperature in fahrenheit is " + (celciusTemp*(9.0/5)+ 32));
	}
}