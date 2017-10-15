package example31;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show a check writer software
*/
public class Example31
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//ask the date
		System.out.print("Enter the date of the check: ");
		String date = in.nextLine();
		
		//the name of the person who the check is for
		System.out.print("Who is the check for?: ");
		String personName = in.nextLine();
		
		//ask the amount of the check
		System.out.print("What is the amount of the check?: ");
		String amountInCheck = in.nextLine();
		
		System.out.println(" ");
		System.out.println(" ");
		
		//show the dates
		System.out.println("\t\t\t\t\t\t\t\tDate: " + date);
		
		System.out.println(" ");

		//display the ammount to pay and the name
		System.out.println("Pay to the Order of: " + personName + "\t\t\t$" + amountInCheck);
		
		System.out.println(" ");
		//display the cash in word
//		System.out.println("One thousand nine hundred twenty and 85 cents");
	} 
}