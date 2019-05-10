package com.xych.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    List<Observer> obs = new ArrayList<>();

    public void addObserver(Observer o) {
        if(o == null) {
            throw new NullPointerException();
        }
        if(!obs.contains(o)) {
            obs.add(o);
        }
    }

    public void deleteObserver(Observer o) {
        obs.remove(o);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        for(Observer o : obs) {
            o.update(this, arg);
        }
    }
}
