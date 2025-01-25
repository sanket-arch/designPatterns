package BehavioralDesignPattern.ObserverPattern;

// Subject is interface which define the common functionality the publisher to have
public interface Subject {
    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    //send notification to all the observer
    void notifyChanges();
}
