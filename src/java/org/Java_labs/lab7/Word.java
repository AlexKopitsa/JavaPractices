package org.Java_labs.lab7;
import java.util.Objects;

public class Word {
    String word;
    Word(String word) {
        this.word = word;
    }
    public String getWord() {
        return word;
    }
	public void setWord(String word) {
        this.word = word;
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Word word1 = (Word) obj;
        return Objects.equals(word, word1.word);
    }
    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
}
