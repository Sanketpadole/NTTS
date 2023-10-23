package programs;

public class SumOfArray {
	int a[]= {2,3,46,78,9};
	int sum=0;
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;i++) {
			sum=a[i]+a[j];
			
		}
		System.out.println("sum"+sum);
	}
}
}


