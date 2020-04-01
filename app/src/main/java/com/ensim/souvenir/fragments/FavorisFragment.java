package com.ensim.souvenir.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.ensim.souvenir.R;
import com.ensim.souvenir.adapters.SouvenirsEltAdapter;
import com.ensim.souvenir.models.SouvenirsElt;

import java.util.ArrayList;
import java.util.List;

public class FavorisFragment extends Fragment  {


    public View onCreateView(@NonNull LayoutInflater inflater,
                            ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_favoris, container, false);

        Button filterBtn = root.findViewById(R.id.filterBtn);
        filterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialogFiltre();
            }
        });


        //list des souvenirs dans Favoris
        List<SouvenirsElt> souvenirsList_favoris = new ArrayList<>();
        souvenirsList_favoris.add(new SouvenirsElt("poisson", "Koe no Katachi", "20/09/2019", "Le Mans"));
        souvenirsList_favoris.add(new SouvenirsElt("color_me_run", "Color Me Run", "07/07/2019", "Paris"));
        souvenirsList_favoris.add(new SouvenirsElt("pikachu", "Japan Expo", "20/06/2019", "Le Mans"));

        //get Grid View
        GridView SouGridView_Favoris = root.findViewById(R.id.sou_list_view_2);
        SouGridView_Favoris.setAdapter(new SouvenirsEltAdapter(getActivity(), souvenirsList_favoris));

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
