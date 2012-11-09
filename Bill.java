import java.util.ArrayList;
import java.util.Scanner;


public class Bill {

	
	double totalPrice = 0;
	ArrayList orders = new ArrayList();
	ArrayList prices = new ArrayList();	
	

	
	public void addOrder(String order, double price)
	{
		orders.add(order);
		prices.add(price);
		
		totalPrice = totalPrice + price;
	}
	
	public void viewBill()
	{
		int itemNum = 1;
		for (int i = 0; i<orders.size();i++)
		{
			System.out.println("Item "+itemNum+": "+orders.get(i) +"         $" + prices.get(i));
		}
		
		System.out.println();
		System.out.println("Total Price: "+ totalPrice);
		itemNum++;
		
		
	}
	
	
	public double payBill(double payment)
	{	double tip = 0;
		if (payment < totalPrice)
		{
			Scanner scan = new Scanner(System.in);
			totalPrice = totalPrice - payment;
			System.out.println("That is not enough money. Pay more!! Please. ");
			payBill(scan.nextInt());
			
		}
		else if (payment > totalPrice) 
		{
			tip = payment - totalPrice;
			System.out.println("Thanks for the tip of $"+tip+"!");
			totalPrice = 0;
						
		}
		
		System.out.print("Thankyou for paying!");
		return tip;
		
		
	
		
	}
	
	
}
