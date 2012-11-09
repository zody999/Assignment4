import java.util.ArrayList;


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

		for (int i = 0; i<orders.size();i++)
		{
			System.out.println("Item "+": "+orders.get(i) +"         $" + prices.get(i));
		}
		
		System.out.println();
		System.out.println("Total Price: "+ totalPrice);
		
		
		
	}
	
	
}
