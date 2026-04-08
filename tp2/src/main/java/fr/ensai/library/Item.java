package fr.ensai.library;

/**
 * Abstract class for the item    
} */
public abstract class Item {

    protected String title;
    protected Integer year;
    protected Integer pageCount;


    protected Item(String title, Integer year, Integer pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    } 

    
    public abstract String toString();
}
