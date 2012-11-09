import java.util.Scanner;


public class Restaurant {

	
	static Menu men = new Menu();
	static Bill mybill = new Bill();

	public static void main(String[] args) 
	{
		RandomWaiter ranWait = new RandomWaiter();
		Waiter waiter = ranWait.assignWaiter();
		
		
		men.displayMenu();
		

		Scanner scan = new Scanner(System.in);
		String choice = scan.next();

		while (!choice.equals("no"))
		{	if (choice.equals("yes"))
			{	


			System.out.println("Which item would you like?"); // Do something
			int item = scan.nextInt();

			}
			else if (choice.equals("paybill"))
			{	// Do something
				System.out.println("Enter amount you want to pay");
				waiter.addTips(mybill.payBill(scan.nextInt()));
				
			}
			else
				System.out.println("Invalid input!");

		    men.displayMenu();
			choice = scan.next();
		}


	
		

}}