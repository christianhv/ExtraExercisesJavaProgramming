public class ExA4 {

	public static void main(String[] args) {
		System.out.println(5+3 == 5*4);
		// System.out.println(5+(3 == 5)*4);
		System.out.println("5"+(3 == 5)+"4");
		System.out.println(5*3 + "6");
		System.out.println("6" + 5 + 3*6);
		System.out.println( "6" + 5 + 3);
		System.out.println("6" + (5 + 3*6));
		
		byte i1 = 5; byte j1 = 6; //byte k = i1+ j1;
		
		int i2 = 5; int j2 = 6; 
		j2+=i2;
		//System.out.println(j2);
		int k2 = i2++ + ++j2;
		System.out.println(k2);
		
        boolean b= false;
		System.out.println(b=false);
		
		System.out.println( 5!=4?6:3);


	}

}
