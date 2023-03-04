package Features_of_java8.Q3;

public class TicketBooking {
    private String customerName;
    private Integer noOfTickets;
    private Double price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(Integer noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public TicketBooking() {
    }

    public TicketBooking(String custometName, Integer noOfTickets, Double price) {
        this.customerName = custometName;
        this.noOfTickets = noOfTickets;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15s %-15s", customerName, noOfTickets, price);
    }
}
