
public class Q8 {

	public static void main(String[] args) {
/*	int a[]= {9,8,7,6,5,4,3,2,1};
		for(int i=1;i<a.length;i++){
			
			for(int j=1; j<a.length;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		*/	
	
	int a=9;
	for(int i=1; i<=a;i++) {
		for( int j=a;j>=1;j--) {
			if(j<=i) {
				System.out.print(j);
			}else {System.out.print(" ");
			}
		}
	
			for( int j=2;j<=a;j++) {
				if(j<=i) {
					System.out.print(j);
				}else {System.out.print(" ");
				}
			}
			System.out.println();
	}
	for(int i=a-1; i>=1;i--) {
		for( int j=a;j>=1;j--) {
			if(j<=i) {
				System.out.print(j);
			}else {System.out.print(" ");
			}
		}
		for( int j=2;j<=a;j++) {
			if(j<=i) {
				System.out.print(j);
			}else {System.out.print(" ");
			}
		}
		System.out.println();
	}

	}
}