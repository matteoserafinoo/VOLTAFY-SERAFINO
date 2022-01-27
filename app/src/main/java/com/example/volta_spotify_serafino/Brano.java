package com.example.volta_spotify_serafino;

import android.util.Log;

import java.util.Date;

public class Brano {
    private String titolo;
    private int durata;
    private String autore;
    private Date datapubblicazione;
    final String TAG = "ClasseBrano";


    public Brano(String titolo) {
        this.titolo= titolo;
        Log.d(TAG,"INstanziamo un oggetto brano");

    }

    @Override
    public String toString() {
        Log.d(TAG,"Richiamiamo il metodo ToString");
        return "Brano{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", autore='" + autore + '\'' +
                ", datapubblicazione=" + datapubblicazione +
                '}';


    }

    public String getTitolo() {
        Log.d(TAG,"Richiamiamo il metodo getTitolo");

        return titolo;
    }

    public void setTitolo(String titolo) {

        Log.d(TAG,"Richiamiamo il metodo setTitolo");
        this.titolo = titolo;
    }

    public int getDurata() {
        Log.d(TAG,"Richiamiamo il metodo getDurata");
        return durata;
    }

    public void setDurata(int durata) {
        Log.d(TAG,"Richiamiamo il metodo setDurata");
        this.durata = durata;
    }

    public String getAutore() {
        Log.d(TAG,"Richiamiamo il metodo getAutore");
        return autore;
    }

    public void setAutore(String autore) {
        Log.d(TAG,"Richiamiamo il metodo setAutore");
        this.autore = autore;
    }

    public Date getDatapubblicazione() {
        Log.d(TAG,"Richiamiamo il metodo getDatapubblicazione");
        return datapubblicazione;
    }

    public void setDatapubblicazione(Date datapubblicazione) {
        Log.d(TAG,"Richiamiamo il metodo setDatapubblicazione");
        this.datapubblicazione = datapubblicazione;
    }

}

