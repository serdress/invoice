import java.io.PrintStream;
import java.text.DecimalFormat;

public class InvoiceLine {

	public int quantity;
	public String itemCode;
	public String description;
	public float price;
	public float discountPercent;
	public static final String LINES = "-----------------------------------------------------------------------------------------------------------";
	private static final String FORMAT_STRING = "| %9s | %10s | %-30s | %13s | %8s | %13s " ;
	public static final String HEADER = LINES+ "\n" + String.format(FORMAT_STRING, "QTY", "Item #", "DESCRIPTION", "UNIT PRICE", "DISCOUNT", "LINE TOTAL") + "\n" + LINES;
	
	
	public InvoiceLine(int quantity, String itemCode, String description, float price, float discountPercent) {
		this.quantity = quantity;
		this.itemCode = itemCode;
		this.description = description;
		this.price = price;
		this.discountPercent = discountPercent;
		
	}
	public String toString() {
			String s = String.format(FORMAT_STRING,
					customFormat("###,###,###", quantity), 
					itemCode, 
					description,
					customFormat("$#,###,###.00", price), 
					customFormat("##.00%", discountPercent/100.0), 
					customFormat("$#,###,###.00", getTotalLine()));
			return s;
		}
	
	static public String customFormat(String pattern, double value ){
		 DecimalFormat myFormatter = new DecimalFormat(pattern);
		 String output = myFormatter.format(value);
		 return output;
		 }	
	
	public double getTotalLine() {
		return quantity * price * (100 - discountPercent)/100.0;
	}
}
