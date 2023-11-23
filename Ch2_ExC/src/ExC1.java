import java.util.Arrays;

public class ExC1 {

	public static void main(String[] args) {
		int[] b = new int[10];
		for (int i = 0; i < b.length; i++) {
			b[i] = 1;
			System.out.print(b[i] + " - ");
		} 
		System.out.println(b);
		System.out.println(Arrays.toString(b));
		
		int[][] a = {{1, 2}, {3, 4}};
		a[1][1] = 5;

		
		
	}

}
