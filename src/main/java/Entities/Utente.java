package Entities;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="Utente")
public class Utente {
    private String nome;
    private String cognome;
    private Date dataNascita;
    private int utenteId;

    public Utente(String nome, String cognome, Date dataNascita, int utenteId) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.utenteId = utenteId;
    }

    public Utente() {

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

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public int getUtenteId() {
        return utenteId;
    }

    public void setUtenteId(int utenteId) {
        this.utenteId = utenteId;
    }
}
