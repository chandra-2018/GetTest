
public class CharrArrayAsString {

	public static void main(String[] args) {
		char []ch= {'j','a','v','a'};
		String sh =new String(ch);
		String sh1 =new String("java1");
		String sh2="java2";
		System.out.println(sh.charAt(3));
		System.out.println(sh1.length());
		System.out.println(sh1.substring(0));
		System.out.println(sh1.substring(0 ,2));
		System.out.println(sh1.contains("av"));

	    System.out.println(sh1.contentEquals(sh));
	    System.out.println(sh1.equalsIgnoreCase(sh2));
	    sh1=" ";
	    System.out.println(sh1.isEmpty());
	    
	    String java=" java  ";
	    String language="is a programming language";
	    java.concat(language);
	   String concat =java.concat(language);
		System.out.println(concat);
		System.out.println(java.trim());
		String concat1=java.trim().concat(language);
		System.out.println(concat1);
		String replace=java.replace('a', 'e');
		System.out.println(java);
		System.out.println(replace);
		System.out.println(java.replace("av","  "));
		
		System.out.println(java.indexOf('a'));
		System.out.println(java.indexOf("av"));
		System.out.println(java.indexOf('a',3));
		System.out.println(java.indexOf("a",3));
       
		
		String greeting="Hello world!";
		System.out.println(greeting.substring(0,5));
		System.out.println(greeting.substring(6,12));

		String greeting1="Hello world!";
		//if(greeting==greeting1){
	    // System.out.println("is called");
		//}
		if(greeting.contentEquals(greeting1)) {
			System.out.println("is called");
		}
		String checkNull=null;
		if(checkNull !=null &&!checkNull.isEmpty()) {
			System.out.println("is not Null and Empty");
		}
		String abc="ACE";
		String bcd="BCD";
		System.out.println(abc.compareTo(bcd));
		
}
}
