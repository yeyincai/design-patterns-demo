package com.design.demo.create.single;


public class LazySingletonWithParameter {

    private static LazySingletonWithParameter lazySingletonWithParameter = null;

    private String parameter;

    private LazySingletonWithParameter(String parameter) {
        this.parameter = parameter;
    }

    public static synchronized LazySingletonWithParameter getInstance(String parameter) {
        if (lazySingletonWithParameter == null) {
            //this parameter no change
            lazySingletonWithParameter = new LazySingletonWithParameter(parameter);
        }
        return lazySingletonWithParameter;
    }

    public static void main(String[] args) {

    }

}
