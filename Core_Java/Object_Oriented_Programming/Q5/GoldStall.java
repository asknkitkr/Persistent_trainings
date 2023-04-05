package Object_Oriented_Programming.Q5;

public class GoldStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer tvSet;

    public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }

    public GoldStall() {
    }

    public void display() {
        System.out.println("Stall Name:" + stallName + "\nCost:" + cost + ".Rs\nOwner Name:"
                + ownerName
                + "\nNumber of TV sets:" + tvSet);
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getTvSet() {
        return tvSet;
    }

    public void setTvSet(Integer tvSet) {
        this.tvSet = tvSet;
    }
}
