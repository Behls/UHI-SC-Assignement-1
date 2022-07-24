/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuemanager;

/**
 *
 * @author alanna zimbehl - 19016467
 * @param <T>
 * 
 */
public class unOrderedLinkedListPriorityQueue<T> implements PriorityQueue<T>
{
    private Node<T> head;
    
    public unOrderedLinkedListPriorityQueue(){
        head = null;        
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
    public void add(T item, int priority) throws QueueOverflowException {
        Node previousNode = head;
        PriorityItem<T> newItem = new PriorityItem(item,priority);       
        head = new Node(newItem);
        head.setNext(previousNode);      
    }

    @Override
    public void remove() throws QueueUnderflowException {
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        String msg = "";
        
        return msg;
    }
    
}
