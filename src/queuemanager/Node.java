/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuemanager;

/**
 * @author Alanna Zimbehl - 19016467
 * @param <T>
 */
public class Node<T> {
    
    /**
 contains the person and the priority fields/data for person object within the node
 */
    private PriorityItem data;
    
//    next field for bridge of next node
    private Node next;
    
     public Node(PriorityItem data){
        this.data = data;
    }           
    
     public Node(){
    }           
        
    
//    setters and getters for node object/ class
    public PriorityItem getData() {
        return data;
    }

    public void setData(PriorityItem data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
