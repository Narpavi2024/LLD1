package LabSession1.Task1;

public class Testclass {

//    Example: For the Library System you wrote →
//
//    Entities: User, Member, Librarian, Book, TextBook, NovelBook.
//
//            Interfaces: Lendable.
//
//            Services: LibraryManagementSystem.
//
//            Constraints: Borrow limit, late fees, availability

    public static void main(String[] args) {
//        Member m1 = new Member();
//        m1.displayDashboard();
//        System.out.println("Can Borrow books?"+m1.canBorrowBooks());

        // Using parameterized constructor
//        Member m2 = new Member("Sabari", "Sabari@example.com", 3);
//        m2.displayDashboard();
//        System.out.println("Can borrow? " + m2.canBorrowBooks());
//
//        // Copy constructor
//        Member m3 = new Member(m2);
//        m3.displayDashboard();
//
//        //simulating borrow more books
//        m2.setBorrowedBooksCount(5);
//        m2.displayDashboard();
//        System.out.println("Can borrow books :"+m2.canBorrowBooks());
//
//
//        // Create Librarian
//        Librarian lib = new Librarian("Mr. Smith", "smith@library.com", "EMP123");
//        lib.displayDashboard();
//        System.out.println("Can Librarian borrow? " + lib.canBorrowBooks());
//
//        // Total Users count check
//        System.out.println("Total Users created: " + User.getTotalUsers());
//
//        // Verify generateUniqueId is final (can't be overridden)
//        System.out.println("User1 ID: " + m1.getUserId());

        // Create a TextBook object
//        TextBook textbook = new TextBook("101", "Java Programming", "James Gosling", "Computer Science", 3);
//        textbook.displayBookDetails();
//
//        System.out.println();
//
//        // Create a NovelBook object
//        NovelBook novel = new NovelBook("201", "The Alchemist", "Paulo Coelho", "Fiction");
//        novel.displayBookDetails();

        // Create system
//        LibraryManagementSystem system = new LibraryManagementSystem();
//
//        // Add some books
//        Book b1 = new  TextBook("101", "Java Programming", "James Gosling", "Computer Science", 3);
//        Book b2 = new NovelBook("201", "The Alchemist", "Paulo Coelho", "Fiction");
//        system.addBook(b1);
//        system.addBook(b2);
//
//        // Register some users
//        User u1 = new Member("Alice", "alice@example.com", 2);
//        User u2 = new Librarian("Mr. Smith", "smith@library.com", "EMP123");
//        system.registerUser(u1);
//        system.registerUser(u2);

        // Add some books
//        LibraryManagementSystem.addBook(new TextBook("101","Java Basics", "James", "Programming", 1));
//        LibraryManagementSystem.addBook(new TextBook("102","Spring Boot", "Rod Johnson", "Programming", 2));
//        LibraryManagementSystem.addBook(new NovelBook("103","The Alchemist", "Paulo Coelho", "Adventure"));
//        LibraryManagementSystem.addBook(new NovelBook("104","Harry Potter", "J.K. Rowling", "Fantasy"));
//
//        // Search by title
//        System.out.println("Search by title 'The Alchemist':");
//        for (Book b : LibraryManagementSystem.searchBooks("The Alchemist")) {
//            b.displayBookDetails();
//        }
//
//        // Search by author + filter type
//        System.out.println("\nSearch 'James' in TextBook type:");
//        for (Book b : LibraryManagementSystem.searchBooks("James", "TextBook")) {
//            b.displayBookDetails();
//        }
//
//        System.out.println("\nSearch 'J.K. Rowling' in NovelBook type:");
//        for (Book b : LibraryManagementSystem.searchBooks("J.K. Rowling", "NovelBook")) {
//            b.displayBookDetails();
//        }
        // --- Step 3.1: Add Books ---
//        TextBook tb1 = new TextBook("101","Java Programming", "James Gosling", "Programming", 1);
//        TextBook tb2 = new TextBook("102","Spring Boot in Action", "Craig Walls", "Programming", 2);
//
//        NovelBook nb1 = new NovelBook("103","The Alchemist", "Paulo Coelho", "Adventure");
//        NovelBook nb2 = new NovelBook("104","Harry Potter", "J.K. Rowling", "Fantasy");
//
//        LibraryManagementSystem.addBook(tb1);
//        LibraryManagementSystem.addBook(tb2);
//        LibraryManagementSystem.addBook(nb1);
//        LibraryManagementSystem.addBook(nb2);
//
//        // --- Step 3.2: Register Users ---
//        Member m1 = new Member("Alice", "alice@example.com",5);
//        Librarian l1 = new Librarian("Mr. Smith", "smith@example.com","12345");
//
//        LibraryManagementSystem.registerUser(m1);
//        LibraryManagementSystem.registerUser(l1);
//
//        // --- Step 3.3: Print All Details ---
//        LibraryManagementSystem lib = new LibraryManagementSystem(); // instance needed for non-static methods
//        lib.printbook();
//        lib.printUser();

//        LibraryManagementSystem lms = new LibraryManagementSystem();
//
//        Member member = new Member("Ayush", "M001",5);
//        Librarian librarian = new Librarian("Rohit", "L001", "1");
//
//        lms.registerUser(member);
//        lms.registerUser(librarian);
//
//        TextBook textBook =
//                new TextBook("ISBN1", "Java Programming", "Author A", "Education", 1);
//        NovelBook novelBook =
//                new NovelBook("ISBN2", "Mystery of the Old House", "Author B", "Fiction");
//
//        lms.addBook(textBook);
//        lms.addBook(novelBook);
//
//        System.out.println("Library Management System initialized successfully.");
//
//        textBook.lend(member);
//
//        System.out.println("Debug");
//
//        textBook.returnBook(member);
//
//        System.out.println("Debug");

        // --- Test Constructors ---
       Book paramBook = new TextBook("ISBN001", "Java Programming", "James Gosling", "Programming", 1);
      // Add to library
        LibraryManagementSystem.addBook(paramBook);


        // Register users
        Member m1 = new Member("Alice", "alice@example.com",12);
        Librarian l1 = new Librarian("Mr. Smith", "smith@example.com","12345");
        LibraryManagementSystem.registerUser(m1);
        LibraryManagementSystem.registerUser(l1);

        // Display all books & users
        LibraryManagementSystem.displayAllBooks();
        LibraryManagementSystem.displayRegisteredUsers();

        // --- Searching ---
        System.out.println("\n--- Search Results ---");
        for (Book b : LibraryManagementSystem.searchBooks("Java Programming")) {
            b.displayBookDetails();
        }

        for (Book b : LibraryManagementSystem.searchBooks("James Gosling", "TextBook")) {
            b.displayBookDetails();
        }
    }

}
