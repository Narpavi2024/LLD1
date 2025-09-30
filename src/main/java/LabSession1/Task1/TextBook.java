package LabSession1.Task1;

public class TextBook extends Book{
    private String subject;
   private int edition;

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    void displayBookDetails() {
        System.out.println("=== TextBook Details ===");
        System.out.println("Book ID: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
    }
}
