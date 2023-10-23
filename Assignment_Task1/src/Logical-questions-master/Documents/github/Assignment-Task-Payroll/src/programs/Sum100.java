package programs;

public class Sum100 {

	public static void main(String[] args) {
		int[] num = { 80, 60, 10, 50, 30, 100, 0, 50 };

		for (int i = 0; i <=num.length; i++) {
			for (int j = i+1; j <= num.length; j++) {
				if (num[i] + num[j] == 100) {
					System.out.println("numbers" + num[i] + "vgv" + num[j]);

				}
				//System.out.println("numbers" + i + "vgv" + j);
			}
		}
	}
}
