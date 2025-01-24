package DAO;

import Entities.Pubblicazione;

import java.util.List;

public interface PubblicazioneDAO {
    //creo le azioni che dovrà poter fare
    Pubblicazione getISBN(String isbn);
    List<Pubblicazione> getISBNs();
    void create(Pubblicazione isbn);
    void update(Pubblicazione isbn);
    void delete(Pubblicazione isbn);

}
