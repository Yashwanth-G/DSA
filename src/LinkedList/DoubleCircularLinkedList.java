import java.util.Scanner;

public class DoubleCircularLinkedList {

    Node head;

    public void addToStart(int val){
        Node n = new Node(val);
        if(head == null){
            n.next = n;
            n.prev = n;
            head = n;
        } else {
            Node lastNode = head.prev;
            n.next = head;
            n.prev = lastNode;
            head.prev = n;
            lastNode.next = n;
            head = n;
        }
    }

    public void displayFromFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        } else{
            Node temp = head;
            boolean flag = true;
            while(true){
                if(flag == true){
                    System.out.print(temp.val);
                    flag = false;
                } else{
                    System.out.print(" "+temp.val);
                }
                temp = temp.next;
                if(temp == head)
                    break;
            }
            System.out.println();
        }
    }

    public void displayFromEnd(){
        if(head == null){
            System.out.println("List is empty");
        } else{
            Node last = head.prev;
            boolean flag = true;
            while(true){
                if(flag == true){
                    System.out.print(last.val);
                    flag = false;
                } else{
                    System.out.print(" "+last.val);
                }
                if(last == head)
                    break;
                last = last.prev;
            }
        }
        System.out.println();
    }

    public void addToEnd(int val){
        Node n = new Node(val);
        if(head == null){
            n.prev = n;
            n.next = n;
            head = n;
        } else{
            Node last = head.prev;
            last.next = n;
            n.prev = last;
            n.next = head;
            head.prev = n;
        }
    }

    public Node find(int val){
        Node found = null;
        Node temp = head;
        while(true){
            if(temp != null && temp.val == val){
                found = new Node(temp.val);
                found = temp;
            }
            if(temp != null)
                temp = temp.next;
            if(temp == head)
                break;
        }
        return found;
    }

    public void deleteLastOccurrence(int val){
        Node search = find(val);
        if(search != null){
            if(search == head){
                Node last = head.prev;
                Node temp = head;
                head = head.next;
                if(temp == head) {
                    head.prev = null;
                    head.next = null;
                } else{
                    head.prev = last;
                    last.next = head;
                }
            } else{
                search.prev.next = search.next;
                search.next.prev = search.prev;
            }
        } else{
            System.out.println("Element not found");
        }
    }

    public int size(){
        int count = 0;
        Node temp = head;
        while(true){
            count++;
            temp = temp.next;
            if(temp == head){
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        DoubleCircularLinkedList dclr = new DoubleCircularLinkedList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0 ; i < n ; i++){
            dclr.addToStart(scan.nextInt());
        }
        int m = scan.nextInt();
        for(int i = 0 ; i < m ; i++){
            dclr.addToEnd(scan.nextInt());
        }
        dclr.displayFromFront();
        dclr.displayFromEnd();

        System.out.println("Enter element to delete: ");
        int key = scan.nextInt();
        dclr.deleteLastOccurrence(key);
        dclr.displayFromFront();
        dclr.displayFromEnd();
    }
}
