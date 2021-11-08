package com.challange.done;



public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Helloo");
            }
        });
        thread.start();

    }
}
