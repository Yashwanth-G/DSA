package StringPrograms;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String input = scan.nextLine();
            System.out.println(input.equalsIgnoreCase(reverseString(input)));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static String reverseString(String input) {
        String reverse = "";
        for(int i = input.length() - 1 ; i >= 0 ; i--){
            char c = input.charAt(i);
            reverse = reverse + c;
        }
        return reverse;
    }
}
