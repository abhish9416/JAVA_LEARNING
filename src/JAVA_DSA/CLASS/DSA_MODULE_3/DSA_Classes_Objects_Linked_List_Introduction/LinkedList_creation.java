package CLASS.DSA_MODULE_3.DSA_Classes_Objects_Linked_List_Introduction;

import java.sql.SQLOutput;

public class LinkedList_creation {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;

            this.next = null;
        }
    }
    static void printLinkedList(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    static int solve(Node head,int B){
        Node temp = head;
        int count = 0;
        int val = 0;
        while (temp!=null){
            if(count==B){
                val = temp.val;
            }
            temp = temp.next;
            count++;
        }
        return val;
    }
    public static void main(String[] args){
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        Node n3 = new Node(7);
        Node n4 = new Node(8);
        Node n5 = new Node(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLinkedList(n1);
        System.out.println(solve(n1,2));

    }
}
