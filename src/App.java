public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Employee Management System ===\n");
        
        // Create employee objects
        Employee emp1 = new Employee(101, "John Doe", "IT", 50000, "john@company.com");
        Employee emp2 = new Employee(102, "Jane Smith", "HR", 45000, "jane@company.com");
        Employee emp3 = new Employee(103, "Mike Johnson", "Sales", 55000, "mike@company.com");
        
        // Display employee details
        System.out.println("--- Employee 1 ---");
        emp1.displayDetails();
        
        System.out.println("\n--- Employee 2 ---");
        emp2.displayDetails();
        
        System.out.println("\n--- Employee 3 ---");
        emp3.displayDetails();
    }
}
