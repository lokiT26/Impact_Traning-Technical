class Employee {
    public void work() {
        System.out.println("Employee is working");
    }
    public double getSalary() {
        return 30000.0;
    }
}

class HrManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager is working");
    }
    public void addEmployee() {
        System.out.println("Employee added by HR Manager");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        HrManager obj = new HrManager();
        obj.work();
        obj.addEmployee();
    }
}
