/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuemanager;

/**
 *
 * @author Alanna Zimbehl - 19016467
 * @param <T> can be of any type                        
 */
public class SortedLinkedPriorityQueue<T> implements PriorityQueue<T>{
    
    private Node<T> head;
    
    public SortedLinkedPriorityQueue(){
       head = null;
    }
    
    
    @Override 
    public void add(T item, int priority) throws StringIndexOutOfBoundsException{
        
        PriorityItem<T> newItem = new PriorityItem(item,priority);
        
        Node createNode = new Node(newItem);
        
        Node begin = (head);
        
        if(head == null){
            head = createNode;
            return;
        } else if(head.getData().getPriority() > priority){
            createNode.setNext(head);
            head = createNode;
        }     
    }
    
    @Override
    public T head() throws QueueUnderflowException {
        if(isEmpty()){
            throw new QueueUnderflowException();
        }else{
            return (T) head.getData();
        }
    }

    @Override
    public void remove() throws QueueUnderflowException {
        Node temp = head;
        (head) = head.getNext();
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        String msg ="";
        return msg;
    }
    
}
