public class ExE1 {

    public static void main(String[] args) {
        int[] numbers = {3,5,6,8,10};

        int total = 0;

		/*for (int i=0; i<numbers.length; i++){
			total= total + numbers[i];
		}*/
        for (int val : numbers){
            total+=val;
        }

        double average = total*1.0/numbers.length;


        System.out.println("The average is: " + average);
    }
}
