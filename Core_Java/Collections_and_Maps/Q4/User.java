package Collections_and_Maps.Q4;

public class User implements Comparable<User> {
    private String username;
    private String bankname;

    public User() {
    }

    public User(String username, String bankname) {
        super();
        this.username = username;
        this.bankname = bankname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (username == null) {
            if (other.username != null)
                return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }

    @Override
    public int compareTo(User o) {
        return this.username.compareTo(o.username);
    }
}