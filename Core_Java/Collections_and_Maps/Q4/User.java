package Collections_and_Maps.Q4;

import java.util.Objects;

public class User implements Comparable<User> {
    private String username;
    private String bankname;

    public User() {
    }

    public User(String username, String bankname) {
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
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    public int compareTo(User o) {
        return this.username.compareTo(o.getUsername());
    }
}
