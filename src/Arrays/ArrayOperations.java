package Arrays;

import java.util.Scanner;

/**
 * This is kind of Set implementation in java using arrays where duplicates
 * elements are not allowed in the array.
 */
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter initial array size: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        int count = 0;
        System.out.print("Enter initial "+size+" elements: ");
        for(int i = 0 ; i < size; i++){
            int element = scan.nextInt();
            if(searchElement(arr, element) == -1){
                arr[i] = element;
                ++count;
            } else{
                System.out.print("Element "+element+" found more than once duplicate elements cannot be inserted into the array");
                break;
            }
        }
        while(true && count==size){
            System.out.println("1. Insert element at end\n2. Insert element at given position\n3. " +
                    "Delete given element\n4. Delete element at given position \n5. Search an element " +
                    "\n6. Display all the elements\n7. Return Array size\n8. Exit");
            boolean flag = false;
            int choice = scan.nextInt();
            if(choice == 8){
                break;
            } else{
                switch (choice) {
                    case 1:
                        System.out.print("Enter element to be inserted: ");
                        int ele1 = scan.nextInt();
                        arr = insert(arr, ele1);
                        System.out.println("Inserted element "+ele1+" in the array");
                        break;
                    case 2:
                        System.out.print("Enter position of the element to be inserted: ");
                        int pos1 = scan.nextInt();
                        System.out.print("Enter element to be inserted in position "+(pos1)+": ");
                        int ele2 = scan.nextInt();
                        int prevSize = arr.length;
                        arr = insertAtPosition(arr, pos1, ele2);
                        if(prevSize < arr.length)
                            System.out.println("Inserted element "+ele2+" at position "+(pos1)+" in the array");
                        break;
                    case 3:
                        System.out.print("Enter the element to be deleted: ");
                        int ele3 = scan.nextInt();
                        int preSize = arr.length;
                        arr = delete(arr, ele3);
                        if(preSize > arr.length)
                            System.out.println("Element "+ele3+" deleted from the array");
                        break;
                    case 4:
                        System.out.print("Enter position of the element to be deleted: ");
                        int pos2 = scan.nextInt();
                        int pSize = arr.length;
                        arr = deleteAtPosition(arr, pos2);
                        if(pSize > arr.length)
                            System.out.println("Element deleted at position "+(pos2)+" in the array");
                        break;
                    case 5:
                        System.out.print("Enter the element to search: ");
                        int search = scan.nextInt();
                        int position = searchElement(arr, search);
                        if(position != -1)
                            System.out.println("Element "+search+" found in the array at position: "+position);
                        else
                            System.out.println("Element "+search+" not found in the array");
                        break;
                    case 6:
                        displayAllElements(arr);
                        break;
                    case 7:
                        System.out.println("Currently array size is: "+arr.length);
                        break;
                    case 8:
                        flag = true;
                        break;
                }
            }
            if(flag)
                break;
        }
    }

    private static int[] deleteAtPosition(int[] arr, int pos2) {
        if(pos2 >= 1 && pos2 <= arr.length){
            int temp[] = new int[arr.length-1];
            for(int i = 0 ; i < pos2 ; i++){
                temp[i] = arr[i];
            }
            for(int i = pos2 + 1 ; i < arr.length; i++){
                temp[i - 1] = arr[i];
            }
            arr = temp;
        } else{
            System.out.println("Position cannot be less than 1 and greater than "+arr.length);
        }
        return arr;
    }

    private static int[] delete(int[] arr, int ele3) {
        int pos = searchElement(arr, ele3);
        if(pos != -1){
            arr = deleteAtPosition(arr, pos);
        } else{
            System.out.println("Element "+ele3+" not found");
        }
        return arr;
    }

    private static int searchElement(int[] arr, int ele3) {
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == ele3){
                return i;
            }
        }
        return -1;
    }

    private static int[] insertAtPosition(int[] arr, int pos1, int ele2) {
        if(pos1 >= 1 && pos1 <= arr.length){
            if(searchElement(arr, ele2) == -1){
                int temp[] = new int[arr.length + 1];
                for(int i = 0 ; i < pos1 - 1; i++){
                    temp[i] = arr[i];
                }
                temp[pos1 - 1] = ele2;
                for(int i = pos1 ; i < temp.length; i++){
                    temp[i] = arr[i-1];
                }
                arr = temp;
            } else{
                System.out.println("Element "+ele2+" found duplicate elements cannot be inserted into the array");
            }
        } else{
            System.out.println("Position cannot be less than 1 and greater than "+arr.length);
        }
        return arr;
    }

    private static void displayAllElements(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static int[] insert(int[] arr, int ele1) {
        if(searchElement(arr, ele1) == -1){
            int temp1[] = new int[arr.length + 1];
            for(int i = 0 ; i < arr.length ; i++){
                temp1[i] = arr[i];
            }
            temp1[temp1.length-1] = ele1;
            arr = temp1;
        } else{
            System.out.println("Element "+ele1+" found duplicate elements cannot be inserted into the array");
        }
        return arr;
    }
}
