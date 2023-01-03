package observer;

public class ObserverTest {
    public static void main(String[] args) {
        Observer observer = new Observer("one");
        Observer observer1 = new Observer("two");
        observer.setState("new state");
        observer1.setState("hello");
    }
}
