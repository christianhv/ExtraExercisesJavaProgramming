public class ExB5a {

	public static void main(String[] args) {
		
		outerloop: for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (i * j > 4) {
					System.out.println("Breaking");
					break outerloop;
				}
				System.out.println(i + " " + j);
			}
		}
		System.out.println("Done");
		
	}

}
