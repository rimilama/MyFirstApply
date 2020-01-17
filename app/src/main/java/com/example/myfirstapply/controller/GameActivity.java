package com.example.myfirstapply.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.myfirstapply.R;

public class GameActivity extends AppCompatActivity {

    private TextView QuestionText;
    private Button Reponse1;
    private Button Reponse2;
    private Button Reponse3;
    private Button Reponse4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        QuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        Reponse1 = (Button) findViewById(R.id.activity_game_reponse1);
        Reponse2 = (Button) findViewById(R.id.activity_game_reponse2);
        Reponse3 = (Button) findViewById(R.id.activity_game_reponse3);
        Reponse4 = (Button) findViewById(R.id.activity_game_reponse4);

    }
}
