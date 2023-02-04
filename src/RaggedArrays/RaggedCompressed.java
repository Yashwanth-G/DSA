package RaggedArrays;

import java.util.Scanner;

public class RaggedCompressed {

    // Prints the Ragged array
    public static void printArray(int[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] != Integer.MAX_VALUE)
                    System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    // This method will remove all the duplicates in the given 1D array and
    // returns the new array without duplicates
    public static int[] removeDuplicates(int[] arr){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    arr[j] = Integer.MAX_VALUE;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != Integer.MAX_VALUE){
                ++count;
            }
        }
        int k = 0;
        int res[] = new int[count];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != Integer.MAX_VALUE){
                res[k++] = arr[i];
            }
        }
        return res;
    }

    // This method will remove the duplicates in all the rows in the given ragged array
    private static int[] removeDuplicateInRaggedArray(int[][] arr, int[] count) {
        for(int i = 0 ; i < arr.length ; i++){
            // removeDuplicates will return the count of removed elements
            // we are passing 1D array input to remove duplicates in each row
            int res[] = removeDuplicates(arr[i]);
            count[i] = arr[i].length - res.length;
            arr[i] = res;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = scan.nextInt();
        int[][] arr = new int[n][];
        int count[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter size of elements in "+(i + 1)+" row: ");
            arr[i] = new int[scan.nextInt()];
        }

        for(int i = 0 ; i < n; i++){
            System.out.println("Enter row "+(i + 1)+" elements: ");
            for(int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Ragged Array Before: ");
        printArray(arr);
        System.out.println();
        int res[] = removeDuplicateInRaggedArray(arr, count);
        System.out.println("Ragged Array After: ");
        printArray(arr);
        System.out.println("Removed elements count: ");
        for(int i = 0 ; i < count.length; i++){
            System.out.print(count[i]+" ");
        }
    }
}
