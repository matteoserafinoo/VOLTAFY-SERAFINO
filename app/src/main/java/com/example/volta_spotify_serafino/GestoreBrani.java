package com.example.volta_spotify_serafino;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> ListaBrani;


    public GestoreBrani()
    {
        ListaBrani = new ArrayList<Brano>();

    }

    public void addbrano(String titolo)
    {
        Brano b = new Brano(titolo);
        ListaBrani.add(b);
    }

    public void visualiztrackilist()
    {
        StringBuilder stBui = new StringBuilder();
        for (Brano brv : ListaBrani)
        {
            stBui.append(brv.toString());
        }
    }
}
