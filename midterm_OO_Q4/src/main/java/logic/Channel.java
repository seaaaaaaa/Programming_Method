package logic;

import java.util.ArrayList;

public class Channel {
    private String name;
    private ArrayList<Message> messageList;

    public Channel(String name) {
        this.name = name;
        if(name.isBlank()){
            this.name = "off-topic";
        }
        messageList = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messageList.add(message);
    }

    public void setName(String name) {
        this.name = name;
        if(name.isBlank()) {
            this.name = "off-topic";
        }
    }

    public int getMessageCount() {
        return messageList.size();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Message> getMessageList() {
        return messageList;
    }
}
