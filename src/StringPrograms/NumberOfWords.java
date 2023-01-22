package StringPrograms;

import java.util.Scanner;

/**
 * Count Number of words in a given String
 */
public class NumberOfWords {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String input = scan.nextLine();

            countWordsUsingBuiltInMethods(input);
            countWordsUsingCustomLogic(input);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void countWordsUsingCustomLogic(String input) {
        if(input == null || input.trim().isEmpty())
            System.out.println(input);

        int words = 0;
        char charArray[] = new char[input.length()];
        for(int i = 0 ; i < input.length(); i++){
            charArray[i] = input.charAt(i);
            // This check is necessary so that we do not try to read
            // beyond the string length
            if(i + 1 < input.length()){
                charArray[i+1] = input.charAt(i+1);
            }
            /**
             * Here we have logic is that after reading the last character in a
             * word it should be followed by either space or tab, in that case
             * we increment the count value by one
             */
            if((i + 1 < input.length() &&(charArray[i] != ' ' && charArray[i] != '\t' )
            && (charArray[i + 1] == ' ' || charArray[i + 1] == '\t') ||
                    (i + 1 == input.length() && charArray[i] != ' '))){
                words++;
            }
        }
        System.out.println(words);
    }

    // Using split method with space delimiter to count words
    // the delimiter \\s+ means one or more spaces between the words.
    // If there are multiple spaces then also it will count as one word
    // and split the string.
    private static void countWordsUsingBuiltInMethods(String input) {
        if(input == null || input.trim().isEmpty())
            System.out.println(input);
        String[] wordsArray = input.split("\\s+");
        int countWords = wordsArray.length;
        System.out.println(countWords);
    }
}
