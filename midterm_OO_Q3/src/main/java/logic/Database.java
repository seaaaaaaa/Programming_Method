package logic;

import java.util.ArrayList;

public class Database {
    private ArrayList<Player> playerList;
    private ArrayList<Region> regionList;

    public Database() {
        playerList = new ArrayList<>();
        regionList = new ArrayList<>();
    }

    public Database(ArrayList<Player> playerList, ArrayList<Region> regionList) {
        this.playerList = playerList;
        this.regionList = regionList;
    }

    public Player addPlayer(String name,Region region) throws Exception {
        boolean exists = false;
        for(Player p : playerList) {
            if(p.getName().equals(name)) {
                exists = true;

            }
        }
        if(!exists) {
            Player add = new Player(name);
            playerList.add(add);
            region.addPlayerToRegion(add);
            return add;
        }
        else{
            throw new Exception();
        }

    }

    public boolean addRegion(String name) {
        boolean exists = false;
        for(Region r : regionList) {
            if(r.getName().equals(name)) {
                exists = true;
            }
        }
        if(!exists) {
            Region add = new Region(name);
            regionList.add(add);
            return true;
        }
        return false;
    }

    public Region getRegionByName(String name) {
        for(Region r : regionList) {
            if(r.getName().equals(name)) {
                return r;
            }
        }
        return null;
    }

    public void addQuest(Player author,Region region,String name,String description) {
        Quest add = new Quest(author,region,name,description);
        region.addQuestToRegion(add);
    }


    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(ArrayList<Region> regionList) {
        this.regionList = regionList;
    }
}
