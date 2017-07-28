package invoiceApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceApplication {
	
	
	/***
	 * This application will ask the user for the going tax rate
	 * Then prompt the user for an item description and price.
	 * Then the application will ask if they want to add another item.  As long as they want to we will add items.
	 * Once the user does not want to continue the application will process the items and print each item, item price and the final amount due and tax due
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		ArrayList<Item> itemList = new ArrayList();
		double totalTax=0.0;
		double totalDue = 0.0;
		Scanner scan = new Scanner (System.in);
		int itemCount = 0;
		String resp = "y";
		
		//prompt the user for the tax rate and accept it
		System.out.println("First, tell me what the going tax rate is for this sale.  tell me as a %");
		double inTaxRate = scan.nextDouble();
		
		//keep asking for item descriptions and prices until the user says they dont want to continue
		do{
			itemCount++;
			String itemNumber = String.valueOf(itemCount);
			System.out.println("Please enter a product description: ");
			String itemDescription = scan.next();
			System.out.println("Please enter a product price: ");
			double itemPrice = scan.nextDouble();

			double taxDue = (inTaxRate/100)*itemPrice;
			
			

			Item newItem = new Item(itemCount,itemDescription, itemPrice, taxDue);
			newItem.setTotalDue(newItem.taxAndPrice());
			itemList.add(newItem);
			

			System.out.println("Would you like to add another item? (y/n)");
			resp = scan.next();


		}while(resp.equalsIgnoreCase("y"));

		
		//OUTPUT: go through the arraylist of Item s and print them out
		System.out.println("Invoice for " + itemList.size() + " Products");
		for(Item i: itemList){
			
			totalTax = totalTax+i.getTaxDue();
			totalDue = totalDue +i.getTotalDue();

			i.printItem();
			
		}
		//print the totals for tax due and total ammount due
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("Tax rate: " + inTaxRate + "%");
		System.out.println(String.format("Total Charged: $%.2f" , totalTax));
		System.out.println(String.format("Total Ammount Due: $%.2f" , totalDue));


		//System.out.println("Program Exiting");	
	}


}
