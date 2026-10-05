public class Employee {
    // Attributes (Private Variables)
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Returns "firstName lastName"
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Returns salary * 12
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Increases salary by the percent and returns the new salary
    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    // Returns formatted string: "Employee[id=?,name=firstName LastName,salary=?]"
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee(101, "Abdirizak", "Muuse", 1000);

        System.out.println("ID: " + employee.getId());
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());

        employee.setSalary(1200);

        System.out.println("\nAfter setting new salary:");
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());

        employee.raiseSalary(10);

        System.out.println("\nAfter 10% salary raise:");
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());

        System.out.println("\nEmployee Information:");
        System.out.println(employee);
    }
}