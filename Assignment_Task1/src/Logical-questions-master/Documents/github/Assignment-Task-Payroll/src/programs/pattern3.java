package programs;

public class pattern3 {
	
	
//	public static void main(String args[])   
//	{    
//	//i for rows and j for columns      
//	//row denotes the number of rows you want to print  
//	int i, j, row = 6;       
//	//Outer loop work for rows  
//	for (i=0; i<row; i++)   
//	{  
//	//inner loop work for space      
//	for (j=row-i; j>1; j--)   
//	{  
//	//prints space between two stars  
//	System.out.print(" ");   
//	}   
//	//inner loop for columns  
//	for (j=0; j<=i; j++ )   
//	{   
//	//prints star      
//	System.out.print("* ");   
//	}   
//	//throws the cursor in a new line after printing each line  
//	System.out.println();   
//	}   
//	}  
	
	
	
//	public static void main(String[] args) {
//	       int rows=6;
//	       for(int i=0;i<=rows;i++){
//	           for(int j=rows-i;j>1;j--){
//	               System.out.print(" ");
//	           }
//	               for(int j=0;j<=i;j++){
//	                   System.out.print(" *");
//	               }
//	               System.out.println();
//	           }
//	       }
//	   }
	
	
	
		public static void main(String[] args) {
		       int rows=6;
		       for(int i=0;i<=rows;i++){
		           for(int j=2*(rows-i);j>=1;j--){
		               System.out.print(" ");
		           }
		           for(int j=0;j<=i;j++){
		               System.out.print(" *");
		           }
		           System.out.println();
		       }
		       
		   }
	}
	
	
	
	
	
	
	
	
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
//* * * * * * 
	  




//
//
//int rows=5;
//for(int i=1;i<=rows;i++) {
//	for(int j=1;j<=i;j++) {
//		System.out.print("* ");
//	}
//	System.out.println();
//}
//}