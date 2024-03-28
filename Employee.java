import java.util.Scanner;

public class Employee {

    private String name;
    private String position;
    private Integer salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Employee(String name, String position, Integer salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee("Hamdan", "CEO", 12000);

        System.out.println("Employee is :"+ employee.name);
        System.out.println("His Position is :"+ employee.position);
        System.out.println("Salary is :" + employee.salary);


    }
}

