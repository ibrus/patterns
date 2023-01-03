package observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    static List<Observer> observers = new ArrayList<>();
    String name;
    String state;

    public Observer(String name) {
        this.name = name;
        observers.add(this);
    }

    public void setState(String state){
        this.state = state;
        notifyAllObservers();
    }
    
    private void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    void update(){
        System.out.println(name + " changed status to " + state);
    }
}
