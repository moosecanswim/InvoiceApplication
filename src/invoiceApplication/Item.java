package invoiceApplication;

public class Item {
	
	private int itemNumber;
	private double itemPrice;
	private String itemDescription;
	private double taxDue;
	private double totalDue;
	
	public Item(int inItemNumber, String itemDescription, double itemPrice, double taxDue){
		this.itemNumber = inItemNumber;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.taxDue = taxDue;
	}
	
	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	public double getTaxDue() {
		return taxDue;
	}

	public void setTaxDue(double taxDue) {
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
		String itemNumberString = EnglishNumberToWords.convert(Long.valueOf(itemNumber));  //use EnglishNumberToWords that i found online to come up with the english translation of an int
		String output = String.format("Item %s Description: %s | Price: $%.2f",itemNumberString,itemDescription,itemPrice);
		System.out.println(output);
		//System.out.println();
	}

	
	
	
}
