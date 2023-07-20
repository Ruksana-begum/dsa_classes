class Node {
    int item;
    Node next;
    public Node(int item) {
        this.item=item;
    }
}

public class StackUsingLinkedList {
    int size;
    Node head;
    Node tail;
    public StackUsingLinkedList() {
        this.size=0;
        this.head=null;
        this.tail=null;
    }
    public void push(int item) {
        Node n1=new  Node(item);
        if(size==0) {
            head=n1;
            tail=n1;
        }
        else {
            tail.next=n1;
            n1.next=null;
            tail=tail.next;
        }
        size++;
    }
    public void pop() {
        if(this.head==null) {
            System.out.println("The list is empty");
            return;
        }
        if(head.next==null) {
            head=null;
            size--;
            return;
        }
     Node current=this.head;
    while(current.next!=null) {
        current=current.next;
        if(current.next.next==null) {
            current.next=null;
            this.size-=1;
        }
    }
}
    
    public void display() {
        Node current=this.head;
        for(int i=0;i<size;i++) {
            System.out.print(current.item +"->");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList S=new StackUsingLinkedList();
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        S.push(50);
        S.pop();
        S.pop();
        S.display();
    }

}
