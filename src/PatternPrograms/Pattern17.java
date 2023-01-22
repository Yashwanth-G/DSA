package PatternPrograms;

//        A
//      A B A
//    A B C B A
//  A B C D C B A
//A B C D E D C B A
public class Pattern17 {
    public void printPattern(int n){
        for(int i = 0 ; i < n ; i++){
            // If you don't want spaces after each * then print
            // only 1 space if you want spaces after each star
            // then print two spaces

            // For space
            for(int j = 0 ; j < n - i - 1; j++){
                System.out.print("  ");
            }

            // Characters
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for(int j = 1 ; j <= 2 * i + 1; j++){
                System.out.print(ch+" ");
                if(j <= breakpoint){
                    ch++;
                } else{
                    ch--;
                }
            }

            // For space
            for(int j = 0 ; j < n - i - 1; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
