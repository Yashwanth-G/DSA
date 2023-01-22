package PatternPrograms;

//4 x 4 pattern
//*
//* *
//* * *
//* * * *
public class Pattern6 {

    public void printPattern(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n - i ; j++){
                System.out.print(j + 1+" ");
            }
            System.out.println();
        }
    }
}