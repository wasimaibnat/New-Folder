public class QuizRunner {
    public static void main(String args[]) {
        // arraylist of quizzes with each having a score and letter grade
        Quiz[] quizzes = new Quiz[6];
        quizzes[0] = new Quiz(67, "D+");
        quizzes[1] = new Quiz(75, "C");
        quizzes[2] = new Quiz(80, "B-");
        quizzes[3] = new Quiz(90, "A-");
        quizzes[4] = new Quiz(95, "A");
        quizzes[5] = new Quiz(72, "C-");
        Quiz maxQuiz = Data.max(quizzes);
        double avg = Data.average(quizzes);
        System.out.println("Average score is " + String.format("%.2f", avg) +
                " which is an average letter grade of a(n) " + Quiz.calculateLetterGrade(avg) + ".");
        System.out.printf("The highest score is " + String.format("%.2f", maxQuiz.getScore())
                + " which is a(n) " + maxQuiz.getLetterGrade() + ".");
    }
}
