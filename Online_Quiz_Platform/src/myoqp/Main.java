package myoqp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create questions
        ArrayList<OnlineQuizPlatform> questions = new ArrayList<>();
        questions.add(new OnlineQuizPlatform("What is the capital of France?", new ArrayList<>(
            List.of("London", "Paris", "Berlin")), 1));
        questions.add(new OnlineQuizPlatform("Which programming language is this quiz written in?", new ArrayList<>(List.of("Java", "Python", "C++")), 0));
        // Add more questions as needed

        // Create quiz
        Quiz quiz = new Quiz(questions);

        // Start quiz
        quiz.startQuiz();
    }
}

