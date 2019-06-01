package com.aca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyCollection<T> implements Iterable<T> {
    private List<T> values;

    public MyCollection(List<T> values) {
        this.values = values;
    }

    public MyCollection() {
        values = new ArrayList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return values.iterator();
    }

    public void add(T value) {
        if (!values.contains(value)) {
            values.add(value);
        }
    }

    public void add(Integer index, T value) {
        if (!values.contains(value)) {
            values.add(index, value);
        }
    }

    public T get(Integer index) {
        return values.get(index);
    }

    public boolean contains(T value) {
        return values.contains(value);
    }

    public void remove(T value) {
        values.remove(value);
    }

    public void remove(int index) {
        values.remove(index);
    }

    public Integer size() {
        return values.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : values) {
            sb.append(element);
            sb.append(", ");
        }


        sb.delete(sb.lastIndexOf(","), sb.lastIndexOf(",") + 2);
        return sb.toString();
    }

}
