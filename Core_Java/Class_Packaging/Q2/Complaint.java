public class Complaint {
    String complaint;
    Customer customer;

    public Complaint() {
    }

    public Complaint(String complaint, Customer customer) {
        this.complaint = complaint;
        this.customer = customer;
    }

    public void display() {
        System.out.println("Name : " + customer.name + " ID : " + customer.id + " Country : " + customer.country
                + " Complaint : " + complaint);
    }
}