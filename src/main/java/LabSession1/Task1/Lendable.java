package LabSession1.Task1;

public interface Lendable {

    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();

}
