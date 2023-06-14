package com.kciray;

public class AutoStore {

    static int countCars = 0;

    public static void main(String[] args) {

        AutoStore autoStore = new AutoStore();
        Customer customer = new Customer(autoStore);
        customer.start();
        Fabrik fabrik = new Fabrik(autoStore);
        fabrik.start();

    }



        int addCar(){
        synchronized (this) {
            System.out.println("AutoStore got a car. Total count of car = " + ++countCars);
            notify();
            return countCars;
        }
    }

        int saleCar () {
            synchronized (this) {
                if(countCars <= 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Synchronize: AutoStore saled a car. Total count of car = " + --countCars);
                return countCars;
            }
    }

}
