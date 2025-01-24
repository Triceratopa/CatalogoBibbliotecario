package DAO;

import Entities.Pubblicazione;
import jakarta.persistence.EntityManager;

import java.util.List;

public class PubblicazioneDAO {
   private EntityManager em;

   public PubblicazioneDAO(EntityManager em) {
       this.em = em;
   }
   public void save(Pubblicazione pubblicazione){
       em.persist(pubblicazione);
   }
}
