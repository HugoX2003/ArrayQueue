package arrayqueue;

public class ArrayQueue<T> implements QueueADT<T> {

    private final int DEFAULT_CAPACITY = 100;
    private int rear;
    private T[] queue;

    public ArrayQueue() {
        rear = 0;
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    
    public ArrayQueue(int initialCapacity){
        rear = 0;
        queue = (T[])(new Object[initialCapacity]);
    }
    
    
    @Override
    public void enqueue(T element) {
        if(size()==queue.length)
            expandCapacity();
        
        queue[rear]=element;
        rear++;
    }
    
    @Override
    public T dequeue() {
        if(isEmpty())
            System.out.println("Cola Vacia");
        
        T result = queue[0];
        rear--;
        
        for(int i =0;i<rear;i++)
            queue[i]=queue[i+1];
        queue[rear]=null;
        return result;
        
    }
//------------------------------------------------------------------------------
    
    
    
    @Override
    public T first() {
        if (rear == 0) {
            System.out.println("Pila vacia");
        }
        return queue[0];
    }
    
    
//------------------------------------------------------------------------------
    
    
    
    @Override
    public boolean isEmpty() {
        return (rear==0);
    }

    @Override
    public int size() {
        return rear;
    }
    
    public String toString(){
        String result="";
        for(int i=0; i<rear;i++)
        result = result+queue[i].toString()+"\n";

        return result;
    }
    
    
    
//------------------------------------------------------------------------------
    public void expandCapacity(){
        T[] larger = (T[]) (new Object[queue.length * 2]);

        for (int i = 0; i < queue.length; i++) {
            larger[i] = queue[i];
        }
        queue = larger;
    }
    
}
