package fr.ensai.library;

/**
 * Represents a book.
 */
<<<<<<< HEAD
public class Book extends Item {

    // Attributes
    private String isbn;
    private Author author;
=======
public class Book {

    // Attributes
    private String isbn;
    private String title;
    private Author author;
    private int year;
    private int pageCount;
>>>>>>> d1aa0177c6ee9cabebaf77f3d7c3f3a5bf78f71f

    /**
     * Constructs a new Book object.
     */
<<<<<<< HEAD
    public Book(String isbn, Author author, String title, Integer year, Integer pageCount){
        super(title, year, pageCount);
        this.isbn = isbn;
        this.author = author;
=======
    public Book(String isbn, String title, Author author, int year, int pageCount) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.pageCount = pageCount;
>>>>>>> d1aa0177c6ee9cabebaf77f3d7c3f3a5bf78f71f
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return String.format("Book %s written by %s", this.title, this.author);
    }

}
