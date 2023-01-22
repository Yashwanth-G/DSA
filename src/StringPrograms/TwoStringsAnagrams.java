package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

// String Anagrams: If you rearrange one string to get
// another
public class TwoStringsAnagrams {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String s1 = scan.nextLine();
            String s2 = scan.nextLine();
            System.out.println(isAnagram(s1.toLowerCase().replaceAll("\\s",""), s2.toLowerCase().replaceAll("\\s","")));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Anagram Logic using Sorting
    private static boolean isAnagram(String s1, String s2){

        if(s1.length() != s2.length())
            return false;

        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        s1 = new String(c1);

        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        s2 = new String(c2);

        return s1.equals(s2);
    }
}
