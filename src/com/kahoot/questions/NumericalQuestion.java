package com.kahoot.questions;

import com.kahoot.Utils;

public class NumericalQuestion extends Question {
    public NumericalQuestion(String question, int correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public void askQuestion() {
        System.out.println("This is a question you need to perform a calculation. Please enter the right answer of:\n");
        System.out.println(question + "\n");
        System.out.println("Please select your answer:");
    }

    @Override
    public boolean checkAnswer() {
        System.out.print("\nYour answer: ");
        int input = Utils.requestInput(-999, 999);
        return input == correctAnswer;
    }
}
