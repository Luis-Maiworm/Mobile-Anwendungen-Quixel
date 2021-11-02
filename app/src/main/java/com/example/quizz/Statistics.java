package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.quizz.data.playerData.Player;


public class Statistics extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        Intent getPlayer = getIntent();
        Player player = (Player) getPlayer.getSerializableExtra("Player");

        TextView textView = (TextView) findViewById(R.id.wonStats);
        textView.setText("Games won: " + player.getGamesWon());

    }
}