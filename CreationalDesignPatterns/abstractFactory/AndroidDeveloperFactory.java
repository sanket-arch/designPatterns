package CreationalDesignPatterns.abstractFactory;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory {

    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
