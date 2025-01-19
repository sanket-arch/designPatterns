package CreationalDesignPatterns.abstractFactory;

public class WebDeveloper implements Employee {

    @Override
    public String name() {
        System.out.println("I am web developer");
        return "WEB DEVELOPER";
    }

    @Override
    public int salary() {
        return 40000;
    }
}
