package OOPS3.MethodOverloadingandoverriding.ScalerLearning;

public class Employee extends User{
    int employeeId;
    String department;

    public Employee(String username,String email,int employeeId,String department){
        super(username, email);
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Employee Id: "+employeeId);
        System.out.println("Department: "+department);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("john_smith", "john.smith@example.com", 201, "Human Resources");
        System.out.println("Username: "+employee.getUsername());
        System.out.println("Email: "+employee.getEmail());
        System.out.println("Employee Id: "+employee.getEmployeeId());
        System.out.println("Department: "+employee.getDepartment());
    }
}
