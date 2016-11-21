package com.design.demo.create.single;


public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
