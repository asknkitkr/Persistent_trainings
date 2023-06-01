package Multithreading.Q2;

import java.util.List;

public class CityCount extends Thread {
    private String city;
    private Integer count;
    private List<User> userList;

    public CityCount(String city, List<User> userList) {
        this.city = city;
        this.count = 0;
        this.userList = userList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void run() {
        try {
            for (User user : userList) {
                if (user.getCity().equalsIgnoreCase(city)) {
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}