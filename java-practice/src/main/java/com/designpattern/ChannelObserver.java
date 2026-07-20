package com.designpattern;

import java.util.ArrayList;

public interface ChannelObserver {
    void update(String event);
}

class Subscriber implements ChannelObserver {
    private final String name;

    Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(this.name + ": Recieved " + event);
    }
}

class Channel {
    private ArrayList<ChannelObserver> observerList = new ArrayList<>();

    public void subscribe(ChannelObserver channelObserver) {
        System.out.println("Channel Subscribed");
        observerList.add(channelObserver);
    }

    public void unSubscribe(ChannelObserver channelObserver) {
        System.out.println("Channel Unsubscribed");
        observerList.remove(channelObserver);
    }

    public void publish(String video) {
        for(ChannelObserver channelObserver : observerList) {
            channelObserver.update("New Video " + video);
        }
    }
}

