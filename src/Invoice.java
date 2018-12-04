import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

public class Invoice {

	private String num_fact;
	private int year;
	private int month;
	private int day;
	private Date date;
	private String ship;
	private String shipTo;
	private InvoiceLine line[];
	private static final String FORMAT_STRING = "| %9s | %10s | %-30s | %13s | %8s | %13s " ;

	
	public Invoice(String num_fact, int year, int month, int day, String ship, String shipTo, InvoiceLine[] line) {
		this.num_fact = num_fact;
		this.year = year;
		this.month = month;
		this.day = day;
		this.date = createDate(year, month, day);
		this.ship = ship;
		this.shipTo = shipTo;
		this.line = line;
	}
	
	public static Date createDate(int year,int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		Date myDate = cal.getTime();
		return myDate;
	}
	
	static public String customFormat(String pattern, double value ){
		 DecimalFormat myFormatter = new DecimalFormat(pattern);
		 String output = myFormatter.format(value);
		 return output;
		 }
	
//	public String toString1() {
//		String s = String.format(FORMAT_STRING,
//				customFormat("###,###,###", num_fact));
//		return s;
//	}
	
	public String toString() {
		String s = "";
		for (int x = 0; x < line.length; x++) {
			s += line[x].toString();
			s += "\n";
		}
		s += "\n";

		s += date;
		return s;
	}
}
