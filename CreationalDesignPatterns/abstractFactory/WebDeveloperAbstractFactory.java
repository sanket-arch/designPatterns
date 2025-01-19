package CreationalDesignPatterns.abstractFactory;

public class WebDeveloperAbstractFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
