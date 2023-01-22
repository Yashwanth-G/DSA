package PatternPrograms;

public class Pattern18 {
    public void printPattern(int n){
        for(int i = 0 ; i < n ; i++){
            char ch = (char) (('A' + n - 1) - i);
            for(int j = 0 ; j <= i ; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
