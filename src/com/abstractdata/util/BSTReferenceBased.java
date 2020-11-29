package com.abstractdata.util;

import com.abstractdata.contracts.BSTNodeADT;
import com.abstractdata.contracts.BSTreeADT;

import java.util.Iterator;

public class BSTReferenceBased<D> implements BSTreeADT<D> {
    
    private BSTNodeADT<D> root;

    @Override
    public boolean add(D data) {
        return false;
    }

    @Override
    public boolean hasLeftChild(BSTNodeADT<D> node) {
        return false;
    }

    @Override
    public boolean hasRightChild(BSTNodeADT<D> node) {
        return false;
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public int getHeight(BSTNode<D> node) {
        return 0;
    }

    @Override
    public BSTNodeADT<D> getRoot() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(BSTNode<D> node) {
        return false;
    }

    @Override
    public Iterator<D> InOrderIterator() {
        return null;
    }
}
