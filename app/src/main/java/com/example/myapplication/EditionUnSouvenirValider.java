package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditionUnSouvenirValider extends AppCompatActivity {

    TextView Name, Category, dates, textes;
    ImageButton buttonMe;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edition_un_souvenir_valider);

        String nom = getIntent().getStringExtra("Nom");
        String cat = getIntent().getStringExtra("categories");
        String datee = getIntent().getStringExtra("date");
        String descrpt = getIntent().getStringExtra("description");

        this.Name  = (TextView) findViewById(R.id.nom);
        this.Category = (TextView) findViewById(R.id.categorie);
        this.dates  = (TextView) findViewById(R.id.dates);
        this.textes = (TextView) findViewById(R.id.descript);

        this.img = (ImageView) findViewById(R.id.image);
        this.buttonMe = (ImageButton) findViewById(R.id.menu);

        Name.setText(nom);
        Category.setText(cat);
        dates.setText(datee);
        textes.setText(descrpt);


    }
}
