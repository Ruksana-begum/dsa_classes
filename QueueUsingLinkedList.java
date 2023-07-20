class Node {
    int item;
    Node next;
    public Node(int item) {
        this.item=item;
    }
}
public class QueueUsingLinkedList {
    int size;
    Node front;
    Node rear;
    public QueueUsingLinkedList() {
        this.size=0;
        this.front=null;
        this.rear=null;
    }
    public void enqueue(int item) {
        Node n1=new  Node(item);
        if(size==0) {
            front=n1;
            rear=n1;
        }
        else {
            rear.next=n1;
            n1.next=null;
            rear=rear.next;
        }
        size++;
    }
    public void dequeue() {
        front=front.next;
        size--;
    }
    public void display() {
        Node current=front;
        while(current!=rear.next) {
            System.out.print(current.item+" ");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        QueueUsingLinkedList q=new QueueUsingLinkedList();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        //q.display();
        q.dequeue();
        q.display();
    }
}
