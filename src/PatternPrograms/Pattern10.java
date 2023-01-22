package PatternPrograms;

// Symmetric Pattern - there one line that differentiates
// the symmetry

//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
public class Pattern10 {
    public void printPattern(int n){
        for(int i = 0 ; i < 2 * n ; i++){

            int stars = i + 1;

            if(i >= n - 1)
                stars = 2 * n - i - 1;

            for(int j = 0 ; j < stars ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
