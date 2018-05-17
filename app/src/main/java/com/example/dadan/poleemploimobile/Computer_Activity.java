package com.example.dadan.poleemploimobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dadan on 16/05/2018.
 */

public class Computer_Activity extends AppCompatActivity {

    private TextView computerName,description;
    private ImageView img;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);


        computerName = (TextView) findViewById(R.id.txttitle);
        description = (TextView) findViewById(R.id.txtDesc);
        img = (ImageView) findViewById(R.id.computer_thumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values

        computerName.setText(Title);
        description.setText(Description);
        img.setImageResource(image);
    }
}
