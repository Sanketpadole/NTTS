package logical.programs;

public class Reversedprogram2 {
	public static void main(String[] args) {
		int a=98765;
		int b;
		int reversed=0;
		while(a!=0) {
			b=a%10;
			reversed=reversed*10+b;
			a=a/10;
			
		}
		System.out.println("Reversed Number: " + reversed);

	}


	
//	public static void main(String[] args) {
//		
//		
//		int a=45678,reversed=0;
//		int b;
//		while(a!=0) {
//			
//		
//		 b=a%10;
//		 reversed=reversed*10+b;
//		 
//		 a=a/10;
//		}
//		System.out.println("Reversed Number: " + reversed);
//		}
//	}

	

}


