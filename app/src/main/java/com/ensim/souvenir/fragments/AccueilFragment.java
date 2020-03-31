package com.ensim.souvenir.fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.ensim.souvenir.R;
import com.ensim.souvenir.adapters.SouvenirsEltAdapter;
import com.ensim.souvenir.models.SouvenirsElt;

import java.util.ArrayList;
import java.util.List;

public class AccueilFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_accueil, container, false);

        Button filterBtn = root.findViewById(R.id.filterBtn);
        filterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogFiltre();
            }
        });

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
        GridView SouGridView = root.findViewById(R.id.sou_list_view);
        SouGridView.setAdapter(new SouvenirsEltAdapter(getActivity(), souvenirsList));

        return root;
    }


    // Cette fonction pour afficher le dialog "filtre" lorqu'on appuye sur le bouton "filtre"

    public void openDialogFiltre(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View v = getActivity().getLayoutInflater().inflate(R.layout.filtre_item, new LinearLayout(getActivity()), false);
        builder.setView(v);
        AlertDialog diaglog = builder.create();
        diaglog.show();
    }
}
