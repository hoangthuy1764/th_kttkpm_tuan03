package iuh.fit.se.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {

        for (Observer o : observers) {
            o.update(message);
        }
    }
}
