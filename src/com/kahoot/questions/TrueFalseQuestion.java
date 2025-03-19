package com.kahoot.questions;

public class TrueFalseQuestion extends Question {

    public TrueFalseQuestion(String question) {
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
