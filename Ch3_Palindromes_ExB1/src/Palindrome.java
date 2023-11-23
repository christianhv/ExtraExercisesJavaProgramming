public class Palindrome {

    public static  boolean isPalindrome(String word) {
        boolean retval=false;

        if (word != null && !word.equals("") && word.length()!=1) {
            StringBuilder sb = new StringBuilder(word);
            StringBuilder sbrev = new StringBuilder(word).reverse();
            retval=sb.toString().equals(sbrev.toString());
        }

        return retval;
    }

    public static int countNumberOfPalindromes(String[] palindromes){
        int counter = 0;
        for (String pal: palindromes){
           if (Palindrome.isPalindrome(pal)){
                counter++;
            }
        }
        return counter;
    }


}

