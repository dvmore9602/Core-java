public class Book {

    int bookId = 501;
    String title = "Java Programming";
    String author = "James Gosling";
    String publisher = "Tech Publications";
    double price = 599.99;
    int pages = 450;
    float rating = 4.5f;
    String category = "Programming";
    String language = "English";
    char edition = '3';
    boolean available = true;
    short publicationYear = 2025;
    long ISBN = 9781234567890L;
    byte quantity = 10;
    String libraryName = "City Library";

    public static void main(String[] args) {

        Book b = new Book();

        System.out.println("Book ID: " + b.bookId);
        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Publisher: " + b.publisher);
        System.out.println("Price: " + b.price);
        System.out.println("Pages: " + b.pages);
        System.out.println("Rating: " + b.rating);
        System.out.println("Category: " + b.category);
        System.out.println("Language: " + b.language);
        System.out.println("Edition: " + b.edition);
        System.out.println("Available: " + b.available);
        System.out.println("Publication Year: " + b.publicationYear);
        System.out.println("ISBN: " + b.ISBN);
        System.out.println("Quantity: " + b.quantity);
        System.out.println("Library: " + b.libraryName);
    }
}
