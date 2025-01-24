package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Autore")
public class Autore {
    @Id
    @Column(name = "autore_id")
    private int autoreID;
    private String nome;
    private String cognome;


    public Autore(int autoreID, String nome, String cognome) {
        this.autoreID = autoreID;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Autore() {

    }


    public int getAutoreID() {
        return autoreID;
    }

    public void setAutoreID(int autoreID) {
        this.autoreID = autoreID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    // toString per rappresentare l'autore
    @Override
    public String toString() {
        return "Autore [ID=" + autoreID + ", Nome=" + nome + ", Cognome=" + cognome + "]";
    }
}
