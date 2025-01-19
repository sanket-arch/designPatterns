package CreationalDesignPatterns.abstractFactory;

public class Client {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        e1.name();

        Employee e2 = EmployeeFactory.getEmployee(new CloudEngineerFactory());
        e2.name();
    }
}
