package averages;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;  

import org.junit.jupiter.api.Test;


public class AverageTest {

        int[] list = {1,2,3,4,5};
        Average Avrg = new Average();
        
        @Test
        void negAvrgCase() {
                int collectiveAverage = Avrg.average(-1,list);
                assertEquals(collectiveAverage, 0); 
                //assertEquals takes 2 parameters, the left bound for the number you're trying to equal, and the right bound for the numbers presented.
                //if both are equal it will pass the test and return a successful run.
        }
        @Test
        void oddAvrgCase() {
                int collectiveAverage = Avrg.average(3,list);
                assertEquals(2, collectiveAverage); 
        }
        @Test
        void evenAvrgCase() {
                int collectiveAverage = Avrg.average(0,list);
                assertEquals(0, collectiveAverage); 
        }

        @Test
        void largerKCaseF() {
                int collectiveAverage = Avrg.average(20,list);
                assertNotEquals(collectiveAverage, 2); 
                //similar to assertEquals, assertNotEquals takes 2 parameters, the left bound for the number you're trying to equal, and the right bound for the numbers presented.
                //if both numbers are unequal, it will pass the test and return a successful run.

        }
        @Test
        void largerKCaseT() {
                int collectiveAverage = Avrg.average(15,list);
                assertEquals(collectiveAverage, 3); 
        }

        

}
