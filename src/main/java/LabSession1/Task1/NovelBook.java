package LabSession1.Task1;

public class NovelBook extends Book{
    String genre;

    public NovelBook(String isbn, String title, String author, String genre) {
        super(isbn, title, author);
        this.genre = genre;
    }

    @Override
    void displayBookDetails() {
        System.out.println("=== NovelBook Details ===");
        System.out.println("Book ID: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + genre);
    }
}
