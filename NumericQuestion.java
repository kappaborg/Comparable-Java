public class NumericQuestion extends Question {
    private double answer;
    private double nq;
    public NumericQuestion() {
        nq=1;
    }
    public void setAnswer(double correctResponse) {
        this.answer = correctResponse;
    }
    public boolean checkAnswer(String response) {
        double response_nq = Double.parseDouble(response);
        return Math.abs(response_nq - answer) < 0.01;
    }
}