package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Pubblicazione")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //Ho ereditarietà fra classi
public abstract class Pubblicazione {
    @Id
    @Column(name = "ISBN")
    private String ISBN;
    @Column(name = "Titolo")
    private String title;
    @Column(name = "AnnoPubblicazione")
    private int publicationYear;
    @Column(name = "NumeroPagine")
    private int numberOfPages;

    public Pubblicazione(String ISBN, String title, int publicationYear, int numberOfPages) {
        this.ISBN = ISBN;
        this.title = title;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;

    }

    public Pubblicazione() {

    }

    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    @Override
    public String toString(Libro lbr) {
        return ISBN + "\t" + title + "\t" + publicationYear + "\t" + numberOfPages;
    }
}
