
public class StringBuilderClass {

	public static void main(String[] args) {
	

		  StringBuffer stbuf= new StringBuffer();
	      StringBuffer stbuf1=new StringBuffer("java iss aaprogramming language");
	      StringBuffer stbuf2=new StringBuffer(5);
		
	    System.out.println(stbuf);
	    System.out.println(stbuf1);
		System.out.println(stbuf2);
		stbuf2.append("java is a language");
		System.out.println(stbuf2);

		stbuf1.append("!");
		System.out.println(stbuf1);
		
		stbuf1.insert(5,"is");
		System.out.println(stbuf1);
		
		stbuf1.replace(5, 10, "is");
		System.out.println(stbuf1);
		
		stbuf2.delete(8, 10);
		System.out.println(stbuf2);
		
		stbuf2.reverse();
		System.out.println(stbuf2);
//		System.out.println(stbuf.capacity());
		
		stbuf.ensureCapacity(20);
		stbuf.append("java");
		System.out.println(stbuf.capacity());
		System.out.println(stbuf2.capacity());
		
		System.out.println(stbuf.charAt(2));
		
		stbuf1.substring(0,4);
		System.out.println(stbuf1);
		System.out.println(stbuf1.substring(0,4));
		
		
	}
	}

