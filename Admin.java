package model;

public class Admin extends User {
    public Admin(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + name);
    }
}
