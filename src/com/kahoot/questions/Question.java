package com.kahoot.questions;

public abstract class Question {

    protected String question;

    public Question(String question) {
        this.question = question;
    }

    public abstract void askQuestion();
    public abstract boolean checkAnswer();
}
