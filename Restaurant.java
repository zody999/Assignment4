import java.util.Random;


public class Restaurant {

	Waiter Bob = new Waiter("Bob", (double) 0);
	Waiter Drewbie = new Waiter("Drewbie", (double) 0);
	
	
	public static void main(String[] args) 
	{
		Random ranWaiter = new Random();
		int whichW = ranWaiter.nextInt(2);
		
		if(whichW == 0)
		{
			System.out.println("Hello! I'm Bob and I will be your server today!");
		}
		else
		{
			System.out.println("Greetings! My name is Drewbie, may I take your order?");
		}
		
		System.out.println("please choose menu items:");
		
		
		
	}

}
