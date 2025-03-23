package com.oleksandr.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPortal {

    private List<Channel>  channelList = new ArrayList<>();

    public void subscribe(Channel channel) {
        channelList.add(channel);
    }
    public void unsubscribe(Channel channel) {
        channelList.remove(channel);
    }
    public void publish(String news) {
        for (Channel channel : channelList) {
            channel.update(news);
        }
    }

}
