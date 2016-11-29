import java.util.*;


public class void CheckOut {
	
	Scanner scan = new Scanner(System.in);
	
	
		
		int[] cart = new int [99];		//initiating shopping cart (contains item numbers)
		double[] cartQw = new double [99]; //initiating quantity/weight.
		int i = 0;
		
		while ( i < 99 ) { 
		System.out.println("Ange artikelnummer (eller A för alternativ: ");
		cart [i] = scan.nextInt();//reads item
		
		System.out.println("Ange antal eller vikt (default = 1): ");
		cartQw[i] = 1;					//default = 1
		cartQw[i] = scan.nextDouble();//reads quantity or weight
		
		System.out.println( "Vara: " + itemName [cart[i]]);
		System.out.println( "Antal/vikt: " + cartQw[i]);
		
		i++;
		}
	}	
	
	
	Date saleDate = new Date() {};	// Instantiate a Date object
    
	
	
	addItem()
    
    
    
    
   // System.out.println(saleDate.toString());	// display time and date using toString()
	
	
	

}
