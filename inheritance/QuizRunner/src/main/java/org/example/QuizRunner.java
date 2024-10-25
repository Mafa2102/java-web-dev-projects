package org.example;


public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoice myMultiChoiceQuestion = new MultipleChoice("Which method can be used to return a string in upper case letters?" +
                "\nA: toUpperCase()\nB: UpperCase()\nC: touppercase()\nPlease just type a single letter as an answer", "A");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckBox myCheckBoxQuestion = new CheckBox("Select all that apply: \nMost commonly used Java methods?\nA: equals()\nB: indexOf()\nC: map()", "A, B");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalse myTrueFalseQuestion = new TrueFalse("In Java, it is possible to inherit attributes and methods from one class to another?  \n True or False?", "True");
        myQuiz.addQuestion(myTrueFalseQuestion );


        myQuiz.runQuiz();
    }
}