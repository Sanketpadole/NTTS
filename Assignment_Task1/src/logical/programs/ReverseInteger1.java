package logical.programs;

public class ReverseInteger1 {
	public static void main(String[] args) {
		
	
	int a=45678,reversed=0;
	int b;
	while(a!=0) {
		
	
	 b=a%10;
	 reversed=reversed*10+b;
	 
	 a=a/10;
	}
	System.out.println("Reversed Number: " + reversed);
	}
}


//public static void main(String[] args) {
//
//	int num = 1234, reversed = 0;
//
//	System.out.println("Original Number: " + num);
//
//	// run loop until num becomes 0
//	while (num != 0) {
//
//		// get last digit from num
//		int digit = num % 10;
//		// (1234%10=4)
//
//		reversed = reversed * 10 + digit;
//		// (0*10+4)
//
//		// remove the last digit from num
//		num /= 10;
//		// (1234/=10)=123
//
//	}
//
//	System.out.println("Reversed Number: " + reversed);
//}
//}