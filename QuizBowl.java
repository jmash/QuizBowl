import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class QuizBowl {

    private static List<String> importQuizInput() {
        List<String> quizbowl = new ArrayList<String>();
        try {
            quizbowl = Files.readAllLines(Paths.get("./QuizBowlQuestions.txt"));
        } catch(IOException excep) {
            System.out.println(excep.toString());
            System.out.println("Could not find file.");
        }
        return quizbowl;
    }

    public static List<String> getQuestions() {
        List<String> quizInput = importQuizInput();
        List<String> questions = new ArrayList<String>();
        for(int i = 0; i < quizInput.size(); i++) {
            if(i % 2 == 0) {
               questions.add(quizInput.get(i)); 
            } 
        } 
        return questions;
    }

    public static List<String> getAnswers() {
        List<String> quizInput = importQuizInput();
        List<String> answers = new ArrayList<String>();
        for(int i = 0; i < quizInput.size(); i++) {
            if(i % 2 != 0) {
               answers.add(quizInput.get(i)); 
            } 
        } 
        return answers; 
    }

    public static void displayQuestion(String question) {
        System.out.println(question);
    }

    public static void displayScore(int score) {
        System.out.println(Integer.toString(score));
    }

    public static void displayResults(int score, int total) {
        System.out.println("You got " + Integer.toString(score) + " out of " + Integer.toString(total) + " correct.");
    }

    public static String inputAnswer() {
        Scanner answerScanner = new Scanner(System.in);
        String answer = answerScanner.nextLine();
        return answer;
    }

    public static boolean checkAnswer(String input, String correct) {
        if(input.equalsIgnoreCase(correct)) return true;
        return false;
    }

}
