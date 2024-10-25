package org.example;


public abstract class Question{

    //fields
    private String question;
    private String answer;

    //constructor


    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    //method
    public abstract boolean checkAnswer(String answer);
}
