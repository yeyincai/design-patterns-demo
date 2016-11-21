package com.design.demo.create.factory;


public class ShoesFactory {

    private static Shoes nick = new NickShoes();
    private static Shoes adidas = new AdidasShoes();

    public static Shoes getNickShoes() {
        return nick;
    }

    public static Shoes getAdidasShoes() {
        return adidas;
    }


}
