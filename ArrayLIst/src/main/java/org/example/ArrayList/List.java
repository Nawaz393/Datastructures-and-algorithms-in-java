package org.example.ArrayList;

public class List<E>{
    int size;
    int capacity;
    Object [] array;
    public  List(){
        this.capacity=3;
        array= new Object[capacity];
    }
    public List(int capacity){
        this.capacity=capacity;
        array=new Object[capacity];
    }

    public boolean isEmpty() {
        return  size==0;

    }

    public boolean add(E data) {


        if(isFull()){

            resize();
        }

        array[size]=data;
size++;


        return  true;

    }


    public boolean remove() {
        return false;
    }


    public int size() {
        return size;

    }


    public boolean isFull() {
        return  capacity==size;
    }


    public Object get(int index) {
        if(isEmpty()){

            return "empty";

        }
        return array[index];

    }



    public boolean set(int index, E data) {
        return false;
    }


    private  void resize(){

        Object [] newarr=new Object[capacity*2];
        for(int i=0;i<array.length;i++){

            newarr[i]=array[i];

        }

        array=newarr;


    }
}


