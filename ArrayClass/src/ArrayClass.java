import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int intArr[]= {10,20,15,22,35};
		System.out.println(Arrays.asList(intArr));
		System.out.println(Arrays.binarySearch(intArr, 15));
		System.out.println(Arrays.binarySearch(intArr,0,5,35));
		
		
		int intArr1[]= {10,20,15,22,35};
		System.out.println(Arrays.compre(intArr,intArr1));
		System.out.println(Arrays.toString(intArr));
		int arr[]=Arrays.copyOf(intArr,2);
		System.out.println(Arrays.toString(arr));
	}

}
