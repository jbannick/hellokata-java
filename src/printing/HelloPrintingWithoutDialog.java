
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.print.PrintService;

public class HelloPrintingWithoutDialog implements Printable{
	
	public HelloPrintingWithoutDialog() {
		PrintService ps = getPrintService();
		PrinterJob   job = PrinterJob.getPrinterJob();
		try {
			job.setPrintService(ps);
			job.setPrintable(this);
			job.print();
		} catch (PrinterException e) {
			e.printStackTrace();
		}
	}
	
	public PrintService getPrintService() {
		PrintService[] services = PrinterJob.lookupPrintServices();
		
		for (PrintService service : services) {
			System.out.println(service.getName());
		}
		
		return services[0];
	}
	
	@Override
	public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
		if (page > 0) {
			return NO_SUCH_PAGE;
		}
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.translate(pf.getImageableX(), pf.getImageableY());
		
		g.setFont(new Font("Verdana", Font.PLAIN, 12));
		g.drawString("Hello Printing without Dialog!", 0, 10);
		
		return PAGE_EXISTS;
	}
	public static void main(String...args) {
		System.out.println("Hello Printing without Dialog!");

		new HelloPrintingWithoutDialog();
	}
}
