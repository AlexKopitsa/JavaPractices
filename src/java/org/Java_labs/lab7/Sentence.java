package org.Java_labs.lab7;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Sentence {
    List<Word> sentence;
    Sentence() {
        this.sentence =  new ArrayList<>();
    }
    Sentence(Word word){
        this.sentence = new ArrayList<Word>();
        this.sentence.add(word);
    }
    Sentence(List<Word> words){
        this.sentence = words;
    }
	public List<Word> getSentence() {
        return sentence;
    }
    public void setSentence(List<Word> sentence) {
        this.sentence = sentence;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || (getClass() != obj.getClass())) return false;
        Sentence sentence1 = (Sentence) obj;
        return Objects.equals(sentence, sentence1.sentence);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }
    @Override
    public String toString() {
        return "Sentence {" + "sentence = " + sentence + '}';
    }
}
