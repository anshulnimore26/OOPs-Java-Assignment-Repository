import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    double basicSalary;
    Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }
    void displayGrossSalary() {
        double grossSalary = basicSalary + (basicSalary * 0.2) + (basicSalary * 0.1);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
public class Q14_TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empId, empName, basicSalary:");
        Employee emp = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
        emp.displayGrossSalary();
    }
}
