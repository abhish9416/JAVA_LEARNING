import java.util.List;

public class Delete_in_Linked_List {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    //printing the Linked List
    public static void print(ListNode head){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //delete the head of the linked List
    public static ListNode deletehead(ListNode head){
        if(head==null){
            return head;
        }
        return head.next;
    }
    //delete the tail of the linkedlist
    public static ListNode deleteTail(ListNode head){
        if(head==null||head.next==null){
            return null;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp!=null) {
            if(temp.next==null){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    //delete the kthNode
    public static ListNode solve(ListNode A, int B) {
        if(A==null){
            return null;
        }
        if(B==0){
            return A.next;
        }
        ListNode temp = A;
        int count = 0;
        while (temp!=null) {
            if(count==B-1){
                temp.next = temp.next.next;
                break;
            }
            count++;
            temp = temp.next;
        }
        return A;
    }
    //delete the node of the value
    public static ListNode deletetheValueNode(ListNode head,int val){
        if(head==null){
            return head;
        }
        if(head.val==val){
            return head.next;
        }
        ListNode temp = head;
        ListNode prev = null;
        while (temp!=null) {
            if(temp.val==val){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[]A = {10};
        ListNode head = new ListNode(A[0]);
        ListNode cur = head;
        for(int i=1;i<A.length;i++){
            ListNode temp = new ListNode(A[i]);
            cur.next = temp;
            cur = cur.next;
        }
        // print(head);
        // ListNode newhead = deletehead(head);
        // print(newhead);

        ListNode removeTail = deleteTail(head);
        print(removeTail);
    }
}
