package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class accueil extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);


        TextView pseudo;
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        pseudo = (TextView) findViewById(R.id.MsgAccueil);

        if (intent != null) {
            String j = (String) b.get("name");
            pseudo.setText("Compte ajouter " + j);
        }
    }
}

