package com.iren.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guideline);
    }

    private int scorea = 0;
    private int scoreb = 0;
    public void tambah3poina(View view) {
        scorea += 3;
        TextView textViewA = findViewById(R.id.scorea);
        textViewA.setText(String.valueOf(scorea));
    }

    public void tambah2poina(View view) {
        scorea += 2;
        TextView textViewA = findViewById(R.id.scorea);
        textViewA.setText(String.valueOf(scorea));
    }

    public void tambang1poina(View view) {
        scorea += 1;
        TextView textViewA = findViewById(R.id.scorea);
        textViewA.setText(String.valueOf(scorea));
    }

    public void reset(View view) {
        scorea = 0;
        scoreb = 0;
        TextView scoreA = findViewById(R.id.scorea);
        scoreA.setText(String.valueOf(scorea));
        TextView scoreB = findViewById(R.id.scoreb);
        scoreB.setText(String.valueOf(scoreb));
    }


    public void tambah3poinb(View view) {
        scoreb += 3;
        TextView textViewB = findViewById(R.id.scoreb);
        textViewB.setText(String.valueOf(scoreb));
    }

    public void tambah2poinb(View view) {
        scoreb += 2;
        TextView textViewB = findViewById(R.id.scoreb);
        textViewB.setText(String.valueOf(scoreb));
    }

    public void tambah1poinb(View view) {
        scoreb += 1;
        TextView textViewB = findViewById(R.id.scoreb);
        textViewB.setText(String.valueOf(scoreb));
    }
}
