import java.util.List;
public class QuizBowlDriver {

    public static void main(String[] args) {
        int score = 0;
        List<String> questions = QuizBowl.getQuestions();
        List<String> answers = QuizBowl.getAnswers();

        int i = 0;
        for(String question : questions) {
            QuizBowl.displayQuestion(question);
            String userAnswer = QuizBowl.inputAnswer();
            if(QuizBowl.checkAnswer(userAnswer, answers.get(i))) {
                System.out.println("Correct!");
                score++;
            } else { 
                System.out.println("Wrong! The correct answer is " + answers.get(i)); 
            }
            QuizBowl.displayScore(score);
            System.out.println("\n");
            i++;
        } 

        QuizBowl.displayResults(score, answers.size()); 
    }
}
