public class Data {
    public static double average(Quiz[] quizzes) {
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < quizzes.length; i++) {
            sum = sum + quizzes[i].getScore();
        }
        avg = sum / quizzes.length;
        return avg;
    }

    public static Quiz max(Quiz[] quizzes) {
        if (quizzes.length == 0) {
            return null;
        } else {
            double maxScore = quizzes[0].getScore();
            Quiz max = quizzes[0];
            for (int i = 1; i < quizzes.length; i++) {
                if (quizzes[i].getScore() > maxScore) {
                    maxScore = quizzes[i].getScore();
                    max = quizzes[i];
                }
            }
            return max;
        }
    }
}
