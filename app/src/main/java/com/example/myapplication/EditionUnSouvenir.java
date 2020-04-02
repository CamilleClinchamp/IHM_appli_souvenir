package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class EditionUnSouvenir extends AppCompatActivity {

    EditText editName, editCategory, editDate, editTexte;
    ImageButton buttonValider, buttonAnnuler, buttonMenu;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edition_un_souvenir);

        this.editName  = (EditText) findViewById(R.id.name);
        this.editCategory = (EditText) findViewById(R.id.category);
        this.editDate  = (EditText) findViewById(R.id.date);
        this.editTexte = (EditText) findViewById(R.id.texte);

        this.buttonValider = (ImageButton) findViewById(R.id.btn_valider);
        this.buttonAnnuler = (ImageButton) findViewById(R.id.btn_annuler);
        this.buttonMenu = (ImageButton) findViewById(R.id.menu);
        this.img = (ImageView) findViewById(R.id.image);

        buttonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String category = editCategory.getText().toString();
                String dat = editDate.getText().toString();
                String texte = editTexte.getText().toString();
                if(name == "" || category == "" || dat == "" || texte == "") {
                    // If name or password is not entered
                    Toast.makeText(getApplicationContext(), "Le nom, la catégorie, la date ainsi que la description sont obligatoire", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent intent = new Intent(getBaseContext(), EditionUnSouvenirValider.class);
                    intent.putExtra("Nom", name);
                    intent.putExtra("categories", category);
                    intent.putExtra("date", dat);
                    intent.putExtra("description", texte);
                    startActivity(intent);
                }
            }

        });
    }




}
