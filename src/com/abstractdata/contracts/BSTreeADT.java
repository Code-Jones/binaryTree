package com.abstractdata.contracts;

import com.abstractdata.util.BSTNode;

import java.util.Iterator;

/**
 * A binary search tree interface that uses abstract data
 *
 * @param <D> abstract data
 * @author Matt jones
 * @version 1.1
 */
public interface BSTreeADT<D> {

    /**
     * Adds an element to the binary search tree
     *
     * pre-conditions: tree has been made
     * post-conditions: data has been added to the tree
     *
     * @param data element data to be added
     * @return true if element was added correctly
     */
    public boolean add(D data);

    /**
     *  checks to see if it has a left child
     *
     * pre-conditions: tree has been made
     * post-conditions: returns a boolean to see if the child is there
     *
     * @param node node we're checking to see if it has a left child
     * @return true if it does have a left child
     */
    public boolean hasLeftChild(BSTNode<D> node);

    /**
     *  checks to see if it has a right child
     *
     * pre-conditions: tree has been made
     * post-conditions: returns a boolean to see if the child is there
     *
     * @param node node we're checking to see if it has a right child
     * @return true if it does have a right child
     */
    public boolean hasRightChild(BSTNode<D> node);

    /**
     * checks to see if this node is a leaf
     *
     * pre-conditions: node has been made
     * post-conditions: returns a boolean if it is a leaf or not
     *
     * @return true if it is a leaf
     */
    public boolean isLeaf(BSTNode<D> node);

    /**
     * returns the height of the given node
     *
     * pre-conditions: node is not null
     * post-conditions: returns a int showing the height of the node in the tree
     *
     * @return int height of the node within the tree
     */
    public int getHeight(BSTNode<D> node);


    /**
     * gets the root node of the tree
     *
     * pre-conditions: tree has been made
     * post-conditions: returns the root node of the tree
     *
     * @return root node
     */
    public BSTNode<D> getRoot();

    /**
     * returns the size of the tree
     *
     * pre-conditions: tree has been made
     * post-conditions: returns a int showing the size of the tree
     *
     * @return int of the size how many nodes in the tree
     */
    public int size();

    /**
     * checks to see if the tree is empty or not
     *
     * pre-conditions: tree has been made
     * post-conditions: returns if the tree has been made
     *
     * @return true if it is empty
     */
    public boolean isEmpty();

    /**
     * clears the tree
     *
     * pre-conditions: tree has been made
     * post-conditions: tree will be empty
     */
    public void clear();

    /**
     * checks if the tree has the given node
     *
     * pre-conditions: tree has been made
     * post-conditions: will return if node is within the tree
     *
     * @return true if it within the tree
     */
    public boolean contains(BSTNode<D> node);

    /**
     * Creates an in order iterator
     *
     * pre-conditions: no iterator has been made
     * post-conditions: iterator will be return to go through tree
     *
     * @return iterator to traverse through the tree
     */
    public Iterator<D> InOrderIterator();


}
