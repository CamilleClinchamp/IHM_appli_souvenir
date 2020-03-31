package com.ensim.souvenir;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import com.ensim.souvenir.adapters.SouvenirsEltAdapter;
import com.ensim.souvenir.models.SouvenirsElt;

import java.util.ArrayList;
import java.util.List;

public class AccueilActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        drawer=findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,
//                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
//
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();

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
        SouGridView.setAdapter(new SouvenirsEltAdapter(this, souvenirsList));
    }


//    @Override
//    public void onBackPressed() {
//        if(drawer.isDrawerOpen(GravityCompat.START)){
//
//            drawer.closeDrawer(GravityCompat.START);
//        }else{
//            super.onBackPressed();
//        }
//
//    }


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
                Intent myintentfavoris = new Intent(AccueilActivity.this, FavorisActivity.class);
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

    // Cette fonction pour afficher le dialog "filtre" lorqu'on appuye sur le bouton "filtre"
    public void openDialogFiltre(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.filtre_item,null);

        builder.setView(row);

        AlertDialog diaglog = builder.create();
        diaglog.show();

    }
}
