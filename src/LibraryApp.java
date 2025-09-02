public class LibraryApp {
    public static void main(String[] args) {
        System.out.println("═══ Library Management System ═══\n");

        LibraryManager manager = new LibraryManager();

        manager.showBooks();
        manager.addBook();     // keep asking until valid book is added
        manager.removeBook();  // keep asking until valid book is removed

        System.out.println("Program completed successfully.");
    }
}
