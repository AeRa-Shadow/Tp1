package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText name,password;
    public String Tpseudo;
    public String Tage;
    private View pseudo;
    private View age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.pseudo = findViewById(R.id.pseudo);
        this.age = findViewById(R.id.age);

    }


    public void goToAccueil(View view)
    {

        Tpseudo = name.getText().toString();
        Tage = password.getText().toString();

        Intent intent = new Intent(this, accueil.class);
        intent.putExtra("pseudo",Tpseudo);

        startActivity(intent);

    }
}