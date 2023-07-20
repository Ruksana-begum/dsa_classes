public class QueueUsing2Stacks<T> {
    private java.util.Stack<T> insertionStack;
    private java.util.Stack<T> deletionStack;
    public QueueUsing2Stacks(){
        insertionStack = new java.util.Stack<>();
        deletionStack = new java.util.Stack<>();
    }
    public void enqueue(T item){
        insertionStack.push(item);
    }
    public T dequeue(){
        if(deletionStack.isEmpty()){

            while(!insertionStack.isEmpty()){
                deletionStack.push(insertionStack.pop());
            }
        }
        return deletionStack.pop();
    }
    public T peek(){
        if(deletionStack.isEmpty()){
            while(!insertionStack.isEmpty()){
                deletionStack.push(insertionStack.pop());
                
            }
        }
         return deletionStack.peek();
    }
    public static void main(String[] args) {
        QueueUsing2Stacks queue = new QueueUsing2Stacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(50);
        System.out.println(queue.dequeue());
       System.out.println(queue.peek());
    }
}


