package StringPrograms;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String input = scan.nextLine();

            splitStringCommaDelimiter(input);
            splitStringTabDelimiter(input);
            splitStringPipedDelimiter(input);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void splitStringPipedDelimiter(String input) {
        if(input == null || input.isEmpty())
            System.out.println(input);

        String delimiter = ",";

        String[] splitStringArray = input.split(delimiter);
        for(String s : splitStringArray)
            System.out.print(s+" ");
        System.out.println();
    }

    private static void splitStringTabDelimiter(String input) {
        if(input == null || input.isEmpty())
            System.out.println(input);

        String tabDelimiter = "\t";

        String[] splitStringArray = input.split(tabDelimiter);
        for(String s: splitStringArray)
            System.out.print(s+" ");
        System.out.println();
    }

    private static void splitStringCommaDelimiter(String input) {
        if(input == null || input.isEmpty())
            System.out.println(input);

        String pipedDelimiter = "\\|";
        String splitStringArray[] = input.split(pipedDelimiter);
        for(String s : splitStringArray)
            System.out.print(s+" ");
        System.out.println();
    }
}
