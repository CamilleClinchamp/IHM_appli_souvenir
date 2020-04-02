package com.ensim.souvenir.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.ensim.souvenir.R;

public class EditionUnSouvenirFragment extends Fragment {

    EditText editName, editCategory, editDate, editTexte;
    ImageButton buttonValider, buttonAnnuler, buttonMenu;
    ImageView img;
    
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initialisation page
        super.onCreate(savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_edition_un_souvenir, container, false);

        this.editName  = (EditText) root.findViewById(R.id.name);
        this.editCategory = (EditText) root.findViewById(R.id.category);
        this.editDate  = (EditText) root.findViewById(R.id.date);
        this.editTexte = (EditText) root.findViewById(R.id.texte);

        this.buttonValider = (ImageButton) root.findViewById(R.id.btn_valider);
        this.buttonAnnuler = (ImageButton) root.findViewById(R.id.btn_annuler);
        //this.buttonMenu = (ImageButton) root.findViewById(R.id.menu);
        this.img = (ImageView) root.findViewById(R.id.image);

        buttonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String category = editCategory.getText().toString();
                String dat = editDate.getText().toString();
                String texte = editTexte.getText().toString();
                if(name == "" || category == "" || dat == "" || texte == "") {
                    // If name or password is not entered
                    Toast.makeText(getContext(), "Le nom, la catégorie, la date ainsi que la description sont obligatoire", Toast.LENGTH_LONG).show();
                }
//                else {
//                    Intent intent = new Intent(getContext(), EditionUnSouvenirFragment.class);
//                    intent.putExtra("Nom", name);
//                    intent.putExtra("categories", category);
//                    intent.putExtra("date", dat);
//                    intent.putExtra("description", texte);
//                    startActivity(intent);
//                }
            }

        });


        return root;
    }

}
