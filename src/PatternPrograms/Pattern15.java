package PatternPrograms;

//A B C D E
//A B C D
//A B C
//A B
//A

public class Pattern15 {
    public void printPattern(int n){
        for(int i = n ; i > 0 ; i--){
            for(char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
