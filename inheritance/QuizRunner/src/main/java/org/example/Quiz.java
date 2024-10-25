package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<Question>();

    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);


    public Quiz() {
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    // Run the Quiz -- method
    public void runQuiz() {
        // Loop through each question, for each
        for (Question question : questions) {
            // Ask the user the question
            System.out.println(question.getQuestion());
            // Get the users answer
            String usersAnswer = this.getUsersAnswers();
            // Check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            // increment numberOfQuestionsCorrect if answered correctly
            if (userGotQuestionCorrect) {
                this.numberOfQuestionsCorrect++;
            }
        }
        // Grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size()) * 100;
        System.out.println("Your Grade is: " + percentageCorrect + "%");

    }
    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;

    }
}
