package Features_of_java8.Q2;

import java.util.List;

public class Event {
    private String eventName;
    private String organiserName;
    private Double eventCost;

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }

    public Double getEventCost() {
        return eventCost;
    }

    public void setEventCost(Double eventCost) {
        this.eventCost = eventCost;
    }

    public Event() {
    }

    public Event(String eventName, String organiserName, Double eventCost) {
        this.eventName = eventName;
        this.organiserName = organiserName;
        this.eventCost = eventCost;
    }

    public void display(List<Event> eventList) {
        eventList.forEach(e -> System.out.format("%s|%s|%s\n",
                e.getEventName(), e.getOrganiserName(), e.getEventCost()));
    }
}
