package com.example.volta_spotify_serafino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    final String TAG = "MainActivity2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        String mesric = i.getStringExtra("stringa finale");
        TextView visiona = (TextView) findViewById(R.id.txtTitolo);
        visiona.setText(mesric);
        Log.d(TAG,"Passaggio alla MainActivty avvenuto con successo");
    }
}