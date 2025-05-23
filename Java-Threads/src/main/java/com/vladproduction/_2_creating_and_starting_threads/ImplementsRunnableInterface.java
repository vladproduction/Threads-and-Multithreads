package com.vladproduction._2_creating_and_starting_threads;

public class ImplementsRunnableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside Thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside Thread: " + Thread.currentThread().getName());

        //Create Runnable
        Runnable runnable = new ImplementsRunnableInterface();

        //Create thread
        Thread thread = new Thread(runnable);

        System.out.println("Start Thread");
        thread.start();
    }
}
