
public class Menu {

	String[] items = new String[5];
	double[] prices = new double[5];
	
	public Menu()
	{	
		items[0] = "Beer";
		items[1] = "Pizza";
		items[2] = "Burgers";
		items[3] = "Tacos";
		items[4] = "Hotdogs";
		
		prices[0] = 9.99;
		prices[1] = 3.50;
		prices[2] = 5.00;
		prices[3] = 4.50;
		prices[4] = 2.50;
		
		
	}
	
	
	public void displayMenu()
	{
		System.out.print("Browse the Menu!: ");
		for (int i = 1; i<6; i++)
		{
			System.out.println(i+": "+items[i-1]);
			System.out.print("  -"+prices[i-1]);
		}
		
		
	}
	
	
	
}
