//User class is to define each user with their own attributes
public class User {

    private String username;
    private String password;
    private String email;
    private boolean isOrganizer;

    public User(String username, String password, String email, boolean isOrganizer) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.isOrganizer = isOrganizer;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public boolean getIsOrganizer() {
        return isOrganizer;
    }
}
