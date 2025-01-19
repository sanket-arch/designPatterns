package CreationalDesignPatterns.factory;

public class AndroidDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Inside android developer class");
        return 100000;
    }

}
