package PatternPrograms;

// Inverted Triangle Pattern
//* * * * *
//  * * *
//    *
public class Pattern8 {
    public void printPattern(int n){
        int k = 1;
        for(int i = 0 ; i < n ; i++){

            // If you don't want spaces after each * then print
            // only 1 space if you want spaces after each star
            // then print two spaces

            // For space
            for(int j = 0 ; j < i ; j++){
                System.out.print("  ");
            }

            // Star
            for(int j = 0 ; j < (2 * n) - k; j++){
                System.out.print("* ");
            }

            // OR (without using k variable)
//            for(int j = 0 ; j < (2 * n) - (2 * i) - 1; j++){
//                System.out.print("* ");
//            }

            // For space
            for(int j = 0 ; j < i ; j++){
                System.out.print("  ");
            }
            System.out.println();
            k = k + 2;
        }
    }
}
