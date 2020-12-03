package br.ufpr.tads.clublist.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import br.ufpr.tads.clublist.R;
import br.ufpr.tads.clublist.RecyclerItemClickListener;
import br.ufpr.tads.clublist.adapter.AdapterClubs;
import br.ufpr.tads.clublist.model.Club;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewClubs;
    private List<Club> listClubs = new ArrayList<>();
    private Club club;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewClubs = findViewById(R.id.recyclerViewClubs);

        this.createClub();
        AdapterClubs adapter = new AdapterClubs(listClubs);

        RecyclerView.LayoutManager layoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerViewClubs.setLayoutManager(layoutManager);
        recyclerViewClubs.setHasFixedSize(true);

        recyclerViewClubs.addItemDecoration(
                new DividerItemDecoration(this, LinearLayout.VERTICAL));

        recyclerViewClubs.setAdapter(adapter);

        recyclerViewClubs.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerViewClubs,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Club obj = listClubs.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Selecionado " + obj.getName(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Clique longo",
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );
    }

    public void createClub() {
        club = new Club("Athletico Paranaense", "Curitiba");
        listClubs.add(club);
        club = new Club("Grêmio", "Porto Alegre");
        listClubs.add(club);
    }
}