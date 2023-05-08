/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DataStructures;

import ApplicationData.Appointments;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author asus
 */
public class PriorityQueueTest {
    
    public PriorityQueueTest() {
    }

    /**
     * Test empty queue of size method.
     */
    @Test
    public void testSize_EmptyQueue() {
        PriorityQueue instance = new PriorityQueue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test populated queue of size method.
     */
    @Test
    public void testSize_PopulatedQueue() {
        PriorityQueue instance = new PriorityQueue();
        instance.add(new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White"));

        int expResult = 1;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test empty queue of isEmpty method.
     */
    @Test
    public void testIsEmpty() {

        PriorityQueue instance = new PriorityQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test populated queue of isEmpty method.
     */
    @Test
    public void testIsEmpty_PopulatedQueue() {
        PriorityQueue instance = new PriorityQueue();
        instance.add(new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White"));

        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
    /**
     * Test add one appointment in empty queue of add method.
     */
    @Test
    public void testAdd_addInEmptyQue() {
        Appointments appt = new Appointments("Kenny", "Ryan", "1992-03-29", "Chest pain", "2023-05-02", 2, "Winson Murphy");
        PriorityQueue instance = new PriorityQueue();

        boolean expResult = true;
        boolean result = instance.add(appt);
        assertEquals(expResult, result);

        int expSize = 1;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);
    }

    /**
     * Test add one appointment in populated queue of last of add method.
     */
    @Test
    public void testAdd_addInPopulatedQueue_last() {
        Appointments appt = new Appointments("Kenny", "Ryan", "1992-03-29", "Chest pain", "2023-05-02", 2, "Winson Murphy");
        PriorityQueue instance = new PriorityQueue();

        instance.add(new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White"));
        instance.add(new Appointments("Ason", "Kelly", "1988-01-14", "Feel shortness of breath", "2023-04-29", 3, "Winson Murphy"));

        boolean expResult = true;
        boolean result = instance.add(appt);
        assertEquals(expResult, result);

        int expSize = 3;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);
    }

    /**
     * Test add one appointment in populated queue of first of add method.
     */
    @Test
    public void testAdd_addInPopulatedQueue_first() {
        Appointments appt = new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White");
        PriorityQueue instance = new PriorityQueue();

        instance.add(new Appointments("Ason", "Kelly", "1988-01-14", "Feel shortness of breath", "2023-04-29", 3, "Winson Murphy"));
        instance.add(new Appointments("Brian", "Carroll", "1994-05-21", "Lightheadedness", "2023-05-02", 1, "Jennifer White"));

        boolean expResult = true;
        boolean result = instance.add(appt);
        assertEquals(expResult, result);

        int expSize = 3;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);
    }

    /**
     * Test add one appointment in populated queue of middle of add method.
     */
    @Test
    public void testAdd_addInPopulatedQueue_middle() {
        Appointments appt = new Appointments("Ason", "Kelly", "1988-01-14", "Feel shortness of breath", "2023-04-29", 3, "Winson Murphy");
        PriorityQueue instance = new PriorityQueue();

        instance.add(new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White"));
        instance.add(new Appointments("Brian", "Carroll", "1994-05-21", "Lightheadedness", "2023-05-02", 1, "Jennifer White"));

        boolean expResult = true;
        boolean result = instance.add(appt);
        assertEquals(expResult, result);

        int expSize = 3;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);
    }

     /**
     * Test empty queue of element method.
     */
    @Test
    public void testElement_EmptyQueue() {

        PriorityQueue instance = new PriorityQueue();

        assertThrows(NoSuchElementException.class, () -> {
            instance.element();
        });
    }

    /**
     * Test populated queue of element method.
     */
    @Test
    public void testElement_PopulatedQueue() {

        PriorityQueue instance = new PriorityQueue();

        instance.add(new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White"));

        Appointments expResult = new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White");
        Appointments result = instance.element();
        assertEquals(expResult, result);
    }

    /**
     * Test empty queue of peek method.
     */
    @Test
    public void testPeek_EmptyQueue() {

        PriorityQueue instance = new PriorityQueue();

        Appointments expResult = null;
        Appointments result = instance.peek();
        assertEquals(expResult, result);

    }

    /**
     * Test populated queue of peek method.
     */
    @Test
    public void testPeek_PopulatedQueue() {

        PriorityQueue instance = new PriorityQueue();

        instance.add(new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White"));

        Appointments expResult = new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White");
        Appointments result = instance.element();
        assertEquals(expResult, result);
    }

    /**
     * Test empty queue of remove method.
     */
    @Test
    public void testRemove_EmptyQue() {
        PriorityQueue instance = new PriorityQueue();

        assertThrows(NoSuchElementException.class, () -> {
            instance.remove();
        });
    }

    /**
     * Test populated queue of remove method.
     */
    @Test
    public void testRemove_PopulatedQue() {
        PriorityQueue instance = new PriorityQueue();

        instance.add(new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White"));
        instance.add(new Appointments("Brian", "Carroll", "1994-05-21", "Lightheadedness", "2023-05-02", 1, "Jennifer White"));

        Appointments expResult = new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White");
        Appointments result = instance.remove();
        assertEquals(expResult, result);

        int expSize = 1;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);

    }

    /**
     * Test empty queue of poll method.
     */
    @Test
    public void testPoll_EmptyQue() {
        PriorityQueue instance = new PriorityQueue();

        Appointments expResult = null;
        Appointments result = instance.poll();
        assertEquals(expResult, result);
    }

    /**
     * Test populated queue of poll method.
     */
    @Test
    public void testPoll_PopulatedQue() {
     PriorityQueue instance = new PriorityQueue();

        instance.add(new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White"));
        instance.add(new Appointments("Brian", "Carroll", "1994-05-21", "Lightheadedness", "2023-05-02", 1, "Jennifer White"));

        Appointments expResult = new Appointments("Jolin", "Smith", "1998-10-10", "Light Fever", "2023-04-14", 4, "Jennifer White");
        Appointments result = instance.remove();
        assertEquals(expResult, result);

        int expSize = 1;
        int resultSize = instance.size();
        assertEquals(expSize, resultSize);
    }
    
}
