package com.kahoot;

import com.kahoot.questions.ChoiceQuestion;
import com.kahoot.questions.Question;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Question[] questions = {
                new ChoiceQuestion("What programming language do we use in this course?", new String[]{"C++", "Java", "PHP", "Fortran"}, 1)
        };

        Random rand = new Random();
        int index = 1;
        while (true) {
            System.out.println("\n****** Question " + index +" ******");
            Question question = questions[rand.nextInt(questions.length)];
            question.askQuestion();

            if (question.checkAnswer()) {
                System.out.println("Your answer is correct!");
            } else {
                System.out.println("Your answer is INCORRECT!");
            }
            index++;
        }
    }
}