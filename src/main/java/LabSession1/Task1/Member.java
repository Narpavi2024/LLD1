package LabSession1.Task1;

public class Member extends User {

    private int borrowedBooksCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(){
        super();
        this.borrowedBooksCount = 0;
    }
    public Member(String name,String contactInfo,int borrowedBooksCount){
        super(name,contactInfo);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public Member(Member other) {
        super(other);
        this.borrowedBooksCount = other.borrowedBooksCount;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {

        System.out.println("Member Dashboard");
        System.out.println("Member Name: "+getName());
        System.out.println("Member Contact Info: "+getContactInfo());
        System.out.println("Books borrowed: "+borrowedBooksCount);

    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    public void increamentBorroweBooks(){
        if(canBorrowBooks()){
            borrowedBooksCount++;
        }else{
            System.out.println("Cannot borrow more books limit reached");
        }
    }

    @Override
    public void decreamentBorrowBooks() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--;
        } else {
            System.out.println("No borrowed books to return.");
        }
    }
}
