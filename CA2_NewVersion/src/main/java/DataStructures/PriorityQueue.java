/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import ApplicationData.Appointments;
import java.util.NoSuchElementException;

/**
 * A Priority queue class include all standard components of a Priority Queue
 * structure and it is extends of Linked list class that hold appointments.
 *
 * @author Mercy
 */
public class PriorityQueue extends LinkedList {

    /**
     * Adds an appointment to the Queue.
     *
     * @param value is use for the specified, it add value in order of triage
     * level where 1 is higher than 5
     * @return true when value added else return false when value not added
     */
   
  @Override
    public boolean add(Appointments value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            first = newNode;
            last = newNode;
        
        }else{
                Node current = first.next;
                Node previous = first;

                while (current.data ==(newNode.data)) {
                    previous = current;
                    current = current.next;
                }
                previous.next = newNode;
                newNode.next = current;
            }    
        size++;
        return true;
    }
    
    /**
     * Element return first data from the Queue.
     *
     * @return first appointment when the queue not empty
     * @throws NoSuchElementException when queue is empty
     */
    public Appointments element() {
        if (isEmpty() == true) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    /**
     * Peek first appointment from the Queue.
     *
     * @return first appointment when the Queue not empty and return null when
     * queue is empty
     */
    public Appointments peek() {
        if (isEmpty() == true) {
            return null;
        }
        return first.data;
    }

    /**
     * Remove first appointment from the Queue.
     *
     * @return first appointment when removed
     * @throws NoSuchElementException when queue is empty
     */
    public Appointments remove() {
        if (isEmpty() == true) {
            throw new NoSuchElementException();
        }
        Appointments original = first.data;
        first = first.next;
        size--;
        return original;
    }

    /**
     * Poll first appointment from the Queue.
     *
     * @return first appointment when removed and return null when queue is
     * empty
     */
    public Appointments poll() {
        if (isEmpty() == true) {
            return null;
        }
        Appointments original = first.data;
        first = first.next;
        size--;
        return original;
    }

    /**
     * No indexOf method in priority queue so need to throw exception
     *
     * @param value of appointments
     * @throws NoSuchElementException when indexOf method use in priority queue
     */
    @Override
    public int indexOf(Appointments value) {
        throw new NoSuchElementException();
    }

    /**
     * No get method in priority queue so need to throw exception
     *@param pos of appointments
     * @throws NoSuchElementException when get method use in priority queue
     */
    @Override
    public Appointments get(int pos) {
        throw new NoSuchElementException();
    }
}
