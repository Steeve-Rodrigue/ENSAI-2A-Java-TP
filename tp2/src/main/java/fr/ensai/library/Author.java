package fr.ensai.library;

import java.util.Objects;

/**
 * Represents an Author.
 */
public class Author {

    // Attributes
    private String name;
    private int age;
    private String nationality;

<<<<<<< HEAD
        /**
     * Constructs a new Author object.
     */
    public Author(String name) {
        this.name = name;
    }

=======
>>>>>>> d1aa0177c6ee9cabebaf77f3d7c3f3a5bf78f71f
    /**
     * Constructs a new Author object.
     */
    public Author(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two authors are considered equal if their names are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
        return Objects.equals(this.name, author.name);
    }

    @Override
    public String toString() {
        return String.format("Author %s", this.name);
    }

}
