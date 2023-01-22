package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Count the total number of times each character occurs in
 * a given string
 */
public class CountCharacters {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String input = scan.nextLine();
            countCharacters(input);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void countCharacters(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0 ; i < input.length(); i++){
            char c = input.charAt(i);

            // We don't need to count spaces
            if(c == ' ')
                continue;

            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else{
                map.put(c, 1);
            }
        }

        // Retrieving Key and Values from the Map
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for(Map.Entry<Character, Integer> entry: set){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
