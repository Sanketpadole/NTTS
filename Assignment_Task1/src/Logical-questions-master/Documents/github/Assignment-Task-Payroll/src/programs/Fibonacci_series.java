package programs;

public class Fibonacci_series {
//	public static void main(String[] args) {
//		int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
//
//		while (i <= n) {
//			System.out.print(firstTerm + ",");
//
//			int nextTerm = firstTerm + secondTerm;
//
//			firstTerm = secondTerm;
//			secondTerm = nextTerm;
//
//			i++;
//
//		}
//		System.out.println("fibonacii series" + n);
//	}
	
//	public static void main(String[] args) {
//		int i=1,n=10,firstTerm=0,secondTerm=1;
//		while(i<=n) {
//			System.out.println(firstTerm);
//			int nextTerm=firstTerm+secondTerm;
//			firstTerm=secondTerm;
//			secondTerm=nextTerm;
//			i++;
//		}
//		System.out.println("fibonacci series"+n);
//	}
	
	
	public static void main(String[] args) {
		int n=10, firstNum=0,secNum=1;
		for(int i=0;i<=n;i++) {
			System.out.println(firstNum);
			int nxtNum=firstNum+secNum;
			firstNum=secNum;
			secNum=nxtNum;
		
		}
		System.out.println("fibonacci series"+n);
	}

}
