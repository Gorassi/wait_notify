package com.kciray;

import  com.kciray.AutoStore.*;

public class Fabrik extends Thread {

    AutoStore autoStore;

    Fabrik(AutoStore autoStore){
        this.autoStore = autoStore;
    }

    @Override
    public void run() {
        System.out.println("Fabric started working");
        int number = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Fabrik made a car.");
            System.out.println("Fabrik: Count auto in Store = " + autoStore.addCar());
        }
    }
}