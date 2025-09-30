package LabSession1.Task1;

import java.util.UUID;

public abstract class User {
    private String userId;
    private String name;

    private String contactInfo;

    private static int idCounter = 1000;

    private static int totalUsers = 0;

    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }
    public User(User other) {
        this.name = other.getName();
        this.contactInfo = other.getContactInfo();
        this.userId = other.getUserId();
        totalUsers++;
    }

    public User(){
     this.userId = generateUniqueId();
     this.name = "unknown";
     this.contactInfo = "not provided";
     totalUsers++;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    private static final String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
    public abstract void increamentBorroweBooks();
    public abstract void decreamentBorrowBooks();
}
