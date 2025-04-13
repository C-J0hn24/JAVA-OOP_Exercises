import java.util.ArrayList;
import java.util.Scanner;

class Question {
    private String questionText;
    private String correctAnswer;

    //construction fro adding quizes
    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    //for answer checking
    public boolean isCorrect(String answer) {
        return correctAnswer.equalsIgnoreCase(answer.trim());
    }
}

class Quiz {
    private ArrayList<Question> questions = new ArrayList<>();
    //this wont let u add more than 25 quizes
    private static final int MAX_QUESTIONS = 25;

    public void add(Question question) {
        if (questions.size() < MAX_QUESTIONS) {
            questions.add(question);
        } else {
            System.out.println("Quiz is full! Cannot add more questions.");
        }
    }

    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;//to count total score

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            System.out.print("Enter Your answer: ");
            String userAnswer = scanner.nextLine();

            //cheks if the answer is correct or nah
            if (question.isCorrect(userAnswer)) {
                System.out.println("YAY Correct!");
                score++;
            } else {
                System.out.println("Whomp Whomp Wrong!");
            }
        }

        System.out.println("\nCongrats you've completed all Quiz !");
        System.out.println("Your score: " + score + "/" + questions.size());
        scanner.close();
    }
}

public class QuizTime {
    public static void main(String[] args) {
        Quiz q = new Quiz();

        // addding questions to the quiz
        q.add(new Question("What is the capital of France?", "Paris"));
        q.add(new Question("What is 5 + 5?", "10"));
        q.add(new Question("Who wrote 'Hamlet'?", "Shakespeare"));
        q.add(new Question("What color is the sky on a clear day?", "Blue"));
        q.add(new Question("What is 2 + 2?", "4"));
        q.add(new Question("What is the opposite of hot?", "Cold"));
        q.add(new Question("How many legs does a spider have?", "8"));
        q.add(new Question("What is the capital of England?", "London"));
        q.add(new Question("What is the largest planet in our solar system?", "Jupiter"));
        q.add(new Question("What is the square root of 16?", "4"));
        q.add(new Question("What is the name of the closest star to Earth?", "Sun"));
        q.add(new Question("What is the color of a banana?", "Yellow"));
        q.add(new Question("How many days are there in a week?", "7"));
        
        // starts to ask quiz questions
        q.giveQuiz();
    }
}