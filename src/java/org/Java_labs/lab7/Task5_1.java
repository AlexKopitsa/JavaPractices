package org.Java_labs.lab7;
import org.Java_labs.lab7.Text;
import org.Java_labs.lab7.Word;
import java.util.List;
import java.util.ArrayList;

public class Task5_1 {
    public static void main(String[] args) {
        Word word1 = new Word("WORD1");
        Word word2 = new Word("WORD2");
        Word word3 = new Word("WORD3");
        List<Word> words1 = new ArrayList<Word>() {
            {   add(word1);
                add(word2);
                add(word3);
            }
        };
        Sentence sentence1 = new Sentence();
        sentence1.setSentence(words1);
        List<Word> sentence1_get =  sentence1.getSentence();
        Word word4 = new Word("WORD4");
        List<Word> words2 = new ArrayList<Word>() {
			{
                add(word1);
                add(word2);
                add(word3);
                add(word4);
            }
        };
        Sentence sentence2 = new Sentence(words2);
        Word word5 = new Word("WORD5");
        List<Word> words3 = new ArrayList<Word>() {
            {
                add(word1);
                add(word2);
                add(word3);
                add(word4);
                add(word5);
            }
        };
        Sentence sentence3 = new Sentence(words3);
        List<Sentence> sentences = new ArrayList<Sentence>() {
            {
                add(sentence1);
                add(sentence2);
                add(sentence3);
            }
        };
        Text text = new Text(sentences);
        Sentence sentence4 = new Sentence(new Word("WORD6"));
        text.addSentence(sentence4);
        for(Sentence sentence : text.getSentences()) {
            for(Word word: sentence.getSentence()) {
                System.out.print(word.getWord()+" ");
            }
            System.out.println();
        }
        System.out.println("Title: ");
        for(Word word: text.getTitle().getSentence()) {
            System.out.print(word.getWord() + " ");
        }
    }
}
