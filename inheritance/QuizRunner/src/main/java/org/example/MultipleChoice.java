package org.example;

public class MultipleChoice extends Question{

    //constructor
    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    // annotation
    @Override
    public boolean checkAnswer(String answer) {
        // answer = "A" or "B", answer = "a" or "b"
        String actualAnswer = this.getAnswer();
        // make check case insensitive
        if (answer.toLowerCase().equals(actualAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
