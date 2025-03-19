package com.kahoot.questions;

public abstract class Question {

    protected String question;
    protected final int correctAnswer;

    public Question(String question, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public abstract void askQuestion();
    public abstract boolean checkAnswer();
}
