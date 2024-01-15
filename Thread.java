
import java.util.*;
interface IObserver{
    void update(String state);
}
class ObserverA implements IObserver{
    String state;
    public void update(String state){
        this.state = state;
    }
}
class Thread{
    int id;
    String state;
    String priority;
    String culture;
    ArrayList<IObserver> observerList;
    public Thread(){
        this.state = "Thread Created";
        observerList = new ArrayList<>();
    }
    public void start(){
        this.state = "Running";
        notifyObserver();
    }
    public void abort(){
        this.state = "Aborted";
        notifyObserver();
    }
    public void sleep(){
        this.state = "sleep";
        notifyObserver();
    }
    public void suspend(){
        this.state = "suspended";
        notifyObserver();
    }
    public void subscribe(IObserver observer){
        observerList.add(observer);
    }
    public void unsubscribe(IObserver observer){
        observerList.remove(observer);
    }
    public void notifyObserver(){
        for(IObserver observer: observerList){
            observer.update(this.state);
        }
    }
    
}

class HelloWorld {
    public static void main(String[] args) {
        Thread threadObj = new Thread();
        IObserver iobserver = new ObserverA();
        threadObj.start();
        threadObj.abort();
        threadObj.sleep();
        threadObj.suspend();
        threadObj.subscribe(iobserver);
        threadObj.subscribe(iobserver);
    }
}
