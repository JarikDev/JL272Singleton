package com;

public class Main {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        singleton.i=5;
        System.out.println(singleton2.i);



    }
}
class Singleton{
      int i=0;
    static  Singleton singleton=new Singleton();
    private  Singleton() {
    }

    public static Singleton getInstance(){return singleton;}
}
