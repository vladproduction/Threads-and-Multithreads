package com.vladproduction.ch38_BlockingQueue;

import java.util.concurrent.BlockingQueue;

public abstract class MessageBroker<T> {

    private final BlockingQueue<T> messages;

    public MessageBroker(BlockingQueue<T> messages) {
        this.messages = messages;
    }

    public final void put(final T message) throws InterruptedException{
        messages.put(message);
    }

    public final T take() throws InterruptedException{
        return messages.take();
    }
}
