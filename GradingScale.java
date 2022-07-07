public class GradingScale {

    private double total;
    private int count;
    private double average;

    public String calculateGrade(double points) {
        String ects = " ";
        total = 0.0;
        count = 0;

        while(total != 0) {
            if(points <= 90 && points >= 100) {
                total += points;
                count++;
                ects = "A";
            }
            if(points <= 75 && points >= 89) {
                total += points;
                count++;
                ects = "B";
            }
            if(points <= 60 && points >= 74) {
                total += points;
                count++;
                ects = "C";
            }
            if(points <= 50 && points >= 59) {
                total += points;
                count++;
                ects = "D";
            }
            if(points < 50) {
                total += points;
                count++;
                ects = "F";
            }

            if(points == -1) {
                calculateAvg();
                break;
            }
        }

        return ects;

    }

    public double calculateAvg() {
        average = total / count;
        return average;
    }


}
