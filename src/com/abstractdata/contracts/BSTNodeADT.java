package com.abstractdata.contracts;

import java.io.Serializable;

/**
 * The abstract data type for a node in a BST
 *
 * @param <D> abstract data
 * @author Matt jones
 * @version 1.1
 */
public interface BSTNodeADT<D> extends Serializable {

    /**
     * getter for the node left of this node
     *
     * pre-conditions: left node exists
     * post-conditions: left node is returned to be used
     *
     * @return left node
     */
    public BSTNodeADT<D> getLeft();

    /**
     * setter for the node left of this node
     *
     * pre-conditions: left node doesn't exists
     * post-conditions: left node is created and set to be this nodes left node
     *
     */
    public void setLeft(BSTNodeADT<D> node);

    /**
     * getter for the node right of this node
     *
     * pre-conditions: right node exists
     * post-conditions: right node is returned to be used
     *
     * @return right node
     */
    public BSTNodeADT<D> getRight();

    /**
     * setter for the node right of this node
     *
     * pre-conditions: right node doesn't exists
     * post-conditions: right node is created and set to be this nodes right node
     *
     */
    public void setRight(BSTNodeADT<D> node);

    /**
     * Getter for the data within this node
     *
     * pre-conditions: data within this node isn't null
     * post-conditions: data is returned to be used
     * @return abstract data
     */
    public D getData();

    /**
     * Getter for the data within this node
     *
     * pre-conditions: data is null
     * post-conditions: data is set within the node
     *
     * @param data abstract data
     */
    public void setData(D data);

}
