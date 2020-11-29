package com.abstractdata.util;

import com.abstractdata.contracts.BSTNodeADT;

public class BSTNode<D> implements BSTNodeADT<D> {
    private D data;
    private BSTNode<D> left;
    private BSTNode<D> right;

    @Override
    public D getData() {
        return null;
    }

    @Override
    public BSTNodeADT<D> getLeft() {
        return this.left;
    }

    @Override
    public BSTNodeADT<D> getRight() {
        return this.right;
    }

    @Override
    public void setLeft(BSTNodeADT<D> node) {
        this.left = left;
    }

    @Override
    public void setRight(BSTNodeADT<D> node) {
        this.right = right;
    }

    @Override
    public void setData(D data) {

    }
}
