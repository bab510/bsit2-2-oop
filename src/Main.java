public class Main{
public static void main(String[] args) {
    GradeCalculator calculator = new GradeCalculator();
    double average = calculator.calculateAverage(85.5, 92.0, 78.5, 90.0);
    String letterGrade = calculator.getLetterGrade(average);


    calculator.displayResult("John Smith", average);
    calculator.displayResult("John Smith", average, letterGrade);
}
}