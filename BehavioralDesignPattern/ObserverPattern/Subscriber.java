package BehavioralDesignPattern.ObserverPattern;

public class Subscriber implements Observer{
    private String name;

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("Hello "+this.name +", Notification: new Notification received");
    }
}
