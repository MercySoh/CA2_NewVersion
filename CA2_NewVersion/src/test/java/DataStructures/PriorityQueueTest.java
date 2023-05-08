/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DataStructures;

import ApplicationData.Appointments;
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
    
}
