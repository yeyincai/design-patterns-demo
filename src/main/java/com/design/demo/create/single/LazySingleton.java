package com.design.demo.create.single;


public class LazySingleton {

    private LazySingleton(){}

    public LazySingleton getInstance(){
        return  Singleton.lazySingleton;
    }

    private static class Singleton{
        private static LazySingleton lazySingleton = new LazySingleton();
    }
}
