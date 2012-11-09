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


			mybill.addOrder(men.items[item-1], men.prices[item-1] );
			int itemNum = item;
			mybill.viewBill();
			
			
			}
			else if (choice.equals("paybill") || choice.equals("PAYBILL"))
			{	// Do something
				
				System.out.println("Total Item Price: "+mybill.totalPrice);
				System.out.println("HST: "+ mybill.HST);
				System.out.println("Enter amount you want to pay");
				waiter.addTips(mybill.payBill(scan.nextInt()));
				
			}
			else
				System.out.println("Invalid input!");

		    men.displayMenu();
			choice = scan.next();
		
			
		}


		System.out.println();
		System.out.println("Thankyou for dining with us!");
		System.out.println();
		System.out.println(waiter.getName()+" was tipped "+waiter.returnTips());
		

}}