public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("2005", "Bob Benedict", 100);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}