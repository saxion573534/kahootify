package com.kahoot.questions;

public class NumericalQuestion extends Question {
    public NumericalQuestion(String question) {
        super(question);
    }

    @Override
    public void askQuestion() {

    }

    @Override
    public boolean checkAnswer() {
        return false;
    }
}
