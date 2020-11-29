package com.abstractdata.util;

import com.abstractdata.contracts.BSTNodeADT;

public class BSTNode<D> implements BSTNodeADT<D> {
    private D data;
    private BSTNode<D> left;
    private BSTNode<D> right;
    private BSTNode<D> parent;

    public BSTNode(D data) {
        this.data = data;
    }

    @Override
    public D getData() {
        return this.data;
    }

    @Override
    public BSTNode<D> getLeft() {
        return this.left;
    }

    @Override
    public BSTNode<D> getRight() {
        return this.right;
    }

    @Override
    public void setLeft(BSTNode<D> node) {
        this.left = left;
    }

    @Override
    public void setRight(BSTNode<D> node) {
        this.right = (BSTNode<D>) node;
    }

    @Override
    public void setData(D data) { this.data = data; }

    public BSTNode<D> getParent() {
        return parent;
    }

    public void setParent(BSTNode<D> parent) {
        this.parent = parent;
    }
}
