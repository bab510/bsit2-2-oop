// Main.java
public class Main {
    public static void main(String[] args) {
        // Create different types of employees
        Manager manager = new Manager("Alice Smith", 2001, 80000, "Engineering", 15000, 8);
        Developer developer = new Developer("Bob Johnson", 2002, 70000, "Engineering", "Java", 5);
        Intern intern = new Intern("Charlie Brown", 2003, 30000, "Engineering", "Tech University", true);



        manager.displayInfo();
        manager.work();
        System.out.println("Monthly Salary: $" + manager.calculateSalary());

        System.out.println("\n----------------------------------");

        developer.displayInfo();
        developer.work();
        System.out.println("Monthly Salary: $" + developer.calculateSalary());

        System.out.println("\n----------------------------------");

        intern.displayInfo();
        intern.work();
        System.out.println("Monthly Salary: $" + intern.calculateSalary());
    }
}
