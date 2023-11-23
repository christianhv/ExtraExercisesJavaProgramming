public class TestPal {

    public static void main(String[] args) {

        String[] palArray = {"kok", "pap", "lepel", "droomoord", "legerregel", "tacocat", null, "negen", "error", "lol",
                "meetsysteem", "legovogel", "", "palindroom","parterretrap", "tarwewrat", "kayak", "racecar", "a"};

        int counter = 0;
        for (String pal: palArray){
            if (Palindrome.isPalindrome(pal)){
                System.out.println(pal);
            }
        }
        System.out.println("There were " + Palindrome.countNumberOfPalindromes(palArray) + " palindromes in the list.");
    }
}

