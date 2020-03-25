package com.ensim.souvenir;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.synnapps.carouselview.*;

public class ConsultationSouvenir extends AppCompatActivity {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.pikachu, R.drawable.japan_expo, R.drawable.assa_class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultation_souvenir);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);
    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_modify:
                // Renvoi à la pge de modification d'un souvenir
                return true;

            case R.id.action_delete:
                // Suppression du souvenir
                return true;

            case R.id.action_favorite:
                // Renvoi à la page des favoris
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_resource, menu);

        //MenuItem searchItem = menu.findItem(R.id.action_search);
        //SearchView searchView =
        //        (SearchView) searchItem.getActionView();

        // Configure the search info and add any event listeners...

        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    public void seeKeyWordsMemories(View v){
        // Renvoi sur la page d'accueil avec filtres sur mots-clés
    }

    public void seeCategoryMemories(View v){
        // Renvoi sur la page d'accueil avec filtres sur catégorie
    }
}
