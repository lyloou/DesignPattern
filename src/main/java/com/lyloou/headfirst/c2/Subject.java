package com.lyloou.headfirst.c2;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    <T> void notifyObserver(T data);
}
