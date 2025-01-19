package CreationalDesignPatterns.factory;

/*
 * When there is superclass and there are multiple subclass and we want to create object based on the input then we use this patterns
 *
 * In this case factory class take the responsibilty of crating the object
 *
 *
 */
public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee.salary());
    }

}
