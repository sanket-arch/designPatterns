package CreationalDesignPatterns.builder;

/*
 * # Generally this design pattern is used when there is need to immutable objects.
 * # When an object has many properties and some are optional, or when there are multiple ways to configure the object.
 * # It gives more control in the process of object creation.
 *
 */
public class Builder {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("1")
                .setUsername("test12")
                .setEmailId("xyz@gmail.com")
                .build();

        System.out.println(user);
    }

}
