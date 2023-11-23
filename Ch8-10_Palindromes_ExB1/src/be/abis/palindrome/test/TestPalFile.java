package be.abis.palindrome.test;

import be.abis.palindrome.exception.NotAPalindromeException;
import be.abis.palindrome.model.Palindrome;
import be.abis.palindrome.model.PalindromePhrase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class TestPalFile {

    public static void main(String[] args) {

        ArrayList<Palindrome> palArrList = new ArrayList<>();

        try (FileReader fr = new FileReader("Ch8-10_Palindromes_ExB1/src/palindromes.txt");
             BufferedReader br = new BufferedReader(fr);){
            String line=null;
            while((line=br.readLine())!=null){
                String trimmed = line.trim();
                Palindrome p=null;
                if(!trimmed.equals("") && !trimmed.equals("null")){
                    if (trimmed.indexOf(" ")>0){
                        p=new PalindromePhrase(trimmed);
                    } else {
                        p=new Palindrome(trimmed);
                    }
                    if (!palArrList.contains(p)) palArrList.add(p);
                }

            }

        int nrCorrectPalindromes = 0;
            int originalNrOfValues = palArrList.size();

        Iterator<Palindrome> palIter = palArrList.iterator();

        while (palIter.hasNext()){
            Palindrome p = palIter.next();
            try {
                p.isPalindrome();
                nrCorrectPalindromes++;
            } catch (NotAPalindromeException npe) {
                palIter.remove();
                System.out.println(p + npe.getMessage());
            }
        }

        for(Palindrome p : palArrList) {System.out.println(p);}

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

