package observer;

import java.util.LinkedList;
import java.util.List;

public abstract class Observable {
    private List<Subscriber> subscribers = new LinkedList<>();

    public void subscribe(Subscriber s){
        subscribers.add(s);
    }

    protected void next(String name){
        for (Subscriber subscriber:
             subscribers) {
           subscriber.onNewVideo(name);
        }
    }
}
