package com.example.volta_spotify_serafino;

import java.util.Date;

public class Brano {
    private String titolo;
    private int durata;
    private String autore;
    private Date datapubblicazione;


    public Brano(String titolo) {
        this.titolo= titolo;
    }

    @Override
    public String toString() {
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", autore='" + autore + '\'' +
                ", datapubblicazione=" + datapubblicazione +
                '}';
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Date getDatapubblicazione() {
        return datapubblicazione;
    }

    public void setDatapubblicazione(Date datapubblicazione) {
        this.datapubblicazione = datapubblicazione;
    }

}

