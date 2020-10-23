package ru.geekbrains.homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array <T>{
    private T [] obj;

    public Array(T[] obj){
        this.obj = obj;
    }

    public T getObj() {
        return (T) obj;
    }

    public void setObj(T obj) {
        this.obj = (T[]) obj;
    }

    public T[] changeElements( int a, int b){
        T val = obj[a];
        obj[a] = obj[b];
        obj[b] = val;
        return obj;
    }

    public ArrayList makeList(){
        ArrayList<T>list = new ArrayList<>();
        for (int i = 0; i<obj.length; i++){
            list.add(i, obj[i]);
        }
        return list;
    }

    @Override
    public String toString() {
        return  Arrays.toString(obj);
    }
}
