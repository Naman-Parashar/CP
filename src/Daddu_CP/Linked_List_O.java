package Daddu_CP;

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

    public void print(){
        Node<t> temp = head;
        while (temp != null){
            System.out.print(temp.data+"---->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
