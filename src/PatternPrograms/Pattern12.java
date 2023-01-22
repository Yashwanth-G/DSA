package PatternPrograms;

//1             1
//1 2         2 1
//1 2 3     3 2 1
//1 2 3 4 4 3 2 1

public class Pattern12 {
    public void printPattern(int n){
        int k = (n - 1) * 2;
        for(int i = 0 ; i < n ; i++){

           // For Number
           for(int j = 0 ; j <= i ; j++){
               System.out.print(j+1+" ");
           }

           // For space
           for(int j = 0 ; j < 2 * k; j++){
              System.out.print(" ");
           }

           // For Number
           for(int j = i + 1 ; j > 0  ; j--){
               System.out.print(j+" ");
           }
           System.out.println();
           k = k - 2;
        }
    }
}
