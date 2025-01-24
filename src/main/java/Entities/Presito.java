package Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name="Prestito")
public class Presito {

    private int prestitoId;
    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Utente utente;
    @ManyToOne
    @JoinColumn(name = "isbn")
    private Pubblicazione pubblicazione;
    private LocalDate dataInizio;
    private LocalDate dataResPrevista;
    private LocalDate dataResEffettuta;

   public Presito(int prestitoId,Utente utente,Pubblicazione pubblicazione,Date dataInizio, Date DataResPrevista, Date dataResEffettuta) {
       this.prestitoId = prestitoId;
       this.utente = utente;
       this.pubblicazione = pubblicazione;
       this.dataInizio = dataInizio;
       this.dataResPrevista = dataResPrevista;
       this.dataResEffettuta = dataResEffettuta;

   }

    public Presito() {

    }


    public int getPrestitoId() {
        return prestitoId;
    }

    public void setPrestitoId(int prestitoId) {
        this.prestitoId = prestitoId;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Pubblicazione getPubblicazione() {
        return pubblicazione;
    }

    public void setPubblicazione(Pubblicazione pubblicazione) {
        this.pubblicazione = pubblicazione;
    }

    public LocalDate getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDate dataInizio) {
        this.dataInizio = dataInizio;
        this.dataResPrevista=dataInizio.plusDays(30);
    }

    public LocalDate getDataResPrevista() {
        return dataResPrevista;
    }

    public void setDataResPrevista(LocalDate dataResPrevista) {
        dataResPrevista = dataResPrevista;
    }

    public LocalDate getDataResEffettuta() {
        return dataResEffettuta;
    }

    public void setDataResEffettuta(LocalDate dataResEffettuta) {
        this.dataResEffettuta = dataResEffettuta;
    }

}
