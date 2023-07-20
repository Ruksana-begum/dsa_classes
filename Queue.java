public class Queue {
    int size,front,rear;
	private Object[] queuearray;
	Queue(int size)
	{
		this.size=size;
		this.front=-1;
        this.rear=-1;
		queuearray=new Object[size];
	}
	public void enqueue(Object value)
	{
		if(front==0 && rear==size-1)
		{
			System.out.println("Queue is Full");
			return;
		}
        if(front==-1) front++;
		rear++;
		queuearray[rear]=value;
		
	}
    public Object dequeue()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			Object value=queuearray[front];
			if(front>=rear) {
                front=-1;
                rear=-1;
            }
            front++;
			return value;
		
		}
		
	}
	public void print()
	{
		System.out.println("Stack is ");
		for(int i=front;i<=rear;i++)
		{
			System.out.println(queuearray[i]);
		}
	}
    public static void main(String[] args)
	{
		Queue st=new Queue(10);
		st.enqueue(20);
		st.enqueue(98);
		st.enqueue(90);
		st.enqueue(45);
		st.enqueue(2);
		st.enqueue(9);
		st.enqueue(9);
		st.enqueue(4);
		st.enqueue(2);
		st.enqueue(9);
		st.print();
		st.dequeue();
		st.dequeue();
		st.dequeue();
		st.dequeue();
		st.print();
    }
}
