package com.ensim.souvenir.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ensim.souvenir.R;
import com.google.android.material.textfield.TextInputEditText;

public class EditionSouvenirFragment extends Fragment {

    String titre_page = "Edition des souvenirs";
    TextView zone_titre_page = null;

    //-------------------------------------------- 1er souvenir

    int photo_1 = R.drawable.poisson; // Image principale du souvenir
    ImageView zone_photo_1 = null;

    String champ_titre_1 = "Koe no Katachi"; // Titre du souvenir -> valeur
    TextInputEditText zone_titre_1 = null; //Objet de la page .xml qui contient la valeur du titre du souvenir

    ImageView img_titre_1 = null;   //Bouton pour enregistrer modif sur zone_titre_1 dans champ_titre_1

    String champ_date_1 = "20/09/2019"; // Date du souvenir -> valeur
    TextInputEditText zone_date_1 = null; //Objet de la page .xml qui contient la valeur de la date du souvenir

    ImageView img_date_1 = null;   //Bouton pour enregistrer modif sur zone_date_1 dans champ_date_1

    String champ_lieu_1 = "Le Mans"; // Lieu du souvenir -> valeur
    TextInputEditText zone_lieu_1 = null; //Objet de la page .xml qui contient la valeur du lieu du souvenir

    ImageView img_lieu_1 = null;   //Bouton pour enregistrer modif sur zone_lieu_1 dans champ_lieu_1

    Button bouton_1 = null;

    //-------------------------------------------- 2ème souvenir
    // Idem que plus haut pour le 2ème souvenir
    int photo_2 = R.drawable.charlotte;
    ImageView zone_photo_2 = null;

    String champ_titre_2 = "Etoiles fillantes";
    TextInputEditText zone_titre_2 = null;

    ImageView img_titre_2 = null;

    String champ_date_2 = "01/01/2020";
    TextInputEditText zone_date_2 = null;

    ImageView img_date_2 = null;

    String champ_lieu_2 = "La Flèche";
    TextInputEditText zone_lieu_2 = null;

    ImageView img_lieu_2 = null;

    Button bouton_2 = null;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Initialisation page
        super.onCreate(savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_edition_des_souvenirs, container, false);

//        // Affichage du titre de la page : Edition des souvenirs
//        zone_titre_page = (TextView)root.findViewById(R.id.TitrePage_Ed_Souvs);
//        zone_titre_page.setText(titre_page);

        //-------------------------------------------- 1er souvenir

        zone_photo_1 = (ImageView)root.findViewById(R.id.imageView_1);
        zone_photo_1.setImageResource(photo_1);

        zone_titre_1 = (TextInputEditText)root.findViewById(R.id.champ_titre_1);
        zone_titre_1.setText(champ_titre_1);

        img_titre_1 = (ImageView)root.findViewById(R.id.edit_titre_1);

        zone_date_1 = (TextInputEditText)root.findViewById(R.id.champ_date_1);
        zone_date_1.setText(champ_date_1);

        img_date_1 = (ImageView)root.findViewById(R.id.edit_date_1);

        zone_lieu_1 = (TextInputEditText)root.findViewById(R.id.champ_lieu_1);
        zone_lieu_1.setText(champ_lieu_1);

        img_lieu_1 = (ImageView)root.findViewById(R.id.edit_lieu_1);

        bouton_1 = (Button)root.findViewById(R.id.button_1);

        bouton_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //------------Modif lien : mettre edition d'un souvenir en destination

                // Edition d'un souvenir

//                startActivity(new Intent(EditionSouvenirFragment.this, MainActivity.class)); //------------Modif lien : mettre edition d'un souvenir en destination
                NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
                navController.navigate(R.id.action_nav_edition_souvenirs_to_nav_edition_souvenir);
            }
        });

        //-------------------------------------------- 2ème souvenir

        zone_photo_2 = (ImageView)root.findViewById(R.id.imageView_2);
        zone_photo_2.setImageResource(photo_2);

        zone_titre_2 = (TextInputEditText)root.findViewById(R.id.champ_titre_2);
        zone_titre_2.setText(champ_titre_2);

        img_titre_2 = (ImageView)root.findViewById(R.id.edit_titre_2);

        zone_date_2 = (TextInputEditText)root.findViewById(R.id.champ_date_2);
        zone_date_2.setText(champ_date_2);

        img_date_2 = (ImageView)root.findViewById(R.id.edit_date_2);

        zone_lieu_2 = (TextInputEditText)root.findViewById(R.id.champ_lieu_2);
        zone_lieu_2.setText(champ_lieu_2);

        img_lieu_2 = (ImageView)root.findViewById(R.id.edit_lieu_2);

        bouton_2 = (Button)root.findViewById(R.id.button_2);

        bouton_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NavController navController = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
                navController.navigate(R.id.action_nav_edition_souvenirs_to_nav_edition_souvenir);
            }
        });

        //===============================================================Modification des zones de texte
        //----------------------------------- 1er souvenir
        img_titre_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                champ_titre_1 =  zone_titre_1.getText().toString();
                zone_titre_1.setText(champ_titre_1);
            }
        });

        img_date_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                champ_date_1 =  zone_date_1.getText().toString();
                zone_date_1.setText(champ_date_1);
            }
        });

        img_lieu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                champ_lieu_1 =  zone_lieu_1.getText().toString();
                zone_lieu_1.setText(champ_lieu_1);
            }
        });

        //----------------------------------- 2ème souvenir
        img_titre_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                champ_titre_2 =  zone_titre_2.getText().toString();
                zone_titre_2.setText(champ_titre_2);
            }
        });

        img_date_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                champ_date_2 =  zone_date_2.getText().toString();
                zone_date_2.setText(champ_date_2);
            }
        });

        img_lieu_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                champ_lieu_2 =  zone_lieu_2.getText().toString();
                zone_lieu_2.setText(champ_lieu_2);
            }
        });

        return  root;
    }


}
