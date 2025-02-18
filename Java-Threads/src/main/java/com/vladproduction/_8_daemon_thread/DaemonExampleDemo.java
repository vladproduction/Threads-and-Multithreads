package com.vladproduction._8_daemon_thread;

public class DaemonExampleDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread oliviaKitchenCleaner = new KitchenCleaner();
        //if not specified oliviaKitchenCleaner thread as 'daemon thread' it will never terminate program
        oliviaKitchenCleaner.setDaemon(true);
        oliviaKitchenCleaner.start();

        System.out.println("Barron is cooking...");
        Thread.sleep(500);
        System.out.println("Barron is cooking...");
        Thread.sleep(500);
        System.out.println("Barron is cooking...");
        Thread.sleep(500);
        System.out.println("Barron is done!");

    }
}
