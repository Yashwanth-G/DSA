package StringPrograms;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        // If you use Scanner using try-with resources then you don't need
        // to close it explicitly using finally block
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter String: ");
            String input = scan.nextLine();
            String reverseString = reverseStringUsingForwardLogic(input);
            System.out.println("Reversed String: "+reverseString);

            System.out.print("Reversed String using Recursion: ");
            reverseStringUsingRecursion(input);

            System.out.print("Reversed String using Built-in API: ");
            System.out.println(reverseStringUsingBuiltInAPI(input));

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static String reverseStringUsingBuiltInAPI(String input) {
        if(input == null || input.trim().isEmpty())
            System.out.println(input);

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        return sb.toString();
    }

    /**
     * String reverse using recursion
     * @param input
     */
    private static void reverseStringUsingRecursion(String input) {

        if(input == null || input.trim().isEmpty())
            System.out.println(input);

        // Recursive approach
        else {
            System.out.print(input.charAt(input.length()-1));
            reverseStringUsingRecursion(input.substring(0, input.length()-1));
        }
    }

    /**
     * String reverse using backward loop
     * @param input
     * @return
     */
    private static String reverseStringUsingForwardLogic(String input) {
        if(input == null || input.trim().isEmpty())
            return input;

        // Non-recursive approach
        String reverse = "";
        for(int i = input.length() - 1 ; i>=0 ; i--){
            char c = input.charAt(i);
            reverse = reverse + c;
        }
        return reverse;
    }
}

// Notes: In real-world we will be using the built-in methods
