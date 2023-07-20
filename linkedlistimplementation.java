class Node {
    public Object item;
    public Node next;
}
public class linkedlistimplementation {
    private int size;
    private Node head;
    public linkedlistimplementation() {
        this.size=0;
        this.head=null;
    }
    public void insertingnode(String i) {
        Node node=new Node();
        node.item=i;
        Node current=this.head;
        if(this.head==null) {
            this.head=node;
            this.head.next=null;
            this.size=1;
           // System.out.println(this.head.toString());
        }
        else {
            while(current.next!=null) {
                current=current.next;
            }
            current.next=node;
            node.next=null;
            this.size+=1;
        }
    }
    public void AddAtStarting(String i) {
        Node node= new Node();
        node.item=i;
        node.next=this.head;
        this.head=node;
        this.size+=1;
    }
    public void addAtMiddle(String i,int pos) {
        Node n=new Node();
        n.item=i;
        Node current = this.head;
        if(this.head!=null && pos<=this.size) {
            for(int j=1;j<pos;j++) {
                current=current.next;
            }
            n.next=current.next;
            current.next=n;
            this.size+=1;
        }
        else {
            System.out.println("Postion is out of range");
        }
        
    }
    public void deleteAtBegin() {
        if(this.head==null) {
            System.out.println("No nodes present");
        }
        else {
            this.head=head.next;
            this.size-=1;
        }

    }
    public void deleteAtMiddle(int pos) {
        Node current,temp;
        temp=this.head;
        current=null;
        if(this.head==null) {
            System.out.println("No nodes present");
        }
        else if(pos<size) {
           for(int i=0;i<pos;i++){
                current=temp;
                temp=temp.next;

            }
            if(current!=null){
                current.next=temp.next;
                temp=null;
                this.size-=1;
            }

        }
    }
    public void deleteAtEnd() {
        Node current=this.head;
        if(this.head==null) {
            System.out.println("No nodes present");
        }
        else {
            while(current.next!=null) {
                current=current.next;
                if(current.next.next==null) {
                    current.next=null;
                    this.size-=1;
                }
            }
        }
    }
    public void find(String value) {
        Node current =this.head;
        boolean flag=false;
        for(int i=0;i<size;i++) {
            if(current.item.equals(value)) {
                System.out.println("Element present"+i);
                flag=true;
            }
            current = current.next;
        }
        if (!flag) {
            System.out.println("Element not present");
        }
    }
    public void display() {
        Node current = this.head;
        for(int i=0;i<size;i++) {
            System.out.println(current.item);
            current=current.next;
        }

    }
    public static void main(String[] args) {
        linkedlistimplementation llist=new linkedlistimplementation();
        llist.insertingnode("Likhitha");
        llist.insertingnode("Parimala");
        llist.insertingnode("Ruksana");
       // llist.display();
        llist.AddAtStarting("Sam");
        llist.addAtMiddle("Roopa", 2);
        llist.insertingnode("Sunny");
        //llist.deleteAtBegin();
        //llist.deleteAtEnd();
       llist.deleteAtMiddle(2);
        llist.find("Likhitha");
        llist.display();
    }
}
