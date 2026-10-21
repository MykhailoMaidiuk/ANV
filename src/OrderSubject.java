import java.util.*;

public class OrderSubject {

private List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    public void notifiedAll(String status){

        for (Observer observer : observers){

            observer.upate(status);

        }
    }
}
