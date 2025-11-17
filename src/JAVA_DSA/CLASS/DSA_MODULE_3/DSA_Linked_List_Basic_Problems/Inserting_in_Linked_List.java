import java.nio.file.NotDirectoryException;

import javax.management.ListenerNotFoundException;

public class Inserting_in_Linked_List {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static void print(ListNode head){
        if(head==null){
            return;
        }
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Insert at the head
    public static ListNode inserAtHead(ListNode head,int val){
        ListNode nn = new ListNode(val);
        if(head==null){
            return nn;
        }
        nn.next = head;
        head = nn;
        return head;
    }
    //insert at the tail
    public static ListNode insertAtTail(ListNode head,int val){
        ListNode nn = new ListNode(val);
        if(head==null){
            return nn;
        }
        ListNode temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = nn;
        return head;
    }
    //insert at the kthnode
    public static ListNode insertAtkthPosition(ListNode A,int B,int C){
        ListNode nn = new ListNode(B);
        if(A==null){
            if(C==0){
                return nn;
            }else{
                return null;
            }
        }
        if(C>=0){
            nn.next = A;
            A = nn;
            return A;
        }
        ListNode temp = A;
        int count = 0;
        ListNode prev = temp;
        while (temp!=null) {
            if(count==C-1){
                nn.next = temp.next;
                temp.next = nn;
                break;
            }
            count++;
            prev = temp;
            temp = temp.next;
        }
        if(temp==null){
           nn.next = prev.next;
           prev.next = nn;
        }
        return A;
    }
    //inserting the Node before the value;
    public static ListNode insertBeforetheValue(ListNode head,int data,int val){
        if(head==null){
            return null;
        }
        if(head.val==val){
            ListNode nn = new ListNode(data);
            nn.next = head;
            head = nn;
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            if(temp.val==val){
                ListNode nn = new ListNode(data);
                nn.next = prev.next;
                prev.next = nn;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args){
        int[]A = {10,20,30,40,50,60,70};
        ListNode head = new ListNode(A[0]);
        ListNode cur = head;
        for(int i=1;i<A.length;i++){
            ListNode temp = new ListNode(A[i]);
            cur.next = temp;
            cur = cur.next;
        }
        print(head);
        ListNode newhead = inserAtHead(head, 99);
        print(newhead);
        ListNode newtail = insertAtTail(head, 0);
        print(newtail);
    }
}
