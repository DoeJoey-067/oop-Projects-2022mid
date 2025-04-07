package model;

public class Citizen extends User {
    public Citizen(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Citizen: " + name);
    }
}
