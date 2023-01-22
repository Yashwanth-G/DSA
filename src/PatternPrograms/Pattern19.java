package PatternPrograms;

//* * * * * * * * * *
//* * * *     * * * *
//* * *         * * *
//* *             * *
//*                 *
//*                 *
//* *             * *
//* * *         * * *
//* * * *     * * * *
//* * * * * * * * * *

public class Pattern19 {
    public void printPattern(int n){
        for(int i = 0 ; i < n ; i++){

            // Stars
            for(int j = 0 ; j < n- i; j++){
                System.out.print("* ");
            }

            // Spaces
            for(int j = 0 ; j < 2 * i ; j++){
                System.out.print("  ");
            }

            // Stars
            for(int j = 0 ; j < n- i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0 ; i < n ; i++){
            // Stars
            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }

            // Spaces
            for(int j = 0 ; j < (2 * n) - (2 * (i + 1)); j++){
                System.out.print("  ");
            }

            // Stars
            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
