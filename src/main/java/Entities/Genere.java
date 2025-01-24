package Entities;

import jakarta.persistence.*;

@Entity
@Table(name="Genere")
public class Genere {
    @Id
    @Column(name = "genere_id")
    private int genereID;
    private String nome;

    public Genere(int genereID, String nome) {
        this.genereID = genereID;
        this.nome = nome;
    }

    public Genere() {

    }

    public int getGenereID() {
        return genereID;
    }

    public void setGenereID(int genereID) {
        this.genereID = genereID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Genere [ID=" + genereID + ", Nome=" + nome + "]";
    }
}
