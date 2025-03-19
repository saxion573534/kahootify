package com.kahoot;

import com.kahoot.questions.ChoiceQuestion;
import com.kahoot.questions.NumericalQuestion;
import com.kahoot.questions.Question;
import com.kahoot.questions.TrueFalseQuestion;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Question[] questions = {
                new ChoiceQuestion("What programming language do we use in this course?", 2, new String[]{"C++", "Java", "PHP", "Fortran"}),
                new TrueFalseQuestion("Abstract classes can be instantiated into objects.", 2),
                new NumericalQuestion("What is the value of 2+2?", 4)
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