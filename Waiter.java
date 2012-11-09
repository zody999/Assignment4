
public class Waiter {

     public String name;
     public double tips = 0;
     
     
     public Waiter(String a, Double b) {
         name = a;
         tips = b;
     }
     
     public void addTips(double tip)
     {
    	 tips = tips + tip;
     }
     
     
     public double returnTips()
     {
    	 return tips;
     }
     
     public String getName()
     {
    	 return name;
     }

}
