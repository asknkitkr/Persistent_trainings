package Object_Oriented_Programming.Q4;

public class StageEvent extends Event {
    private int noOfSeats;

    public StageEvent(String name, String detail, String type, String ownerName, Double costPerDay, int noOfSeats) {
        super(name, detail, type, ownerName, costPerDay);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
