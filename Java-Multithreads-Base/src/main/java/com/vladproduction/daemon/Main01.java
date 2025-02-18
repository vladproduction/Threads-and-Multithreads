package com.vladproduction.daemon;

import static java.lang.System.*;
import static java.lang.Thread.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Main01 {

    private static final String MESSAGE_THAT_MAIN_THREAD_FINISHED = "MainThread is finished";
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.start();

        out.println(thread.isDaemon());
        out.println(MESSAGE_THAT_MAIN_THREAD_FINISHED);
    }

    private static final class Task implements Runnable{
        private static final String MESSAGE_OF_APP_STATE = "\tAPP IS WORK";
        private static final int SLEEPING_BETWEEN_MESSAGES = 2;
        @Override
        public void run() {
            try{
                while (true){
                    out.println(MESSAGE_OF_APP_STATE);
                    SECONDS.sleep(SLEEPING_BETWEEN_MESSAGES);
                }
            }catch (InterruptedException interruptedException){
                currentThread().interrupt();
            }
        }
    }
}
