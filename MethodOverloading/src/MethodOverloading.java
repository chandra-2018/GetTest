
public class MethodOverloading {
public static void main(String[]args) {
	
	AdditionOperation addition= new AdditionOperation();
	System.out.println(addition.add());
	System.out.println(addition.add(5));
	System.out.println(addition.add(2.2f));
	System.out.println(addition.add(3,6));
	
	
	
	
	multiplicationOperation mul=new multiplicationOperation();
	mul.multiplication(2l, 3l);
	mul.multiplication(2,3,5);
	
}


}
