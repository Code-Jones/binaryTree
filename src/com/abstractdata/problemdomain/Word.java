package com.abstractdata.problemdomain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Word implements Serializable {

    private final String word;
    private int howMany;
    private final ArrayList<Integer> lineNumbers = new ArrayList<>();

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public int getHowMany() {
        return howMany;
    }

    public void addOccurrence() {
        this.howMany++;
    }

    public ArrayList<Integer> getLineNumbers() {
        return lineNumbers;
    }

    public void addLineNumber(int lineNumber) {
        lineNumbers.add(lineNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return howMany == word1.howMany &&
                Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, howMany, lineNumbers);
    }
}
