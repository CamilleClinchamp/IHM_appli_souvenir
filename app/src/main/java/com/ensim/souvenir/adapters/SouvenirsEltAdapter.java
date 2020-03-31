package com.ensim.souvenir.adapters;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.ensim.souvenir.NavigationDrawerActivity;
import com.ensim.souvenir.R;
import com.ensim.souvenir.fragments.FavorisFragment;
import com.ensim.souvenir.models.SouvenirsElt;

import java.util.List;

public class SouvenirsEltAdapter extends BaseAdapter {
    //fields
    private Context context;
    private List<SouvenirsElt> souvenirsList;
    private LayoutInflater inflater;

    //constructors
    public SouvenirsEltAdapter(Context context, List<SouvenirsElt> souvenirsList){
        this.context = context;
        this.souvenirsList = souvenirsList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return souvenirsList.size();
    }

    @Override
    public SouvenirsElt getItem(int position) {
        return souvenirsList.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view= inflater.inflate(R.layout.adapter_elt,null);

        //get informations about "souvenirs"
        SouvenirsElt currentSouvenirs = getItem(i);
        String souImage = currentSouvenirs.getImage();
        String souName = currentSouvenirs.getName();
        String souDate = currentSouvenirs.getDate();
        String souLieu = currentSouvenirs.getLieu();

        //get souvenirs_name view
        ImageView souImageView= view.findViewById(R.id.svn_icon);
        String ressourceName= souImage + "_image";
        int resId = context.getResources().getIdentifier(ressourceName, "drawable",context.getPackageName());
        souImageView.setImageResource(resId);

        //get souvenirs_name view
        TextView souNameView= view.findViewById(R.id.svn_name);
        souNameView.setText(souName);

        //get souvenirs_date view
        TextView souDateView= view.findViewById(R.id.svn_date);
        souDateView.setText("le " + souDate);

        //get souvenirs_lieu view
        TextView souLieuView= view.findViewById(R.id.svn_lieu);
        souLieuView.setText("à " + souLieu);

        CardView cardView = view.findViewById(R.id.card_view_list);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment f = ((Activity)context).getFragmentManager().findFragmentById(R.id.nav_host_fragment);
                NavController navController = Navigation.findNavController((Activity)context, R.id.nav_host_fragment);

                if(navController.getCurrentDestination().getLabel().equals("Accueil")) {
                    navController.navigate(R.id.action_nav_home_to_nav_consultation);
                }
                else {
                    navController.navigate(R.id.action_nav_favoris_to_nav_consultation);
                }
            }
        });

        return view;
    }
}
