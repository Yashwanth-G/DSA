package PatternPrograms;

// Triangle Pattern
//    *
//  * * *
//* * * * *
public class Pattern7 {
    public void printPattern(int n){
        for(int i = 0 ; i < n ; i++){

            // If you don't want spaces after each * then print
            // only 1 space if you want spaces after each star
            // then print two spaces
            // For space
            for(int j = 0 ; j < n - i - 1; j++){
                System.out.print("  ");
            }

            // Star
            for(int j = 0 ; j < 2 * i + 1; j++){
                System.out.print("* ");
            }

            // For space
            for(int j = 0 ; j < n - i - 1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
