package CreationalDesignPatterns.abstractFactory;

public class AndroidDeveloper implements Employee {
    @Override
    public String name() {
        System.out.println("I am andorid developer");
        return "ANDROID DEVELOPER";
    }

    @Override
    public int salary() {
        return 70000;
    }
}
