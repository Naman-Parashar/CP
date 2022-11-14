package Daddu_CP;

import javax.swing.plaf.IconUIResource;

public class Linked_List_O<t> {
    private Node<t> head;
    private int size;

    public Linked_List_O(){
        head = null;
        size =0;
    }

    public Node<t> createLL(){
        Node<t> n1 = new Node(10);
        Node<t> n2 = new Node(20);
        Node<t> n3 = new Node(30);
        Node<t> n4 = new Node(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        head = n1;
        return head;
    }

    // function to get length
    public int length(){
        if (head == null) return 0;
        Node<t> temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // function to add element at beginning.
    public Node<t> addB(t data){
        Node<t> n = new Node<>(data);
        n.next = head;
        head = n;
        return head;
    }



    public void print(){
        Node<t> temp = head;
        while (temp != null){
            System.out.print(temp.data+" ----> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
