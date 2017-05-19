package cs143;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phuc Hong Le
 */
public class SortedDecimalMapTest {
    
    //fields
    SortedDecimalMap dst;
    SortedDecimalMap dst1;
    SortedDecimalMap dst2;
    
    public SortedDecimalMapTest() {
    }
    
    @Before
    public void setUp() {
        dst = new SortedDecimalMap(5);
        dst1 = new SortedDecimalMap(5);
        dst2 = new SortedDecimalMap(5);
    }

    /**
     * Test of contains method, of class SortedDecimalMap.
     */
    @Test
    public void testContains() {
        dst.insert(86);
        dst.insert(86);
        dst.insert(86);
        dst.insert(86);
    }

    /**
     * Test of get method, of class SortedDecimalMap.
     */
    @Test
    public void testGet() {
    }

    /**
     * Test of insert method, of class SortedDecimalMap.
     */
    @Test
    public void testInsert() {
    }

    /**
     * Test of remove method, of class SortedDecimalMap.
     */
    @Test
    public void testRemove() {
    }

    /**
     * Test of isEmpty method, of class SortedDecimalMap.
     */
    @Test
    public void testIsEmpty() {
    }

    /**
     * Test of iterator method, of class SortedDecimalMap.
     */
    @Test
    public void testIterator() {
    }
    
}
