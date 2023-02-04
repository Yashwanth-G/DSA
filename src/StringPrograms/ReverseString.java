package StringPrograms;

public class ReverseString {

    // A function that reverses a whole sentence character by character
    public static void strRev(StringBuilder sb, int startRev, int endRev) {
        // Starting from the two ends of the list, and moving
        // in towards the centre of the string, swap the characters
        while (startRev < endRev) {
            char temp = sb.charAt(startRev); // temp store for swapping
            sb.setCharAt(startRev++, sb.charAt(endRev));
            sb.setCharAt(endRev--, temp);
        }
    }

}
