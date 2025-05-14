public class Event {
    private String name;
    private int capacity;
    private int numVolunteers;
    private String location;
    private String description;
    private String date;
    private String time;
    private String email_contact;
    private String name_contact;
    public Event(String name, int capacity, int numVolunteers, String location, String description, String date, String time, String email_contact, String name_contact){
        this.name = name;
        this.capacity = capacity;
        this.numVolunteers = numVolunteers;
        this.location = location;
        this.description = description;
        this.date = date;
        this.time = time;
        this.email_contact = email_contact;
        this.name_contact = name_contact;
    }

    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getNumVolunteers() {
        return numVolunteers;
    }
    public String getLocation() {
        return location;
    }
    public String getDescription() {
        return description;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public String getEmail_contact() {
        return email_contact;
    }
    public String getName_contact() {
        return name_contact;
    }
}
