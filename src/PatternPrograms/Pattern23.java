package PatternPrograms;

//The ASCII value of the lowercase alphabet is from 97 to 122.
// And, the ASCII value of the uppercase alphabet is from 65 to 90.

//N is: 4
//A B C D
//A B C
//A B
//A
//A
//A B
//A B C
//A B C D
public class Pattern23 {
    public static void printPattern(char ch){
        int n;
        if((int)ch >= 65 && (int)ch <= 90){
            n = (int)ch - 'A';
            for(int i = 0 ; i < 2 * n ; i++){
                for(char c = 'A'; c <= ch; c++){
                    System.out.print(c+" ");
                }
                if(i < n -1) ch--;
                else if(i >= n) ch++;
                System.out.println();
            }
        } else{
            n = ((int)ch - 'a') + 1;
            for(int i = 0 ; i < 2 * n ; i++){
                for(char c = 'a'; c <= ch; c++){
                    System.out.print(c+" ");
                }
                if(i < n -1) ch--;
                else if(i >= n) ch++;
                System.out.println();
            }
        }
    }
}
