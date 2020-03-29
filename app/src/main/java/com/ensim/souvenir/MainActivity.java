package com.ensim.souvenir;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        souvenirsList.add(new SouvenirsElt("pikachu","Japan Expo","20/06/2019","Le Mans"));
        souvenirsList.add(new SouvenirsElt( "code_24h","24h du Code", "12/11/2020", "Le Mans"));
        souvenirsList.add(new SouvenirsElt("poisson","Koe no Katachi","20/09/2019","Le Mans"));
        souvenirsList.add(new SouvenirsElt( "color_me_run","Color Me Run", "07/07/2019", "Paris"));
        souvenirsList.add(new SouvenirsElt( "festival_manga","Festival Manga", "03/02/2019", "Paris"));
        souvenirsList.add(new SouvenirsElt( "bord_mer","Bord de la Mer", "25/09/2019", "Paris"));
        souvenirsList.add(new SouvenirsElt("charlotte","Etoiles fillantes","01/01/2020","La Flèche"));
        //get Grid View
        GridView SouGridView = findViewById(R.id.sou_list_view);
        SouGridView.setAdapter(new SouvenirsEltAdapter(this,souvenirsList));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_menu:
                // Afficher le menu
                return true;

            case R.id.ic_ecrire:
                // Renvoi à la page création un souvenirs
                return true;

            case R.id.ic_favoris:
                // Renvoie à la page Favoris
                Intent myintentfavoris = new Intent(MainActivity.this, FavorisActivity.class);
                startActivity(myintentfavoris);
                return false;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        //MenuItem menuItem = menu.findItem(R.id.ic_search);
        //SearchView searchView = (SearchView) menuItem.getActionView();
        //searchView.setQueryHint("Chercher Souvenirs Ici...");
        return true;
    }
}
