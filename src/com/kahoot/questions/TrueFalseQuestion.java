package com.kahoot.questions;

import com.kahoot.Utils;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String question, int correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public void askQuestion() {
        System.out.println("This is a simple true or false question. Do you agree with the following statement?\n");
        System.out.println(question + "\n");
        System.out.println("Please select your answer:");
        System.out.println("1: True");
        System.out.println("2: False");
    }

    @Override
    public boolean checkAnswer() {
        System.out.print("\nYour answer: ");
        int input = Utils.requestInput(1, 2);
        return input == correctAnswer;
    }
}
