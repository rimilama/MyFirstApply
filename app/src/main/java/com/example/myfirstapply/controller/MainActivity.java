package com.example.myfirstapply.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myfirstapply.R;
import com.example.myfirstapply.model.Utilisateur;

public class MainActivity extends AppCompatActivity {

    private TextView Text;
    private EditText Name;
    private Button Play;
    private Utilisateur Joueur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Text = (TextView) findViewById(R.id.activity_main_text);
        Name = (EditText) findViewById(R.id.activity_main_name);
        Play = (Button) findViewById(R.id.activity_main_play);

        Joueur = new Utilisateur();

        Play.setEnabled(false);
        Name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Play.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Joueur.setPseudo(Name.getText().toString());
                Intent GameLauncher = new Intent(MainActivity.this, GameActivity.class);
                startActivity(GameLauncher);
            }
        });
    }
}
