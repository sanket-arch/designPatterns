import java.lang.reflect.Constructor;

public class Singleton {
    public static void main(String[] args) throws Exception {
        // If subclass1 and subclass2 has same hashcode that indicate thatboth the
        // object are same.
        // Subclass subclass1 = Subclass.createObject();
        // System.out.println(subclass1.hashCode());

        // Subclass subclass2 = Subclass.createObject();
        // System.out.println(subclass2.hashCode());

        /*
         * Breaking singleton pattern
         * 1. using refelction API
         * solution:-
         * a. if object present throw exception in the constructor of the class whose
         * object is being created.
         * b. using enum : make subclass as enum and use one variable to get the
         * instance
         * 
         * 2. using desearializaion
         * soltuion:-
         * a. implemet the readResolve
         * 
         */

        // using reflection API
        Subclass reflections1 = Subclass.createObject(); // crated one object
        System.out.println(reflections1.hashCode());

        Constructor<Subclass> reflcationConstructor = Subclass.class.getDeclaredConstructor();
        reflcationConstructor.setAccessible(true);
        Subclass reflectionSubclass = reflcationConstructor.newInstance();
        System.out.println(reflectionSubclass.hashCode());
    }
}