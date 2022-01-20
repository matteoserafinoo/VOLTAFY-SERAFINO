package com.example.volta_spotify_serafino;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Button btnInserisci;
EditText txtTitolo;
EditText Durata;
EditText datauscita;
EditText regista;

GestoreBrani gb;
String[] generi = {"Pop","Rock","Dance","Rap"};
Spinner spnGeneri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitolo = (EditText) findViewById(R.id.txtTitolo);
        btnInserisci =(Button) findViewById(R.id.btnInserisci);
        spnGeneri = (Spinner)findViewById(R.id.spgeneri);
        ArrayAdapter<String> aaG = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,generi);
        spnGeneri.setAdapter(aaG);
        gb = new GestoreBrani();

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gb.addbrano(txtTitolo.getText().toString());
                String genSelez = spnGeneri.getSelectedItem().toString();
            }
        });

    }
}