package nov21.recap;

public class Employee {
    String name;
    double salary;
    static String companyName = "Microsoft";


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee(){
        System.out.println("NAME : "+name);
        System.out.println("Salary : "+ salary);
        System.out.println("Compnay : " + companyName);

    }

    public static void main(String[] args) {
        Employee employee = new Employee("Ekam", 100000);
        Employee employee2 = new Employee("Rajan", 110000);
        Employee employee3 = new Employee("Pankaj", 120000);
        employee.displayEmployee();
        employee2.displayEmployee();
        employee3.displayEmployee();
    }
}
