// Developer.java
public class Developer extends Employee {
    private String programmingLanguage;
    private int projectsCompleted;

    // Constructor for Developer
    public Developer(String name, int employeeId, double baseSalary, String department, String programmingLanguage, int projectsCompleted) {
        super(name, employeeId, baseSalary, department);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = projectsCompleted;
        System.out.println(name + " joined as a " + programmingLanguage + " Developer");
    }

    // Override the calculateSalary method
    @Override
    public double calculateSalary() {
        return baseSalary + (projectsCompleted * 1000);  // Developer salary is base salary + bonus per project completed
    }

    // Override the work method
    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }

    // Override the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
}
