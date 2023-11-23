public class ExB2 {

	public static void main(String[] args) {
		
		short x1 = 5;
		switch (x1) {
		  case 4: System.out.println("four");
		  case 5: System.out.println("five");
		  case 6: System.out.println("six");
		  default: System.out.println("other");
		}

		/*String x2 = "5";
		switch (x2) {
		  case 4: System.out.println("four");
		  case 5: System.out.println("five");
		  case 6: System.out.println("six");
		  default: System.out.println("other");
		}*/

		String x3 = "five";
		switch (x3) {
		  case "four": System.out.println("four"); break;
		  case "five": System.out.println("five"); break;
		  case "six": System.out.println("six"); break;
		  default: System.out.println("other"); break;
		}

		String x4 = "five";

		switch (x4) {
		  case "four": System.out.println("four"); break;
		  default: System.out.println("other"); break;
		  case "five": System.out.println("five"); break;
		  case "six": System.out.println("six"); break;
		}


		final int i = 6 ;short x5 = 5;
		switch (x5) {
		  case 4: System.out.println("four");
		  case 5: System.out.println("five");
		  case i: System.out.println("six");
		  default: System.out.println("other");
		}





		
		
		

		

	}

}
