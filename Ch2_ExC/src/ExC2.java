import java.util.Arrays;

public class ExC2 {

	public static void main(String[] args) {

		String[] a1 = new String[3];
		// a1[0] = null;
		a1[1] = "this";
		a1[2] = "is";
		// for (String s: a1) {System.out.println(s.toUpperCase());}

		String[][] a2 = { { "this", "is", "an" }, { "array" } };
		System.out.println(a2[1][0]);

		String a3[] = new String[3];
		a3[0] = "el1";
		a3[1] = "el2";
		// System.out.println(a3.length());

		int[] arr[] = new int[2][];
		arr[0] = new int[] { 1, 2, 3 };
		// arr[1] = {5,2};
		// System.out.println(arr[0][1]==arr[1][0]);

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = arr1;
		arr2[1] = 4;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(Arrays.toString(arr1));

	}

}
