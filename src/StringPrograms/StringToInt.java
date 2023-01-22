package StringPrograms;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String input = scan.nextLine();
            System.out.println(returnIntegerUsingCustomLogic(input));
            System.out.println(returnIntegerUsingBuiltInMethod(input));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static Integer returnIntegerUsingBuiltInMethod(String input) {
        Integer i = Integer.parseInt(input);
        return i;
    }


    private static int returnIntegerUsingCustomLogic(String input) {

        int i = 0 ;
        int number = 0 ;

        boolean isNegative = false;
        int len = input.length();

        if(input.charAt(0) == '-'){
            isNegative = true;
            i = 1;
        }

        while(i < len){
            // for moving forward we multiply with 10
            number = number * 10;
            number += (input.charAt(i++)-'0');
        }

        // If number is negative again prefix with negative sign
        if(isNegative)
            number = -number;

        return number;
    }
}
