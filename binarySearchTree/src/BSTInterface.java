import java.util.List;

/**
 * The interface for a Binary Search Tree
 */
public interface BSTInterface<T extends Comparable<? super T>> {
    /**
     * Add the data as a leaf in the BST.  Should traverse the tree to find the
     * appropriate location. If the data is already in the tree, then nothing
     * should be done (the duplicate shouldn't get added).
     * Should have a running time of O(log n) for a balanced tree, and a worst
     * case of O(n).
     *
     * @throws java.lang.IllegalArgumentException if the data is null
     * @param data the data to be added
     */
    void add(T data);

    /**
     * Removes the data from the tree.  There are 3 cases to consider:
     * 1: the data is a leaf.  In this case, simply remove it.
     * 2: the data has one child.  In this case, simply replace it with its
     * child, then remove the child.
     * 3: the data has 2 children.  There are generally two approaches:
     * replacing the data with either the next smallest element in the tree
     * (commonly called the predecessor), or replacing it with the next
     * largest element in the tree (commonly called the successor). For this
     * assignment, use the predecessor.
     * Should have a running time of O(log n) for a balanced tree, and a worst
     * case of O(n).
     *
     * @throws java.lang.IllegalArgumentException if the data is null
     * @throws java.util.NoSuchElementException if the data is not found
     * @param data the data to remove from the tree.
     * @return the data removed from the tree.  Do not return the same data
     * that was passed in.  Return the data that was stored in the tree.
     */
    T remove(T data);

    /**
     * Returns the data in the tree matching the parameter passed in (think
     * carefully: should you use .equals or == ?).
     * Should have a running time of O(log n) for a balanced tree, and a worst
     * case of O(n).
     *
     * @throws java.lang.IllegalArgumentException if the data is null
     * @throws java.util.NoSuchElementException if the data is not found
     * @param data the data to search for in the tree.
     * @return the data in the tree equal to the parameter. Do not return the
     * same data that was passed in.  Return the data that was stored in the
     * tree.
     */
    T get(T data);

    /**
     * Returns whether or not the parameter is contained within the tree.
     * Should have a running time of O(log n) for a balanced tree, and a worst
     * case of O(n).
     *
     * @throws java.lang.IllegalArgumentException if the data is null
     * @param data the data to search for in the tree.
     * @return whether or not the parameter is contained within the tree.
     */
    boolean contains(T data);

    /**
     * Should run in O(1).
     *
     * @return the number of elements in the tree
     */
    int size();

    /**
     * Should run in O(n).
     *
     * @return a preorder traversal of the tree
     */
    List<T> preorder();

    /**
     * Should run in O(n).
     *
     * @return a postorder traversal of the tree
     */
    List<T> postorder();

    /**
     * Should run in O(n).
     *
     * @return an inorder traversal of the tree
     */
    List<T> inorder();

    /**
     * Generate a level-order traversal of the tree.
     *
     * To do this, add the root node to a queue. Then, while the queue isn't
     * empty, remove one node, add its data to the list being returned, and add
     * its left and right child nodes to the queue. If what you just removed is
     * {@code null}, ignore it and continue with the rest of the nodes.
     *
     * Should run in O(n).
     *
     * @return a level order traversal of the tree
     */
    List<T> levelorder();

    /**
     * Clear the tree.  Should be O(1).
     */
    void clear();

    /**
     * Calculate and return the height of the root of the tree.  A node's
     * height is defined as {@code max(left.height, right.height) + 1}. A leaf
     * node has a height of 0.
     * Should be calculated in O(n).
     *
     * @return the height of the root of the tree, -1 if the tree is empty
     */
    int height();
}
