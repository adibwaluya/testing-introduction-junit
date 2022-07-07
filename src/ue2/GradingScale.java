package ue2;

public class GradingScale {

    private double total;
    private int count;
    private double average;
    private String ects;
    private double grade;

    public String calculateGrade(double p) {
        ects = " ";
        total = 0.0;
        count = 0;
        average = 0;
        grade = 0;

        if (p <= 100 && p >= 90) {
            if (p >= 95) grade = 1.0; else grade = 1.3;
            total += p;
            count++;
            ects = "A";

        } else if (p >= 75 && p <= 89) {
            if (p >= 85) grade = 1.7; else if (p >= 80 && p <= 84) grade = 2.0;
            else grade = 2.3;
            total += p;
            count++;
            ects = "B";
        } else if (p >= 60 && p <= 74) {
            if (p >= 70) grade = 2.7; else if (p >= 65 && p <= 69) grade = 3.0;
            else grade = 3.3;
            total += p;
            count++;
            ects = "C";
        } else if (p >= 50 && p <= 59) {
            if (p >= 55) grade = 3.7; else grade = 4.0;
            total += p;
            count++;
            ects = "D";
        }
        else {
            grade = 5.0;
            ects = "F";
        }

        return ects + ", grade: " + grade;
    }

    public double calculateAvg(int input, double total, int count) {
        average = total / count;
        return average;
    }


    public static void main(String[] args) {
        double score = 83;

        GradingScale gradingScale = new GradingScale();

        gradingScale.calculateGrade(score);

        System.out.println(gradingScale.calculateGrade(score));

    }

}
