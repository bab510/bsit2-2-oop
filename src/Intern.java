// Intern.java
public class Intern extends Employee {
    private String university;
    private boolean isFullTime;

    // Constructor for Intern
    public Intern(String name, int employeeId, double baseSalary, String department, String university, boolean isFullTime) {
        super(name, employeeId, baseSalary, department);
        this.university = university;
        this.isFullTime = isFullTime;
        System.out.println("Intern " + name + " from " + university + " has started");
    }

    // Override the calculateSalary method
    @Override
    public double calculateSalary() {
        return baseSalary * 0.5;  // Intern salary is half of the base salary
    }

    // Override the work method
    @Override
    public void work() {
        System.out.println(name + " is learning and assisting with tasks.");
    }

    // Override the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("University: " + university);
        System.out.println("Full-time: " + isFullTime);
    }
}
