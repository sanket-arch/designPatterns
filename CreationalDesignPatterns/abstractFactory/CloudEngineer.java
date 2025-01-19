package CreationalDesignPatterns.abstractFactory;

public class CloudEngineer implements Employee {
    @Override
    public String name() {
        System.out.println("I am Cloud Engineer");
        return "CLOUD ENGINEER";
    }

    @Override
    public int salary() {
        return 100000;
    }
}
