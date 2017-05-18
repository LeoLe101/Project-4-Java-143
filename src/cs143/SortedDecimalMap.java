package cs143;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * This is the concrete class that will create the Sorted Decimal Map by 
 * implementing the Decimal Search Tree
 * 
 * @author Phuc Hong Le
 * @version 5/17/2017
 * @param <E> generic type that will decided the object within the tree
 */
public class SortedDecimalMap<E extends DecimalSortable>
        implements DecimalSearchTree<E> {

    //private fields
    private DecimalNode root;
    private int digitCount;

    /**
     * Constructor.
     * 
     * @param digitCount the largest number of digits a sorting key will
     * contain in this sorted decimal map
     */
    public SortedDecimalMap(int digitCount) {
        root = new DecimalNode();
        this.digitCount = digitCount;
    }

    /**
     * Check if the tree contains the value by its key number
     * 
     * @param key the key number attached with the value inside of the tree
     * @return true if a value with given key exists, false if it is not 
     */
    @Override
    public boolean contains(int key) {
        
        return true;
    }

    /**
     * Get the value with the given key number 
     * 
     * @param key the key number attached with the value inside of the tree
     * @return the value of its given key, null if the value does not exist
     */
    @Override
    public E get(int key) {
        // TODO -- write this code
        return null;
    }

    /**
     * Insert the value which has a unique non-negative whole-number key 
     * to the tree
     * 
     * @param e the value to be inserted
     * @return true if the value has been inserted, false if is not
     */ 
    @Override
    public boolean insert(E e) {
        // TODO -- write this code
        return true;
    }

    /**
     * Remove the value with the given key from the tree
     * 
     * @param key the key number attached with the value inside of the tree
     * @return true if the value is found and removed, false if it is not
     */
    @Override
    public boolean remove(int key) {
        // TODO -- write this code
        return true;
    }

    /**
     * Reports if the tree is empty or not.
     * 
     * @return true if the tree is empty, false if not 
     */
    @Override
    public boolean isEmpty() {
        return isEmpty(root);
    }

    /**
     * Private recursive method to determine if the tree is empty.
     * 
     * @param node the current node the recursion is on
     * @return false if a value is found in the tree, true if recursion is
     * complete and no values were found
     */
    private boolean isEmpty(DecimalNode node) {
        for (int i = 0; i < 10; i++) {
            if (node.children[i] != null) {
                if (node.children[i].value != null) {
                    return false;
                } else {
                    return isEmpty(node.children[i]);
                }
            }
        }
        return true;
    }

    /**
     * Provides access to a type-specific iterator.
     * 
     * @return a new iterator object 
     */
    @Override
    public Iterator<E> iterator() {
        return new DecimalIterator();
    }

    /**
     * An inner class that defines a type-specific iterator. Uses a queue
     * internally to manage iterating through the tree.
     */
    private class DecimalIterator implements Iterator<E> {

        //private fields
        private Queue<E> queue;
        private E lastRemoved;

        /**
         * Default constructor.
         */
        public DecimalIterator() {
            fillQueue();
        }

        /**
         * A private method used to fill the queue.
         */
        private void fillQueue() {
            queue = new LinkedList<>();
            fillQueue(root);
        }

        /**
         * A private recursive method to fill the queue with the
         * value of each node in sorted order.
         * 
         * @param node the current node in the recursive process
         */
        private void fillQueue(DecimalNode node) {
            // TODO -- write this code
        }

        /**
         * Determines if there is a next value in the map.
         * 
         * @return true if there is a next value, false if not 
         */
        @Override
        public boolean hasNext() {
            if (queue.isEmpty()) {
                return false;
            }
            return true;
        }

        /**
         * Provides access to the next value in the map, in sorted order.
         * 
         * @return the next value
         */
        @Override
        public E next() {
            lastRemoved = queue.poll();
            return lastRemoved;
        }

        /**
         * Removes the last reported value from the map.
         */
        @Override
        public void remove() {
            SortedDecimalMap.this.remove(lastRemoved.getKey());
        }
    }

    /**
     * An inner class that defines the decimal tree node.
     */
    private class DecimalNode<E> {

        /**
         * the value stored in this node - will be null for all nodes except
         * the lowest-level leaf nodes
         */
        public E value;
        
        /**
         * the array used to store the children of this node
         */
        public DecimalNode[] children;

        /**
         * Default constructor.
         */
        public DecimalNode() {
            children = new DecimalNode[10];
        }

        /**
         * A convenience method to create a new node at the given
         * index of the current node. 
         * 
         * @param index the index of the children array where the new
         * node should be stored
         */
        public void makeChild(int index) {
            children[index] = new DecimalNode();
        }
    }

}
