package logical.programs;

public class ReverseInteger {

//	public static void main(String[] args) {
//
//		int num = 1234, reversed = 0;
//
//		System.out.println("Original Number: " + num);
//
//		// run loop until num becomes 0
//		while (num != 0) {
//
//			// get last digit from num
//			int digit = num % 10;
//			// (1234%10=4)
//
//			reversed = reversed * 10 + digit;
//			// (0*10+4)
//
//			// remove the last digit from num
//			num /= 10;
//			// (1234/=10)=123
//
//		}
//
//		System.out.println("Reversed Number: " + reversed);
//	}
//
//}

	
	
	
	
	
//	public static void main(String[] args) {
//		int num=12345;
//		int reversed=0;
//		while(num !=0) {
//			
//		
//		int digit = num%10;
//		reversed=reversed*10+digit;
//		num=num/10;
//	}
//		System.out.println("Reversed Number: " + reversed);
//	}
	
	
	
	
	public static void main(String[] args) {
		int num=12345;
		int reversed=0;
		while(num!=0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			num=num/10;
			
		}
		System.out.println("Reversed Number: " + reversed);
	}
}
		









	
	
	
	
	
	
	
	
	
	
	
	
	
	

//Both for loop and while loop is used to execute the statements repeatedly while the
//program runs. The major difference between for loop and the while loop is that for loop is used when the number of iterations is known, whereas execution is done in the while loop until the statement in the program is proved wrong.
