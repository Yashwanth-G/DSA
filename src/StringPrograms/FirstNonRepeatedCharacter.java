package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String input = scan.nextLine();
            System.out.println(firstNonRepeatingUsingMap(input));
            System.out.println(firstNonRepeatingUsingCustomLogic(input));
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Using indexOf() and lastIndexOf() methods of string class
    // if both the methods return same value then the character is
    // present only once in the string.
    private static char firstNonRepeatingUsingCustomLogic(String input) {
        if(input == null || input.trim().isEmpty())
            return ' ';

        for(int i = 0 ; i < input.length(); i++){
            Character ch = input.charAt(i);
            if(input.indexOf(ch) == input.lastIndexOf(ch)){
                return ch;
            }
        }
        return ' ';
    }

    private static char firstNonRepeatingUsingMap(String input) {

        if(input == null || input.trim().isEmpty())
            return ' ';

        // Using LinkedHashMap to maintain the insertion order
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for(int i = 0 ; i < input.length(); i++){
            Character ch = input.charAt(i);
            // If character found in map increment the count
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else{
                map.put(ch, 1);
            }
        }
        // Iterate the above map and find the first character with count value 1
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return ' ';
    }
}
