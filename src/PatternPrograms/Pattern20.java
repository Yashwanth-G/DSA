package PatternPrograms;

//*                 *
//* *             * *
//* * *         * * *
//* * * *     * * * *
//* * * * * * * * * *
//* * * *     * * * *
//* * *         * * *
//* *             * *
//*                 *

public class Pattern20 {
    public void printPattern(int n){

        for(int i = 0 ; i < 2 * n -1 ; i++){

            // Stars
            int stars = i;
            for(int j = 0 ; j <= stars ; j++){
                System.out.print("* ");
                if(i >= n - 1){
                    stars = ((2 * (n - 1) ) - i) ;
                }
            }

            // Spaces
            for(int j = 0 ; j < Math.abs((2 * n) - (2 * (i + 1))); j++){
                System.out.print("  ");
            }

            // Stars
            for(int j = 0 ; j <= stars ; j++){
                System.out.print("* ");
                if(i >= n - 1){
                    stars = ((2 * (n - 1) ) - i) ;
                }
            }
            System.out.println();
        }
    }
}
