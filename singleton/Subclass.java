public class Subclass {
    private static Subclass object;

    private Subclass() {
        if (object != null) {
            throw new RuntimeException("tyring to break the singleton pattern");
        }
    }

    // Lazy approach
    public static Subclass createObject() {
        if (object == null) {
            // will allow only one thread to excute this piece of code at a time
            synchronized (Subclass.class) {
                if (object == null) {
                    object = new Subclass();
                }
            }
        }
        return object;
    }

    // This method will be called to avoid breaking the singleton pattern using
    // deserialization
    public Object readResolve() {
        return object;
    }
}
