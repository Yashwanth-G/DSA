import java.util.Scanner;

public class DoubleLinkedList {

    Node head;

    public Node addToStart(int val){
        Node n = new Node(val);
        if(head != null) {
            head.prev = n;
            n.next = head;
        }
        head = n;
        return head;
    }

    public void displayFromFront(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
        } else{
            boolean flag = true;
            while(temp != null){
                if(flag == true){
                    System.out.print(temp.val);
                    flag = false;
                } else{
                    System.out.print(" "+temp.val);
                }
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void displayFromEnd(){
        Node temp = head;
        if(temp == null)
            System.out.println("List is empty");
        else{
            // if there is only one element in list and if we delete that
            // then we get null pointer exception to handle that
            // we need temp!= null condition.
            while(temp != null && temp.next != null){
                temp = temp.next;
            }
            Node prevItr = temp;
            boolean flag = true;
            while(prevItr != null){
                if(flag == true){
                    System.out.print(prevItr.val);
                    flag = false;
                } else{
                    System.out.print(" "+prevItr.val);
                }
                prevItr = prevItr.prev;
            }
            System.out.println();
        }
    }

    public int size(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void addToEnd(int val){
        Node n = new Node(val);
        if(head == null){
            head = n;
        } else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = n;
            n.prev = temp;
        }
    }

    public Node find(int val, Node head){
        Node found = null, temp = head;
        while(temp != null){
            if(temp.val == val){
                found = new Node(temp.val);
                // Below line is imp
                // Without the below the links are not properly connected
                // to the found node
                found = temp;
            }
            temp = temp.next;
        }
        return found;
    }

    public Node findFirst(int val, Node head){
        Node found = null, temp = head;
        while(temp != null){
            if(temp.val == val){
                found = new Node(temp.val);
                // Below line is imp
                // Without the below the links are not properly connected
                // to the found node
                found = temp;
                break;
            }
            temp = temp.next;
        }
        return found;
    }

    public void deleteLastOccurrence(int val){
        Node n = find(val, head);
        if(n == null){
            System.out.println("Given element doesn't exists");
        } else {
            Node temp = n.prev;
            if(n == head){
                head = head.next;
                // the if condition is necessary because if there is only one node in the list and
                // if we delete that then we get null pointer exception without the below condition.
                if(head != null)
                    head.prev = null;
            } else{
                temp.next = n.next;
                if(n.next != null)
                    n.next.prev = temp;
            }
        }
    }

    public void deleteFirstOccurrence(int val){
        Node n = findFirst(val, head);
        if(n == null){
            System.out.println("Given element doesn't exists");
        } else {
            Node temp = n.prev;
            if(n == head){
                head = head.next;
                // the if condition is necessary because if there is only one node in the list and
                // if we delete that then we get null pointer exception without the below condition.
                if(head != null)
                    head.prev = null;
            } else{
                temp.next = n.next;
                if(n.next != null)
                    n.next.prev = temp;
            }
        }
    }

    public void deleteAllOccurrences(int val){
        Node n = new Node();
        boolean flag = false;
        do{
            n = head;
            n = find(val, n);
            if(n == null){
                if(flag == false)
                    System.out.println("Given element doesn't exists");
            } else {
                flag = true;
                Node temp = n.prev;
                if(n == head){
                    head = head.next;
                    // the if condition is necessary because if there is only one node in the list and
                    // if we delete that then we get null pointer exception without the below condition.
                    if(head != null)
                        head.prev = null;
                } else{
                    if(temp != null)
                        temp.next = n.next;
                    if(n.next != null)
                        n.next.prev = temp;
                }
                System.out.println("Deleted: "+val);
            }
        } while(n != null);
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);
        System.out.println("******** Double Linked List *********");
        boolean exitFlag = false;
        while(true){
            System.out.println("1. Insert at Front");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete First Occurrence");
            System.out.println("4. Delete Last Occurrence");
            System.out.println("5. Delete All Occurrences");
            System.out.println("6. Search for an Element");
            System.out.println("7. Display from front");
            System.out.println("8. Display from last");
            System.out.println("9. Length of the list");
            System.out.println("10. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Enter elements one-by-one (space separated): ");
                    String elements = scan.nextLine();
                    String input[] = elements.split("\\s");
                    for(int i = 0 ; i < input.length; i++){
                        dll.addToStart(Integer.parseInt(input[i]));
                    }
                    break;
                case 2:
                    System.out.print("Enter elements one-by-one (space separated): ");
                    String element = scan.nextLine();
                    String in[] = element.split("\\s");
                    for(int i = 0 ; i < in.length; i++){
                        dll.addToEnd(Integer.parseInt(in[i]));
                    }
                    break;
                case 3:
                    System.out.print("Enter element to delete: ");
                    int key = scan.nextInt();
                    dll.deleteFirstOccurrence(key);
                    break;
                case 4:
                    System.out.print("Enter element to delete: ");
                    int k = scan.nextInt();
                    dll.deleteLastOccurrence(k);
                    break;
                case 5:
                    System.out.print("Enter element to delete: ");
                    int val = scan.nextInt();
                    dll.deleteAllOccurrences(val);
                    break;
                case 6:
                    System.out.print("Enter element to search: ");
                    int m = scan.nextInt();
                    System.out.println((dll.find(m, dll.head) == null) ? "Element not found" : "Element found");
                    break;
                case 7:
                    dll.displayFromFront();
                    break;
                case 8:
                    dll.displayFromEnd();
                    break;
                case 9:
                    System.out.println("Size: "+dll.size());
                    break;
                case 10:
                    exitFlag = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            if(exitFlag == true)
                break;
        }
    }
}
