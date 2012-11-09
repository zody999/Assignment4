import java.util.Scanner;


public class Restaurant {

	Waiter Bob = new Waiter("Bob", (double) 0);
	Waiter Drewbie = new Waiter("Drewbie", (double) 0);
	static Menu men = new Menu();
	static Bill mybill = new Bill();
	
	
	public static void main(String[] args) 
	{
		men.displayMenu();
		
		
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();
		
		while (!choice.equals("no"))
		{	
			
			if (choice.equals("yes"))
			{	
			System.out.println("Which item would you like?"); // Do something
			int item = scan.nextInt();

			
			mybill.addOrder(men.items[item-1], men.prices[item-1] );
			int itemNum = item;
			mybill.viewBill();
			
			}
			else if (choice.equals("view"))
			{						
				// Do something
			}
			else
				System.out.println("Invalid input!");

		    men.displayMenu();
			choice = scan.next();
		}
			
		
	

}}
