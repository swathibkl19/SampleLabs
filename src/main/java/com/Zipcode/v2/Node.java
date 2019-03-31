package com.Zipcode.v2;

public class Node<T> {
    public static void main(String[] args) {

    }

    public T data ;


    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
