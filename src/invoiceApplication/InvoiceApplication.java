package invoiceApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceApplication {

	public static void main(String[] args) {
		ArrayList<Item> itemList = new ArrayList();
		double totalTax=0.0;
		double totalDue = 0.0;

		Scanner scan = new Scanner (System.in);
		System.out.println("First, tell me what the tax rate is where you ate.  tell me as a %");
		double inTaxRate = scan.nextDouble();


		String resp = "y";
		do{
			System.out.println("Please enter a product description: ");
			String itemDescription = scan.next();
			System.out.println("Please enter a product price: ");
			double itemPrice = scan.nextDouble();

			double taxDue = (inTaxRate/100)*itemPrice;
			
			

			Item newItem = new Item(itemDescription, itemPrice, taxDue);
			newItem.setTotalDue(newItem.taxAndPrice());
			itemList.add(newItem);
			

			System.out.println("Would you like to add another item? (y/n)");
			resp = scan.next();


		}while(resp.equalsIgnoreCase("y"));

		System.out.println("I have " + itemList.size() + " Products");
		for(Item i: itemList){
			totalTax = totalTax+i.getTaxDue();
			totalDue = totalDue +i.getTotalDue();

			System.out.println();

			//this is where we will print all the outputs
			i.printItem();
		}
		System.out.println(String.format("Total Tax: $%.2f" , totalTax));
		System.out.println(String.format("Total Ammount: $%.2f" , totalDue));


		System.out.println("Program Exiting");	
	}


}
