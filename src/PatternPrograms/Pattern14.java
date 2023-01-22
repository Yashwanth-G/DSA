package PatternPrograms;

//A
//A B
//A B C
//A B C D
//A B C D E

public class Pattern14 {
    public void printPattern(int n){

        char c = 'A';

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print((c++)+" ");
            }
            System.out.println();
            c = 'A';
        }

        //OR
        //for(int i = 0 ; i < n ; i++){
        //            for(char ch = 'A'; ch < 'A' + i; ch++){
        //                System.out.print((ch+" ");
        //            }
        //            System.out.println();
        //        }


    }
}
