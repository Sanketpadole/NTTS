package programs;

public class Number3 {
	public static void main(String[] args) {
		
	int rows=6;
	
	for (int i = 1; i <= rows; i++)
	{
	for (int j = rows; j >= i; j--)
	{
	System.out.print(j + " ");
	}
	System.out.println();
	}
	}
	

}
