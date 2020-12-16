package com.example.task2;

public class Constructor {

    int a, b, c;

    public Constructor(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Constructor(int a, int b, int c){
        this(a, b);
        this.c = c;
    }
}
