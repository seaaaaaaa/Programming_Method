package logic;

import java.util.ArrayList;

public class Region {
    private String name;
    private ArrayList<Player> playerList;
    private ArrayList<Quest> questList;

    public Region(String name) {
        this.name = name;
        if(name.isBlank()) {
            this.name = "Nowhere";
        }
        playerList = new ArrayList<>();
        questList = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
        if(name.isBlank()) {
            this.name = "Nowhere";
        }
    }

    public int getPlayerCount() {
        return playerList.size();
    }

    public double getRegionRank() {
        double sum = 0.0;
        for(Player p : playerList) {
            sum += p.getRank();
        }
        return Math.round(sum/playerList.size()*100)/100.0;
    }

    public  ArrayList<Quest> getAvailableQuests(Player viewer) {
        ArrayList<Quest> availableQuests = new ArrayList<>();
        for(Quest q : questList) {
            if((q.getAuthor().getName()!= viewer.getName())&&q.getStatus()==Status.AVAILABLE&&q.getRegion()==this) {
                availableQuests.add(q);
            }
        }
        return availableQuests;
    }

    public void addPlayerToRegion(Player p) {
        playerList.add(p);
    }

    public void addQuestToRegion(Quest q) {
        questList.add(q);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public ArrayList<Quest> getQuestList() {
        return questList;
    }

    public void setQuestList(ArrayList<Quest> questList) {
        this.questList = questList;
    }
}
