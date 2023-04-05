package Object_Oriented_Programming.Q5;

public class PremiumStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer projector;

    public PremiumStall(String stallName, Integer cost, String ownerName, Integer projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
    }

    public PremiumStall() {
    }

    public void display() {
        System.out.println("Stall Name:" + stallName + "\nCost:" + cost + ".Rs\nOwner Name:"
                + ownerName
                + "\nNumber of Projectors:" + projector);
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

    public Integer getProjector() {
        return projector;
    }

    public void setProjector(Integer projector) {
        this.projector = projector;
    }
}
