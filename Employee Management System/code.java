import java.util.*;

public class EmployeeManagementSystem {
    int id;
    String name;
    double salary;

    EmployeeManagementSystem(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(id + " " + name + " " + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<EmployeeManagementSystem> employees = new ArrayList<>();
        System.out.print("Enter the no'of Employees:");
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            employees.add(new EmployeeManagementSystem(id, name, salary));
        }
        scanner.close();

        for (EmployeeManagementSystem emp : employees) {
            emp.displayDetails();
        }
    }
}