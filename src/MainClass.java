
public class MainClass {

	public static void main(String[] args) {

		InvoiceLine line1 = new InvoiceLine(1,"Elemento 1", "Aguacate", 5.5f, 0.5f);
		InvoiceLine line2 = new InvoiceLine(2,"Elemento 2", "Cuchillo jamon", 5.5f, 0.5f);
		InvoiceLine line3 = new InvoiceLine(3,"Elemento 3", "Web 2.9", 5.5f, 0.5f);
		InvoiceLine line4 = new InvoiceLine(4,"Elemento 4", "Martillo taladro", 5.5f, 0.5f);
		
		InvoiceLine lines[] = new InvoiceLine[]{line1,line2,line3,line4}; 

		Invoice invoice = new Invoice("4", 30, 1, 2014, "Pedro Juan Pascual", "Roberto López Rupert", lines);
		System.out.println(InvoiceLine.HEADER);
		//System.out.println(invoice.toString1());
		System.out.println(invoice.toString());
	}

}
