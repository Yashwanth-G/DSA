package PatternPrograms;


//1
//1 2
//1 2 3
//1 2 3 4
public class Pattern3 {

    public void printPattern(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
}