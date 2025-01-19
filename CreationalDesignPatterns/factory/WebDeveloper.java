package CreationalDesignPatterns.factory;

public class WebDeveloper implements Employee {
    public int salary() {
        System.out.println("inside the web developer calss");
        return 50000;
    }
}
