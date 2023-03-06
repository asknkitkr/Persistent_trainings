package Class_Packaging.Q2;

public class Customer implements Cloneable {
    String name;
    String id;
    String country;

    public Customer() {
    }

    public Customer(String name, String id, String country) {
        this.name = name;
        this.id = id;
        this.country = country;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}