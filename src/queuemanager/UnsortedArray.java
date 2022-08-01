/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuemanager;

/**
 *
 * @author dev
 */
public class UnorderedArray<T> implements PriorityQueue<T> {

    /**
     * Where the data is actually stored.
     */
    private final Object[] storage;

    /**
     * The size of the storage array.
     */
    private final int capacity;

    /**
     * The index of the last item stored.
     *
     * This is equal to the item count minus one.
     */
    private int tailIndex;
    
//    stores the current index value
    
    private int currentIndex = 0;

    /**
     * Create a new empty queue of the given size.
     *
     * @param size
     */
    public UnorderedArray(int size) {
        storage = new Object[size];
        capacity = size;
        tailIndex = -1;
    }

    @Override
    public T head() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            return ((PriorityItem<T>) storage[0]).getItem();
        }
    }

    @Override
    public void add(T item, int priority) throws QueueOverflowException {
        
    	tailIndex = tailIndex + 1;
        
         if(currentIndex <= capacity) {
        	 storage[currentIndex] = new PriorityItem<>(item, priority);
        	 currentIndex +=1;
         }
    }
    
    

    @Override
    
    public void remove() throws QueueUnderflowException {
    	
        if (isEmpty()) {
            throw new QueueUnderflowException();
        
        } else {
        	
        	int i = tailIndex;
        	int max = tailIndex;
        	
        	while (i > 0 && ((PriorityItem<T>) storage[i - 1]).getPriority() < ((PriorityItem<T>) storage[i - 2]).getPriority()) {
                storage[i] = storage[i - 1];
                i = i - 1;
            }
            
            tailIndex = tailIndex - 1;
        }
        
    }

    @Override
    public boolean isEmpty() {
        return tailIndex < 0;
    }
    

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i <= tailIndex; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result = result + storage[i];
        }
        result = result + "]";
        return result;
    }
	
}
