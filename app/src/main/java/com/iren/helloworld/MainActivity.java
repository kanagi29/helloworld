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
    public void tambah3poina(View view) {
        scorea += 3;
        TextView textViewA = findViewById(R.id.scorea);
        textViewA.setText(String.valueOf(scorea));
    }

    public void reset(View view) {
        scorea = 0;
        TextView scoreA = findViewById(R.id.scorea);
        scoreA.setText(String.valueOf(scorea));
    }
}
