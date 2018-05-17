package com.example.dadan.poleemploimobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dadan on 16/05/2018.
 */

public class Computer_Activity extends AppCompatActivity {

    private TextView computerName,description, type;
    private ImageView img, img_circle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);


        computerName = (TextView) findViewById(R.id.txttitle);
        description = (TextView) findViewById(R.id.txtDesc);
        img = (ImageView) findViewById(R.id.computer_thumbnail);
        type = (TextView) findViewById((R.id.etat_id));
        img_circle = (ImageView) findViewById(R.id.etat_img_id);

        // Recieve data
        Intent intent = getIntent();
        String title = intent.getExtras().getString("Title");
        String content = intent.getExtras().getString("Description");
        String etat = intent.getExtras().getString("Etat");
        int image = intent.getExtras().getInt("Thumbnail");

        // Setting values

        computerName.setText(title);
        description.setText(content);
        type.setText(etat);
        img.setImageResource(image);

        if (etat.equals( "Disponible")) {

            img_circle.setImageResource(R.drawable.circle_green);
        }
        if (etat.equals( "Occupé")) {
           System.out.println(etat);
            img_circle.setImageResource(R.drawable.non_dispo);
            }
        if (etat.equals( "Besoin d'aide")) {
            img_circle.setImageResource(R.drawable.circle_orange);
        }


    }
}
