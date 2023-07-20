class Node {
    public Object item;
    public Node next;
    public Node previous;
}
public class DoublyLinkedList {
    private Node head;
    private Node tail;
    public DoublyLinkedList() {
        this.head=null;
        this.tail=null;
    }
    public void insertNode(Object data) {
        Node current=new Node();
        current.item=data;
        if(head==null) {
            head=tail=current;
            head.previous=null;
            tail.next=null;
        }
        else {
            current.previous=tail;
            tail.next=current;
            tail=current;
            tail.next=null;
        }
    }
    public void insertAtBegin(Object i) {
        Node current = new Node();
        current.item=i;
        if(head==null) {
            head=tail=current;
            head.previous=null;
            tail.next=null;
        }
        else {
            current.next=head;
            current.previous=null;
            head.previous=current;
            head=current;
        }
    }
    public void insertAtposition(Object i, int pos) {
        Node current=new Node();
            current=head;
            for(int j=0;j<pos-1;j++) {
                current=current.next;
            }
            Node temp=new Node();
            temp.item=i;
            temp.previous=current;
            temp.next=current.next;
            current.next=temp;
            Node temp1=temp.next;
            temp1.previous=temp;
    }
    public void deleteBegin() {
        Node node=head.next;
        node.previous=null;
        head=node;
    }
    public void deleteEnd() {
        Node node=tail.previous;
        node.next=null;
        tail=node;
    }
    public void deleteAtPosition(int pos) {
        Node current=head;
        for(int i=0;i<pos-1;i++) {
            current=current.next;
        }
        Node temp=current.next.next;
        current.next=temp;
        temp.previous=current;

    }
    public void display() {
        Node current=head;
        while(current!=tail.next) {
            System.out.print(current.item+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList d=new DoublyLinkedList();
        d.insertNode(10);
        d.insertNode(15);
        d.insertAtBegin(100);
        d.insertAtposition(30, 2);
        //d.deleteBegin();
        //d.deleteEnd();
        d.deleteAtPosition(2);
        d.display();
    }

}
