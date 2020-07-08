package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Pokemon> pArray =new ArrayList<>();


        Pokemon p1 = new Pokemon("Bulbasaur",R.drawable.bulbasaur,49,49,318);
        Pokemon p2 = new Pokemon("Charizard",R.drawable.charizard,84,78,534);
        Pokemon p3 = new Pokemon("pikachu",R.drawable.pika,55,40,320);.
        Pokemon p4 = new Pokemon("clefable",R.drawable.clef,70,73,483);

        pArray.add(p1);
        pArray.add(p2);
        pArray.add(p3);
        pArray.add(p4);

        RecyclerView rv = findViewById(R.id.Recyclerview);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this,);
        rv.setLayoutManager(lm);
    }
}