package com.example.dadan.poleemploimobile;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class BorneView extends AppCompatActivity {

    final String EXTRA_LOGIN = "user_login";
    List<Computer> computers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borne_view);

        computers = new ArrayList<>();


        computers.add(new Computer("Champ nom saisies", 1, R.drawable.ic_computer3));
        computers.add(new Computer("",2, "Disponible",R.drawable.ic_computer3));
        computers.add(new Computer("Espace en trop",3, "Occupé",R.drawable.ic_computer3));
        computers.add(new Computer("",4, "Besoin d'aide",R.drawable.ic_computer3));
        computers.add(new Computer("",5, "Disponible",R.drawable.ic_computer3));
        computers.add(new Computer("",6, "Besoin d'aide",R.drawable.ic_computer3));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,computers);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

        Intent intent = getIntent();
        TextView email = (TextView) findViewById(R.id.email_display);
        if (intent != null) {
            email.setText(intent.getStringExtra(EXTRA_LOGIN));
        }

    }


}


