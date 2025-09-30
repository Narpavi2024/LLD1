package LabSession1.Task1;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {

    private static final List<Book> bookInventory = new ArrayList<>();
    private static final List<User> registeredUsers = new ArrayList<>();



    public static void addBook(Book book){
        bookInventory.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public static void registerUser(User user){
        registeredUsers.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public void printbook(){
        System.out.println("\n--- Library Books ---");
        for(Book book: bookInventory){
            book.displayBookDetails();
        }
    }

    public void printUser(){
        System.out.println("\n--- Registered Users ---");
        for(User user:registeredUsers){
            user.displayDashboard();
        }
    }

    public static List<Book> searchBooks(String criteria){
        List<Book> result = new ArrayList<>();
        for (Book book: bookInventory){
            if (book.getTitle().equalsIgnoreCase(criteria) || book.getAuthor().equalsIgnoreCase(criteria)){
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> searchBooks(String criteria,String types){
        List<Book> result = new ArrayList<>();
        for (Book book: bookInventory){
            boolean matchesCriteria  = book.getTitle().equalsIgnoreCase(criteria)
                    || book.getAuthor().equalsIgnoreCase(criteria);
            boolean matchtypes = false;
            if(types.equalsIgnoreCase("TextBook") && book instanceof TextBook){
             matchtypes = true;
            }else if (types.equalsIgnoreCase("NovelBook") && book instanceof NovelBook){
                matchtypes = true;
            }

            if (matchesCriteria && matchtypes){
                result.add(book);
            }
        }
        return result;
    }

    public static void displayAllBooks(){
        System.out.println("\n--- All Books in Library ---");
        if (bookInventory.isEmpty()){
            System.out.println("No books in inventory.");
        }else{
            for (Book book:bookInventory){
                book.displayBookDetails();
            }
        }
    }

    public static void displayRegisteredUsers(){
        System.out.println("\n--- Registered Users ---");
        if (registeredUsers.isEmpty()){
            System.out.println("No users registered.");
        }else{
            for(User user:registeredUsers){
                user.displayDashboard();
            }
        }
    }
}
