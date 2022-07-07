public class GradingScale {

    private double grade;
    private int count;

    public String calculateGrade(double points) {
        String ects = " ";
        grade = 0.0;
        count = 0;

        if(points <= 90 && points >= 100) {
            grade += points;
            count++;
            ects = "A";
        }
        if(points <= 75 && points >= 89) {
            grade += points;
            count++;
            ects = "B";
        }
        if(points <= 60 && points >= 74) {
            grade += points;
            count++;
            ects = "C";
        }
        if(points <= 50 && points >= 59) {
            grade += points;
            count++;
            ects = "D";
        }
        if(points < 50) {
            grade += points;
            count++;
            ects = "F";
        }

        return ects;

    }

    public double calculateAvg(double grade, int count) {
        return grade / count;
    }


}
