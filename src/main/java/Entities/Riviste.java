package Entities;

import Entities.Enum.Periodicità;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
@Entity
@Table  (name="Riviste")
public class Riviste extends Pubblicazione {
    @Enumerated(EnumType.STRING)
    private Periodicità periodicita;

    public Riviste(String ISBN, String title, int publicationYear, int numberOfPages, Periodicità periodicita) {
        super( ISBN, title, publicationYear, numberOfPages);
        this.periodicita = periodicita;
    }

    public Riviste() {

    }


    public Periodicità getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicità periodicita) {
        this.periodicita = periodicita;
    }
}
