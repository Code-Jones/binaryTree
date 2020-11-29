package com.abstractdata.application;

import com.abstractdata.contracts.BSTreeADT;
import com.abstractdata.util.BSTNode;
import com.abstractdata.util.BSTReferenceBased;

import java.util.Scanner;

public class WordTracker {
    private static final char PRINT_FILES = 'f';
    private static final char PRINT_FILES_LINES = 'l';
    private static final char PRINT_FILES_LINES_FREQUENCY = 'o';

    public static void main(String[] args) {
        BSTreeADT<String> tree = new BSTReferenceBased<>(new BSTNode<>("root"));


        char printOption = 'f';

    }
}
