package org.example.ArrayList;

public interface ArrayList<E> {


    boolean isEmpty();
    boolean add(Object data);
    boolean remove();
    boolean set(int index,E data);

    int size();


    boolean isFull();

    Object get(int index);




}
