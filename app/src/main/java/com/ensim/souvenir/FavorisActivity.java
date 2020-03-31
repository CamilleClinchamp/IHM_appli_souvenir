package com.ensim.souvenir;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.ensim.souvenir.adapters.SouvenirsEltAdapter;
import com.ensim.souvenir.models.SouvenirsElt;

import java.util.ArrayList;
import java.util.List;

public class FavorisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoris);

        //list des souvenirs dans Favoris
        List<SouvenirsElt> souvenirsList_favoris = new ArrayList<>();
        souvenirsList_favoris.add(new SouvenirsElt("pikachu", "Japan Expo", "20/06/2019", "Le Mans"));
        souvenirsList_favoris.add(new SouvenirsElt("code_24h", "24h du Code", "12/11/2020", "Le Mans"));
        souvenirsList_favoris.add(new SouvenirsElt("poisson", "Koe no Katachi", "20/09/2019", "Le Mans"));
        souvenirsList_favoris.add(new SouvenirsElt("color_me_run", "Color Me Run", "07/07/2019", "Paris"));

        //get Grid View
        GridView SouGridView_Favoris = findViewById(R.id.sou_list_view_2);
        SouGridView_Favoris.setAdapter(new SouvenirsEltAdapter(this, souvenirsList_favoris));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        //MenuItem menuItem = menu.findItem(R.id.ic_search);
        //SearchView searchView = (SearchView) menuItem.getActionView();
        //searchView.setQueryHint("Chercher Souvenirs Ici...");
        return true;
    }

    public void openDialogFiltre(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.filtre_item, null);

        builder.setView(row);

        AlertDialog diaglog = builder.create();
        diaglog.show();

    }

}
