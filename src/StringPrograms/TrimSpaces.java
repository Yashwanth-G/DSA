package StringPrograms;

public class TrimSpaces {
    // trim leading, trailing and multiple spaces
    static String trimSpaces(char[] a, int n) {
        int x = 0, y = 0;

        while (y < n) {
            while (y < n && a[y] == ' ') y++;             // skip spaces
            while (y < n && a[y] != ' ') a[x++] = a[y++]; // keep non spaces
            while (y < n && a[y] == ' ') y++;             // skip spaces
            if (y < n) a[x++] = ' ';                      // keep only one space
        }

        return new String(a).substring(0, x);
    }

}
