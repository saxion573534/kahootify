package com.kahoot.questions;

import com.kahoot.Utils;



public class ChoiceQuestion extends Question {

    private final String[] options;
    private final int correctAnswerIndex;

    public ChoiceQuestion(String question, String[] options, int correctAnswerIndex) {
        super(question);
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    @Override
    public void askQuestion() {
        System.out.println("This is a question where you must select 1 option from a list of choices. Please answer the following question: \n");
        System.out.println(question + "\n");
        System.out.println("Please select your answer:");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer() {
        System.out.print("\nYour answer: ");
        int input = Utils.requestAnswer(1, options.length);
        return input == correctAnswerIndex + 1;
    }
}
