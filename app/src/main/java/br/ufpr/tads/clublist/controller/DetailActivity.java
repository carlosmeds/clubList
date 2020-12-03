package br.ufpr.tads.clublist.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import br.ufpr.tads.clublist.model.Club;
import br.ufpr.tads.clublist.R;

public class DetailActivity extends AppCompatActivity {
    protected int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        position = getIntent().getIntExtra("position", position);
        Club club = MainActivity.listClubs.get(position);

        TextView textViewName = findViewById(R.id.textViewDetailName);
        textViewName.setText(club.getName());
    }
}