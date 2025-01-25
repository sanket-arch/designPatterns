package BehavioralDesignPattern.ObserverPattern;

/*
* this design pattern basically works on publisher subscriber concept
*/
public class Demo {
    public static void main(String[] args) {
        Subject publisher = new Publisher();

        Observer subscriber1 = new Subscriber("subscriber 1");

        Observer subscriber2 = new Subscriber("subscriber 2");

        // subscriber is subscribing to the publisher
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        //Publisher posted new update hence the notification will be sent
        publisher.notifyChanges();

        publisher.unSubscribe(subscriber2);
        publisher.notifyChanges();
    }
}
