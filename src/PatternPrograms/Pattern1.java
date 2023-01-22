package PatternPrograms;

//4 x 4 pattern
//* * * *
//* * * *
//* * * *
//* * * *
public class Pattern1 {

    public void printPattern(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
