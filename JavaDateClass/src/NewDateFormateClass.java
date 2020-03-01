import java.text.DateFormat;
import java.util.Date;

public class NewDateFormateClass {

	public static void main(String[] args) {

  Date currentDate=new Date();
  System.out.println("default date:  "+currentDate);
  
  String  dateToStr=DateFormat.getInstance().format(currentDate);
  System.out.println(dateToStr);
  
  dateToStr=DateFormat.getTimeInstance().format(currentDate);
  System.out.println(dateToStr);
  
  
   dateToStr=DateFormat.getDateInstance().format(currentDate);
  System.out.println(dateToStr);
  
	}

}
  