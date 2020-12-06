package br.ufpr.tads.clublist.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
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
        TextView textViewCity = findViewById(R.id.textViewDetailCity);
        TextView textViewState = findViewById(R.id.textViewDetailState);
        ImageView imageViewImage = findViewById(R.id.imageViewDetailImage);
        TextView textViewTitulo = findViewById(R.id.textViewDetailTitulo);


        textViewName.setText(club.getName());
        textViewCity.setText(club.getCity());
        textViewState.setText(club.getState());
        textViewTitulo.setText(club.getTitulo());

        if (position == 0)
        {
            imageViewImage.setImageResource(R.drawable.atletico);
        }
        else if (position == 1)
        {
            imageViewImage.setImageResource(R.drawable.gremio);
        }
        else if (position == 2)
        {
            imageViewImage.setImageResource(R.drawable.sp);
        }
        else if (position == 3)
        {
            imageViewImage.setImageResource(R.drawable.coxa);
        }

    }
}