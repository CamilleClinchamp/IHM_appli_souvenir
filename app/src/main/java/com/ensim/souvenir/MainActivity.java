package com.ensim.souvenir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFav(View view){
        Intent fav_data = new Intent(this, FavorisActivity.class);
        startActivity(fav_data);
    }

    public void openModeal(View view) {
    }
}
