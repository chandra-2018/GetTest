import java.util.Date;

public class JavaDateClass {

	public static void main(String[] args) {
		Date dateNow= new Date();
System.out.println(dateNow);
	Date DateNow2 =new Date(9999999);
	System.out.println(DateNow2);
		
	Date DateNow3=new Date();
	//System.out.println(DateNow3);	
		
		DateNow3.setYear(512);
		System.out.println(DateNow3.toGMTString());
		
		
		Date dateNow3=new Date(500,10,5,45,10);
		System.out.println(dateNow3);
		System.out.println(dateNow3.toGMTString());
		
		System.out.println(dateNow.after(new Date()));
		System.out.println(dateNow.before(new Date()));
		
		System.out.println(DateNow2.compareTo(dateNow3));
		System.out.println(dateNow.getTime());
		
		Date newDate=new Date(15828150136761);
		String Date
		
		
		
	}

}