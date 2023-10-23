package logical.programs;

public class DuplicateElement {
	public static void main(String[] args) {
		int arr[]= {3,4,5,9,8,5,3};
		
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicates are"+arr[j]);
				}
			}
		
		
	}
	
	//####Important
	
//	*****If there is loop inside loop then first it will completely iterate inside loop then it wiwll start iterating outside loop
	
	
//public static void main(String[] args) {  
//    //Initialize array  
//    int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
//    System.out.println("Duplicate elements in given array: ");  
//    //Searches for duplicate element  
//    for(int i = 0; i < arr.length; i++) {  
//        for(int j = i + 1; j < arr.length; j++) {  
//            if(arr[i] == arr[j])  
//                System.out.println(arr[j]);  
//        }  
//    }  
//}  

}
