package arrayqueue;

public interface QueueADT<T> {
    
    public void enqueue(T element);
    
    public T dequeue();
    
    public T first();
    
    public boolean isEmpty();
    
    public int size();
    
    public String toString();
}
