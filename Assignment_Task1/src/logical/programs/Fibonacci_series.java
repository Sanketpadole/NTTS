package logical.programs;

public class Fibonacci_series {

//	// 0, 1, 1, 2, 3, 5, 8, 13, 21,
	public static void main(String[] args) {
		int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
		System.out.println("fibonacii series" + n);

		while (i <= n) {
			System.out.print(firstTerm + ",");

			int nextTerm = firstTerm + secondTerm;

			firstTerm = secondTerm;
			secondTerm = nextTerm;

			i++;

		}
	}
}
	
	
	
	
//	public static void main(String args[]) {
//	       int n1 = 0, n2 = 1, n3, i, max = 5;
//	       System.out.print(n1 + " " + n2);
//	       for (i = 2; i < max; ++i) {
//	          n3 = n1 + n2;
//	          System.out.print(" " + n3);
//	          n1 = n2;
//	          n2 = n3;
//	       }
//	       
//	    }
//	
//	 }


//*****Logic*****
//
//1st term=0;2nd term=1;nxtterm=0+1;........0,1,1
//
//1st term=1;2nd term=1;nxtterm=1+1;.......0,1,1,2
//
//1st term=1;2nd term=2;nxtterm=1+2;....0,1,1,2,3
//
//1st term=2;2nd term=3;nxtterm=2+3;.....0,1,1,2,3,5

//		int i=1,n=10,firstTerm=0,secondTerm=1;
//		while(i<=n) {
//			int nextTerm=firstTerm+secondTerm;
//			firstTerm=secondTerm;
//			secondTerm=nextTerm;
//			i++;
//		}

//
//	}
//}
