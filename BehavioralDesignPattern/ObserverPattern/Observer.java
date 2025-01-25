package BehavioralDesignPattern.ObserverPattern;

/*
 * This interface contains all the methods which subscriber want to have
 */
public interface Observer {
    //This method will be used to perform action when new notification is received.
    void notified();
}
