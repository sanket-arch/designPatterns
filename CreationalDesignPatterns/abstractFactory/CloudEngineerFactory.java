package CreationalDesignPatterns.abstractFactory;

public class CloudEngineerFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new CloudEngineer();
    }
}
