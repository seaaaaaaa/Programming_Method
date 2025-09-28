package logic;

public class Ticket {
    private int type;
    private int priceperstation;

    private Station start;
    private Station end;

    public Ticket(int type,Station start,Station end) {
        setType(type);
        setStation(start,end);
    }

    public int getType() {
        return type;
    }

    public int getPricePerStation() {
        return priceperstation;
    }

    public Station getStart() {
        return start;
    }

    public Station getEnd() {
        return end;
    }

    public void setType(int type) {
        /* FILL CODE */
        switch(type){
            case 0:
                this.type = 0;
                this.priceperstation = 30;
                break;
            case 1:
                this.type = 1;
                this.priceperstation = 30;
                break;
            case 2:
                this.type = 2;
                this.priceperstation = 25;
                break;
            default:
                this.type = 1;
                this.priceperstation = 30;
                break;

        }
    }

    public void setStation(Station start,Station end) {
        /* FILL CODE */
        this.start = start;
        this.end = end;
    }

    public double calculatePrice() {
        /* FILL CODE */
        if(!isStationValid(start,end)) return -1.0;
        switch(type){
            case 0:
                if(this.getStationDistance(start,end)>4){
                    return 30.0*8.0/10.0*this.getStationDistance(start,end);
                }else{
                    return 30.0*this.getStationDistance(start,end);
                }
            case 1:
                return 30.0*this.getStationDistance(start,end);
            case 2:
                if(this.getStationDistance(start,end)<=6){
                    return 25.0*60.0/100.00*this.getStationDistance(start,end);
                } else {
                    return -1.0;
                }
        }
        return -1.0;
    }

    public String getDescription() {
        String typename;

        switch(type) {

            case 0:
                typename = "Student";
                break;
            case 1:
                //FILL CODE
                typename = "Adult";
                break;
            case 2:
                //FILL CODE
                typename = "Elderly";
                if (this.getStationDistance(start,end)>6) typename = "Invalid";
                break;
            default:
                typename = "Invalid";
        }

        return typename+" Ticket, from "+start.getName()+" to "+end.getName();
    }

    public boolean isStationValid(Station start,Station end) {
        if (type == 2 && this.getStationDistance(start, end) > 6) {
            return false;
        }

        if (start == end || start.getName().equals(end.getName())) {
            return false;
        }
        return true;
    }

    public int getStationDistance(Station start,Station end) {
        return Math.abs(start.getNumber()-end.getNumber());
    }

}
