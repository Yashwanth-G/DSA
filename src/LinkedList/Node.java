public class Node {
    int val;
    Node prev, next;

    public Node(){}
    public Node(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
