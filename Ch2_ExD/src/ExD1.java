public class ExD1 {

	public static void main(String[] args) {
		
		String s = "testing java strings";
		System.out.println(s.charAt(1));
		//System.out.println(s.append(" 123"));
		System.out.println(s.indexOf("s",2));
		System.out.println(s.equals("testing java Strings"));
		// System.out.println(s.substr(3,6));
		System.out.println(s.concat("again").toUpperCase().replace("T","o").substring(4,7));

	}

}
