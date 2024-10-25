package org.example;

public class CheckBox extends Question{

    public CheckBox(String question, String answer) {
        super(question, answer);
    }

    //method
    public boolean checkAnswer(String answer) {
        // answer = "A, B, C" or answer = "a, b, c"
        String actualAnswer = this.getAnswer();
        if (answer.toLowerCase().equals(actualAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
