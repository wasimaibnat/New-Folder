public class Quiz implements Measurable {
    private String letterGrade;
    private double score;

    public Quiz(double score, String letterGrade) {
        this.score = score;
        this.letterGrade = letterGrade;
    }

    public double getMeasure() {
        return score;
    }

    public double getScore() {
        return score;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public static String calculateLetterGrade(double score) {
        String letterGrade = "";
        if (score >= 98) {
            letterGrade = "A+";
        }
        if (score >= 94 && score < 98) {
            letterGrade = "A";
        }
        if (score >= 90 && score < 94) {
            letterGrade = "A-";
        }
        if (score >= 88 && score < 90) {
            letterGrade = "B+";
        }
        if (score >= 84 && score < 88) {
            letterGrade = "B";
        }
        if (score >= 80 && score < 84) {
            letterGrade = "B-";
        }
        if (score >= 78 && score < 80) {
            letterGrade = "C+";
        }
        if (score >= 74 && score < 78) {
            letterGrade = "C";
        }
        if (score >= 70 && score < 74) {
            letterGrade = "C-";
        }
        if (score >= 68 && score < 70) {
            letterGrade = "D+";
        }
        if (score >= 64 && score < 68) {
            letterGrade = "D";
        }
        if (score >= 60 && score < 64) {
            letterGrade = "D-";
        }
        if (score < 60) {
            letterGrade = "F";
        }
        return letterGrade;
    }
}
