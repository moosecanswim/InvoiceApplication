package invoiceApplication;

public class Item {
	
	private double itemPrice;
	private String itemDescription;
	private double taxDue;
	private double totalDue;
	
	public double getTaxDue() {
		return taxDue;
	}

	public void setTaxDue(double taxDue) {
		this.taxDue = taxDue;
	}

	public Item(String itemDescription, double itemPrice, double taxDue){
		
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.taxDue = taxDue;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public double getTotalDue() {
		return totalDue;
	}
	public void setTotalDue(double input){
		this.totalDue = input;
	}
	public double taxAndPrice(){
		return taxDue+itemPrice;
	}
	
	
	public void printItem(){
		String output = String.format("Item Description: %s | Price: $%.2f  | tax: $%.2f",itemDescription,itemPrice,taxDue);
		System.out.println(output);
		System.out.println();
	}

	
	
	
}
