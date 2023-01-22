package PatternPrograms;


//1
//2 2
//3 3 3
//4 4 4 4
public class Pattern4 {

    public void printPattern(int n){
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}