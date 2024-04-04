import java.util.*;
public class QuestionDemo3 {
    public static void main(String[] args) {
        Scanner kappa = new Scanner(System.in);
        Question q = new Question();
        q.setText("Who was the inventor of Java");
        q.setAnswer("James Gosling");
        q.display();
        System.out.println("Your answer : ");
        String response = kappa.nextLine();
        System.out.println(q.checkAnswer(response));
        NumericQuestion nq = new NumericQuestion();
        nq.setText("What is the result of 2.0 x 3.0?");
        nq.setAnswer(6.0);
        nq.display();
        System.out.println("Your answer:");
        String response_nq = kappa.nextLine();
        System.out.println(nq.checkAnswer(response_nq));
    }
}