package com.kciray;

import  com.kciray.AutoStore.*;

public class Customer extends Thread {

    AutoStore autoStore;

    Customer(AutoStore autoStore){
        this.autoStore = autoStore;
    }

    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Customer buyed auto. Count in store = " + autoStore.saleCar());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
