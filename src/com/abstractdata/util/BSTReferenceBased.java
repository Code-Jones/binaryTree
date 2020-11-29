package com.abstractdata.util;

import com.abstractdata.contracts.BSTreeADT;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Stack;

public class BSTReferenceBased<D> implements BSTreeADT<D>, Serializable {

    private final BSTNode<D> root;

    public BSTReferenceBased(BSTNode<D> root) {
        this.root = root;
    }

    @Override
    public boolean add(D data) {
        return false;
    }

    @Override
    public boolean hasLeftChild(BSTNode<D> node) {
        return node.getLeft() != null;
    }

    @Override
    public boolean hasRightChild(BSTNode<D> node) {
        return node.getRight() != null;
    }

    @Override
    public boolean isLeaf(BSTNode<D> node) {
        return (hasLeftChild(node) && hasRightChild(node));
    }

    @Override
    public int getHeight(BSTNode<D> node) {
        return 0;
    }

    @Override
    public BSTNode<D> getRoot() {
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
        return new InOrderIter(root);
    }

    private class InOrderIter implements Iterator<D> {

        private BSTNode<D> node;

        public InOrderIter(BSTNode<D> node) {
            if (node != null) {
                this.node = smallest(node);
            } else {
                this.node = null;
            }
        }
        private BSTNode<D> smallest(BSTNode<D> node) {
            if (node.getLeft() != null) {
                return smallest(node.getLeft());
            } else {
                return node;
            }
        }

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public D next() {
           D data = node.getData();
           if (node.getRight() != null) {
               node = smallest(node.getRight());
           } else {
               while (node.getParent() != null && node.getParent().getLeft() != node) {
                   node = node.getParent();
               }
               node = node.getParent();
           }
           return data;
        }
    }
//https://stackoverflow.com/questions/39042188/binary-search-tree-iterator-implementation-with-no-use-of-collection-classes
//    https://medium.com/algorithm-problems/binary-search-tree-iterator-19615ec585a
//    https://dev.to/javinpaul/how-to-implement-inorder-traversal-in-a-binary-search-tree-1787
//    @Override
//    public Iterator<D> InOrderIterator() {
//        return new Iterator<D>() {
//
//            private BSTNode<D> node;
//            private Stack<BSTNode<D>> stack = new Stack<>();
//            private BSTNode<D> current = root;
//
//            @Override
//            public boolean hasNext() {
//                return (!stack.isEmpty() || current != null);
//            }
//
//            @Override
//            public D next() {
//
//            }
//
//            public D inOrder(BSTNode<D> node) {
//                if (node == null) return null;
//                else {
//                    inOrder(node.getLeft());
//                    if (node.getData() != null) return node.getData();
//                    else inOrder(node.getRight());
//                }
//                return null;
//            }
//
//            @Override
//            public D next() {
//                BSTNode<D> node = stack.pop();
//                goLeft(node.getRight());
//                return node.getData();
//            }
//
//            @Override
//            public D next() {
//                while(current != null) {
//                    stack.push(current);
//                    current = current.getLeft();
//                };
//                current = stack.pop();
//                BSTNode<D> node = current;
//                current = current.getRight();
//                return node.getData();
//            }
//
//            public void goLeft(BSTNode<D> node) {
//                if (node != null) {
//                    stack.push(node);
//                    goLeft(node.getLeft());
//                }
//            }
//        };
//    }
}


