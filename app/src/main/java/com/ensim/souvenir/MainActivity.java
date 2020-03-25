package com.ensim.souvenir;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.ensim.souvenir.adapters.SouvenirsEltAdapter;
import com.ensim.souvenir.models.SouvenirsElt;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //list des souvenirs
        List<SouvenirsElt> souvenirsList = new ArrayList<>();
        souvenirsList.add(new SouvenirsElt( "code_24h","24h du Code", "12/11/2020", "Le Mans"));
        souvenirsList.add(new SouvenirsElt( "color_me_run","Color Me Run", "07/07/2019", "Paris"));
        souvenirsList.add(new SouvenirsElt( "festival_manga","Festival Manga", "03/02/2019", "Paris"));
        souvenirsList.add(new SouvenirsElt( "bord_mer","Bord de la Mer", "25/09/2019", "Paris"));


        //get Grid View
        GridView SouGridView = findViewById(R.id.sou_list_view);
        SouGridView.setAdapter(new SouvenirsEltAdapter(this,souvenirsList));
    }
}
