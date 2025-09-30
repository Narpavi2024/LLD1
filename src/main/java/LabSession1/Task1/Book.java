package LabSession1.Task1;

public abstract class Book implements Lendable {

   private String isbn;
   private String title;
   private String author;
   private boolean available;

    public Book() {
        this.available = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public Book(Book other) {
        this.isbn = other.getIsbn();
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.available = other.available;
    }



    abstract void displayBookDetails();

    @Override
    public boolean lend(User user) {
        if (available && user.canBorrowBooks()){
            available = false;
            user.increamentBorroweBooks();
            System.out.println(user.getName() + "borrowed the books: "+title);
            return true;
        }
        System.out.println(" Cannot lend " + title + " to " + user.getName());
        return false;
    }

    @Override
    public void returnBook(User user) {
         available = true;
         user.decreamentBorrowBooks();
        System.out.println(user.getName() + "returned the book: "+title);
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean isavailable) {
        available = isavailable;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
