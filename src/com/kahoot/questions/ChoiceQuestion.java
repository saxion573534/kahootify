package com.kahoot.questions;

import com.kahoot.Utils;



public class ChoiceQuestion extends Question {

    private final String[] options;

    public ChoiceQuestion(String question, int correctAnswer, String[] options) {
        super(question, correctAnswer);
        this.options = options;
    }

    @Override
    public void askQuestion() {
        System.out.println("This is a question where you must select 1 option from a list of choices. Please answer the following question: \n");
        System.out.println(question + "\n");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ": " + options[i]);
        }
    }

    @Override
    public boolean checkAnswer() {
        System.out.print("\nYour answer: ");
        int input = Utils.requestInput(1, options.length);
        return input == correctAnswer;
    }
}
