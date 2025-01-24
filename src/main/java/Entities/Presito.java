package Entities;

import java.util.Date;

public class Presito {
    private int prestitoId;
    private Utente utente;
    private Pubblicazione pubblicazione;
    private Date dataInizio;
    private Date DataResPrevista;
    private Date dataResEffettuta;

   public Presito(int prestitoId,Utente utente,Pubblicazione pubblicazione,Date dataInizio, Date DataResPrevista, Date dataResEffettuta) {
       this.prestitoId = prestitoId;
       this.utente = utente;
       this.pubblicazione = pubblicazione;
       this.dataInizio = dataInizio;
       this.DataResPrevista = DataResPrevista;
       this.dataResEffettuta = dataResEffettuta;

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

    public Date getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(Date dataInizio) {
        this.dataInizio = dataInizio;
    }

    public Date getDataResPrevista() {
        return DataResPrevista;
    }

    public void setDataResPrevista(Date dataResPrevista) {
        DataResPrevista = dataResPrevista;
    }

    public Date getDataResEffettuta() {
        return dataResEffettuta;
    }

    public void setDataResEffettuta(Date dataResEffettuta) {
        this.dataResEffettuta = dataResEffettuta;
    }
}
