package cs143;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Phuc Hong Le
 */
public class SortedDecimalMapTest {

    //fields
    SortedDecimalMap dst;
    SortedDecimalMap dst1;
    SortedDecimalMap dst2;
    Product prd;
    Product prd2;
    Product prd3;

    public SortedDecimalMapTest() {
    }

    @Before
    public void setUp() {
        dst = new SortedDecimalMap(5);
        dst1 = new SortedDecimalMap(5);
        dst2 = new SortedDecimalMap(5);
        prd = new Product(97358);
        prd2 = new Product(46738);
        prd3 = new Product(98375);
    }

    /**
     * Test of contains method, of class SortedDecimalMap.
     */
    @Test
    public void testContains() {
        dst.insert(prd);
        dst.insert(prd2);
        dst.insert(prd3);
        assertTrue(dst.contains(97358));
        assertFalse(!dst.contains(97358));
        assertTrue(dst.contains(46738));
        assertFalse(!dst.contains(46738));
        assertTrue(dst.contains(98375));
        assertFalse(!dst.contains(98375));
        assertFalse(!dst.contains(4879931));
        assertFalse(!dst.contains(124));
    }

    /**
     * Test of get method, of class SortedDecimalMap.
     */
    @Test
    public void testGet() {
        dst.insert(prd);
        dst.insert(prd2);
        dst.insert(prd3);
        assertTrue(prd == dst.get(97358));
        assertTrue(prd2 == dst.get(46738));
        assertTrue(prd3 == dst.get(98375));
    }

    /**
     * Test of insert method, of class SortedDecimalMap.
     */
    @Test
    public void testInsert() {
        dst.insert(prd);
        dst.insert(prd2);
        dst.insert(prd3);
        assertTrue(dst.contains(97358));
        assertFalse(!dst.contains(97358));
        assertTrue(dst.contains(46738));
        assertFalse(!dst.contains(46738));
        assertTrue(dst.contains(98375));
    }

    /**
     * Test of remove method, of class SortedDecimalMap.
     */
    @Test
    public void testRemove() {
        dst.insert(prd);
        dst.insert(prd2);
        dst.insert(prd3);
        dst.remove(97358);
        assertTrue(!dst.contains(97358));
        assertFalse(dst.contains(97358));
        dst.remove(97358);
        assertTrue(!dst.contains(46738));
        assertFalse(dst.contains(46738));
        dst.remove(97358);
        assertTrue(!dst.contains(98375));
        assertFalse(dst.contains(98375));
    }

    /**
     * Test of isEmpty method, of class SortedDecimalMap.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(dst.isEmpty());
        assertFalse(dst.isEmpty());
        dst.insert(prd);
        dst.insert(prd2);
        dst.insert(prd3);
        assertFalse(dst.isEmpty());
        assertTrue(dst.isEmpty());
    }

    /**
     * Test of iterator method, of class SortedDecimalMap.
     */
    @Test
    public void testIterator() {
        dst.insert(prd);
        dst.insert(prd2);
        dst.insert(prd3);
    }

}
