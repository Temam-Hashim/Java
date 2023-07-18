class Employee {
    String name;
    int age;
    String designation;
    double salary;

    void getDetails(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        System.out.println("Name \t Age \t Designation \t Salary");
        System.out.println(name + "\t" + age + "\t" + designation + "\t" + salary);
    }

    void applySalaryRaise(double percentage) {
        double IncrementedSalary = salary + (salary * (percentage / 100));

        System.out.println("\n\n Salary after Increment: " + IncrementedSalary);
    }

}

public class OOP {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // get Detail
        emp.getDetails("Temam", 25, "Software Developer", 15000);
        // incremented salary
        emp.applySalaryRaise(20);
    }

}
