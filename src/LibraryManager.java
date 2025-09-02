import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);

        // Initialize with 3 sample titles
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
    }

    // 1. showBooks()
    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized!");
            }

            System.out.println("\n--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("No books available.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.\n");
        }
    }

    // 2. addBook() → keep retrying until valid input
    public void addBook() {
        boolean added = false;
        while (!added) {
            try {
                System.out.print("Enter book title to add: ");
                String title = scanner.nextLine();

                if (title == null || title.trim().isEmpty()) {
                    throw new IllegalArgumentException("Book title cannot be empty!");
                }
                if (title.trim().length() < 3) {
                    throw new IllegalArgumentException("Book title must be at least 3 characters long!");
                }

                books.add(title.trim());
                System.out.println("Book '" + title.trim() + "' added successfully!");
                added = true; // success
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Add book operation completed.\n");
            }
        }
    }

    // 3. removeBook() → keep retrying until valid removal
    public void removeBook() {
        if (books.isEmpty()) {
            System.out.println("Library is empty. No books to remove.");
            return;
        }

        boolean removed = false;
        while (!removed) {
            try {
                System.out.print("Enter book number to remove (1-" + books.size() + "): ");
                String input = scanner.nextLine();

                int index = Integer.parseInt(input); // may throw NumberFormatException
                if (index < 1 || index > books.size()) {
                    throw new ArrayIndexOutOfBoundsException(
                            "Invalid book number! Please enter between 1 and " + books.size() + "."
                    );
                }

                String removedBook = books.remove(index - 1);
                System.out.println("Book '" + removedBook + "' removed successfully!");
                removed = true; // success
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Remove book operation completed.\n");
            }
        }
    }
}
