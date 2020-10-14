package ru.geekbrains.homeworks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrangeBox <T extends Orange> implements Box<T>{

    private List<T> items = new ArrayList<>();
    Orange orange = new Orange();

    float w = orange.getWeight();

    @Override
    public void put(T val) {
        items.add(val);
    }

    @Override
    public Collection get() {
        return items;
    }

    public  float getWeightHelp(List <T> items, float w){
        float weight = (items.size())* w;
        return weight;
    }

    public float getWeight(){
        float fruitWeight = getWeightHelp(items,w);
        return fruitWeight;
    }

    public boolean compare(Box <T> itemsComp){
        float u = itemsComp.getWeight();
        if ((getWeightHelp(items,w)) == u){
            return true;
        } else {
            return false;
        }
    }

    public Box<T> changePlaces(Box <T> box){
        for (int i = 0; i<items.size(); i++){
            box.put(items.get(i));
        }
        return box;
    }

    @Override
    public String toString() {
        return "OrangeBox{" +
                "items=" + items +
                '}';
    }
}
