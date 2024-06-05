package myoqp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class OnlineQuizPlatform {
    private String questionText;
    private ArrayList<String> options;
    private int correctOptionIndex;

    public OnlineQuizPlatform(String questionText, ArrayList<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
}

class Quiz {
    private ArrayList<OnlineQuizPlatform> questions;
    private int score;

    public Quiz(ArrayList<OnlineQuizPlatform> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (OnlineQuizPlatform question : questions) {
            System.out.println(question.getQuestionText());

            ArrayList<String> options = question.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }

            System.out.print("Enter your choice (1-" + options.size() + "): ");
            int userChoice = scanner.nextInt();

            if (userChoice == question.getCorrectOptionIndex() + 1) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + (question.getCorrectOptionIndex() + 1) + ". " +
                        options.get(question.getCorrectOptionIndex()) + "\n");
            }
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
    }
}



