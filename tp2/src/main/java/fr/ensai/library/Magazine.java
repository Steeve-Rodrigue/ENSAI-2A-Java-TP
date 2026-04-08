package fr.ensai.library;

/**
 * represent a magazine
 */
public class Magazine extends Item {

    //Attributes
    private String issn;
    private String issueNumber;


    public Magazine(String title, Integer year, Integer pageCount, String issn, String issueNumber) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }


    @Override
    public String toString() {
        return "Magazine [title=" + title + ", issn=" + issn + ", year=" + year + ", issueNumber=" + issueNumber
                + ", pageCount=" + pageCount + "]";
    }

    
    

}
