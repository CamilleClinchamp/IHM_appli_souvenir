package com.ensim.souvenir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Edition_des_souvenirs extends AppCompatActivity {

    String titre = "Edition des souvenirs";
    TextView zoneTitre = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edition_des_souvenirs);
        zoneTitre = (TextView)findViewById(R.id.TitrePage_Ed_Souvs);
        zoneTitre.setText(titre);
    }
}
