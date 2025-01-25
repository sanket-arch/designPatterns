package BehavioralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyChanges() {
        for (Observer observer : subscribers) {
            observer.notified();
        }
    }
}
