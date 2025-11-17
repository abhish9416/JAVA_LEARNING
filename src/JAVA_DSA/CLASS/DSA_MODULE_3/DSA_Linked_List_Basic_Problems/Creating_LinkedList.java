import CLASS.DSA_MODULE_3.DSA_Lab_Session_on_Stacks.remove;

public class Creating_LinkedList {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    //printing the Linked List
    public static void printLinkedList(Node head){
        if(head==null){
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] A = {10,20,30,40,50,60};
        Node head = new Node(A[0]);
        Node cur = head;
        for(int i=1;i<A.length;i++){
            Node temp = new Node(A[i]);
            cur.next = temp;
            cur = cur.next;
        }
        printLinkedList(head);
    }
    
}
