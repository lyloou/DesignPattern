package _DObserver;

public interface Subject {
    void attach(Observer observer);
    void remove(Observer observer);
    void notify(String message);
}
