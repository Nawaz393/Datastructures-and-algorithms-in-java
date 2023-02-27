package org.example.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public  class List<E> {
    int size;
    int capacity;
    Object[] array;

    public List() {
        this.capacity = 3;
        array = new Object[capacity];
    }

    public List(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public boolean add(E data) {


        if (isFull()) {

            resize();
        }

        array[size] = data;
        size++;


        return true;

    }


    public boolean add(int index, E data) {
        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException("please enter the valid index");

        }


        if (isFull()) {

            resize();
        }


        for (int i = size - 1; i > 0; i--) {

            array[i++] = array[i];
        }

        array[index] = data;
        size++;


        return true;


    }

    public boolean removeByIndex(int index) {

        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException("please enter the valid index");

        }
        if (isEmpty()) {
            throw new NoSuchElementException("list is empty");
        }

        for (int i = index; i < size - 1; i++) {

            array[i] = array[i + 1];


        }

        size--;


        return true;

    }


    public int size() {
        return size;

    }


    public boolean isFull() {
        return capacity == size;
    }


    public Object get(int index) {
        if (isEmpty()) {

            return "empty";

        }
        if (index < 0 || index > size) {

            throw new IndexOutOfBoundsException("please enter the valid index");

        }

        return array[index];

    }


    public boolean set(int index, E data) {
        return false;
    }

    public boolean removeByName(E data) {

        for (int i = 0; i < size; i++) {

            if (data == array[i]) {

                for (int j = i; j < size; j++) {
                    array[i] = array[i + 1];

                }
                size--;
                return true;


            }


        }


        throw new NoSuchElementException("data not found in list");


    }


    private void resize() {

        Object[] temp = new Object[capacity * 2];
        System.arraycopy(array, 0, temp, 0, array.length);

        array = temp;


    }

    public boolean clear(){

        if(isEmpty()){

            throw  new NoSuchElementException("list is empty");

        }


        size=0;

        return  true;




    }


    public E[] toArray(){


        if(isEmpty()){

            throw new  EmptyStackException();

        }
       Object [] temp=new Object[size];

       System.arraycopy(array,0,temp,0,size);


        return (E[]) temp;

    }









}


