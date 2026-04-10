package fr.ensai.library;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> d1aa0177c6ee9cabebaf77f3d7c3f3a5bf78f71f
public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

<<<<<<< HEAD
        // Book fellowshipOfTheRing = new Book(
        //         "978-0-618-26025-6",
        //         "The Fellowship of the Ring",
        //         tolkien,
        //         1954,
        //         423);

        Book fellowshipOfTheRing = new Book(
            "978-0-618-26025-6",
            tolkien,
            "The Fellowship of the Ring",
            1954,
            423);

        System.out.println(fellowshipOfTheRing);

        Library myLibrary = new Library("ENSAI",new ArrayList<>());
        
        myLibrary.loadBooksFromCSV("books.csv");

        myLibrary.displayItems();
    
=======
        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing);
>>>>>>> d1aa0177c6ee9cabebaf77f3d7c3f3a5bf78f71f
    }
}