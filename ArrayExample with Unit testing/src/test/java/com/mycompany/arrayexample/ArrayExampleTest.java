
package com.mycompany.arrayexample;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dengovender
 */
public class ArrayExampleTest {
    
     @Test
    public void testHasFiveElements() {
        ArrayExample Example = new ArrayExample();
        assertTrue(Example.hasFiveElements());
    }

    @Test
    public void testSearchFound() {
        ArrayExample Example = new ArrayExample();
        int index = Example.search("Cherry");
        assertEquals(2, index);
    }

    @Test
    public void testSearchNotFound() {
        ArrayExample Example = new ArrayExample();
        int index = Example.search("Fig");
        assertEquals(-1, index);
    }

    @Test
    public void testDelete() {
        ArrayExample Example = new ArrayExample();
        Example.delete("Banana");

        String[] updated = Example.getItems();
        assertEquals("Cherry", updated[1]); // Banana was at index 1, now shifted
        assertNull(updated[4]); // Last slot should be null after deletion
    }
    
}
