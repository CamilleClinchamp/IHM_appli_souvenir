package com.ensim.souvenir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Edition_des_souvenirs extends AppCompatActivity {

    String titre = "Edition des souvenirs"; // valeurs d'un souvenir
    TextView zoneTitrePage = null;

    String champ_titre = "Koe no Katachi";
    TextInputEditText zone_titre = null;

    String champ_date = "20/09/2019";
    TextInputEditText zone_date = null;

    String champ_lieu = "Le Mans";
    TextInputEditText zone_lieu = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edition_des_souvenirs);
        zoneTitrePage = (TextView)findViewById(R.id.TitrePage_Ed_Souvs);
        zoneTitrePage.setText(titre);

        zone_titre = (TextInputEditText)findViewById(R.id.champ_titre);
        zone_titre.setText(champ_titre);

        zone_date = (TextInputEditText)findViewById(R.id.champ_date);
        zone_date.setText(champ_date);

        zone_lieu = (TextInputEditText)findViewById(R.id.champ_lieu);
        zone_lieu.setText(champ_lieu);
    }
}
