package pomClasses;

import java.util.Date;

public class BuyModulePOM {
	
	
	public static void main(String[] args) {
		Date d = new Date();
		String str = d.toString();
		
	    str= str.replace(" ", "_");
	    
	    str=str.replace(":", "_");
	    System.out.println(str);

		
	}

}
