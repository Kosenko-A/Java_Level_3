package ru.geekbrains.homeworks;

import java.util.Collection;
import java.util.List;

public interface Box <T>{
    void put(T val);
    Collection<T> get();
    float getWeightHelp(List <T> items, float w);
    float getWeight();
}
