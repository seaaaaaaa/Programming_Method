package logic;

import java.util.ArrayList;

public class Server {
    private String name;
    private User owner;
    private ArrayList<Channel> channelList;
    private ArrayList<User> memberList;

    public Server(String name, User owner, TemplateType template) {
        this.name = name;
        if(name.isBlank()) {
            this.name = owner.getName()+" home";
        }
        this.owner = owner;
        this.channelList = new ArrayList<>();
        this.memberList = new ArrayList<>();
        memberList.add(owner);
        this.owner.addJoinedServersList(this);
        switch(template) {
            case TemplateType.BASIC:
                addChannel(owner,"general");
                break;
            case TemplateType.GAMING:
                addChannel(owner,"gaming");
                break;
            case TemplateType.STUDY:
               addChannel(owner,"homework-help");
                break;
        }
    }

    public boolean isMemberInServer(User user) {
        if(memberList.contains(user)) return true;
        return false;
    }

    public Channel addChannel(User user,String channelName) {
        if(this.owner.equals(user)) {
            Channel newChannel = new Channel(channelName);
            channelList.add(newChannel);
            return newChannel;
        }
        return null;
    }

    public User addUser(User user) {
        if(!memberList.contains(user)) {
            memberList.add(user);
            user.addJoinedServersList(this);
            return user;
        }
        return null;
    }

    public boolean kickUser(User kicker,User kicked) throws Exception {
        if (!owner.equals(kicker)) {
            throw new Exception();
        }
        else if(memberList.contains(kicker)&&((!memberList.contains(kicked))||owner.equals(kicked))) {
            return false;
        }
        else{
            kicked.getJoinedServersList().remove(this);
            memberList.remove(kicked);
            return true;
        }
    }

    public void setName(String name) {
        this.name = name;
        if(name.isBlank()) {
            this.name = owner.getName()+" home";
        }
    }

    public String getName() {
        return name;
    }

    public User getOwner() {
        return owner;
    }

    public ArrayList<Channel> getChannelList() {
        return channelList;
    }

    public ArrayList<User> getMemberList() {
        return memberList;
    }
}
