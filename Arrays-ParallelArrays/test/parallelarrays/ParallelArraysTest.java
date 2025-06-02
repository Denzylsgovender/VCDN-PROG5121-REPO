
package parallelarrays;


import org.junit.Test;
import static org.junit.Assert.*;

public class ParallelArraysTest {
    
   
   
       @Test
    public void testGenerateUniqueID() {
        // Basic functionality tests
       
        assertEquals("D : 1", ParallelArrays.generateUniqueID("Denzyl", 21));
        assertEquals("D : 2", ParallelArrays.generateUniqueID("David", 32));
        assertEquals("F : 3", ParallelArrays.generateUniqueID("Felicia", 43));
                    //Expected                              //Actual                                            
 
    }
    
     
    
}
