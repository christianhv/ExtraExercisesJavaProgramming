public class ExB4 {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i += 2)
			System.out.println(i);

		for (int i = 0; i <= 5;) {
			System.out.println(i);
			i += 2;
		}

		for (int i = 1; i < 3; i++) {
			for (int j = 5; j > 0; j--) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println("------------------");
		for (int i = 1; i < 3; i++) {
			for (int j = 5; j > 0; j--) {
				if (i == j)
					break;
				System.out.println(i + " " + j);
			}
		}
		System.out.println("------------------");

		for (int i = 1; i < 3; i++) {
			for (int j = 5; j > 0; j--) {
				if (i == j)
					continue;
				System.out.println(i + " " + j);
			}
		}

	}
}
