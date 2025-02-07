package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Libri")
public class Libro extends Pubblicazione {
    private String author;
    private String genre;

    public Libro(String ISBN, String title, int publicationYear, int numberOfPages, String author, String genre) {
        super(ISBN, title, publicationYear, numberOfPages);
        this.author = author;
        this.genre = genre;
    }

    public Libro() {

    }

    @Override
    public String toString(Libro libro) {
        return "";
    }

    @Override
    public String toString(Riviste riviste) {
        return "";
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    @ManyToOne
    @JoinColumn(name = "AutoreID")
    private Autore autore;

    @ManyToOne
    @JoinColumn(name = "GenereID")
    private Genere genere;


}
