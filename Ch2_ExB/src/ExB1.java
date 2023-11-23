public class ExB1 {

	public static void main(String[] args) {
		
		int i1 = 1;
		if (++i1 == 1) {
		   System.out.println("one");
		} else if (i1==2) {
		   System.out.println("two");
		} else {
		   System.out.println("other");
		}
		
		boolean b = false;
		if (b=true) System.out.println("true");
		else System.out.println("false");
		
		String name = "Lion";
		int score = 100;
		if (!name.equals("Lion"))
		   score = 200;
		   name = "Larry";
		System.out.println(name + " has score " + score);
		
		int i=0;
		//if (i=10) {System.out.println("ten");}


	}
}
