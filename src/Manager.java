// Manager.java
public class Manager extends Employee {
    private double bonus;
    private int teamSize;

    // Constructor for Manager
    public Manager(String name, int employeeId, double baseSalary, String department, double bonus, int teamSize) {
        super(name, employeeId, baseSalary, department);
        this.bonus = bonus;
        this.teamSize = teamSize;
        System.out.println(name + " has been promoted to Manager");
    }

    // Override the calculateSalary method
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;  // Manager salary is base salary + bonus
    }

    // Override the work method
    @Override
    public void work() {
        super.work();
        System.out.println(name + " is managing a team of " + teamSize + " employees.");
    }

    // Override the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize +  " employees");
    }
}
