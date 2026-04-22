public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private String email;
    private String phoneNumber;
    
    // Constructor
    public Employee(int id, String name, String department, double salary, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // Display employee details
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
