package LabSession1.Task1;

public class Librarian extends User{

    private String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Librarian Name: "+getName());
        System.out.println("Librarian Contact Info: "+getContactInfo());
        System.out.println("Employee number "+employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void increamentBorroweBooks() {

    }

    @Override
    public void decreamentBorrowBooks() {

    }

    public void addNewBook(Book book){

    }

    public void removeBook(Book book){

    }
}
