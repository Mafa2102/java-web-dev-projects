package org.example;

public class TrueFalse extends Question{

    //constructor
    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    //methods
    public boolean checkAnswer(String answer) {
        // answer = "true" "false"  or "TRUE" or "FALSE"
        if (answer.toLowerCase().equals(this.getAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

}
