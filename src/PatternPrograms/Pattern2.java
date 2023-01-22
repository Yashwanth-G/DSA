package PatternPrograms;

//*
//* *
//* * *
//* * * *

/**
 * Logic: row -> column, 0 -> 1, 1 -> 2, 2 -> 3. ,....
 */
public class Pattern2 {

    public void printPattern(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}