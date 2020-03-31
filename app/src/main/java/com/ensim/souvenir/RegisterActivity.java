package com.ensim.souvenir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private Button btn_register, btn_login;
    private EditText nom, prenom, NomDutilisateur, email, mdp;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//        getSupportActionBar().hide();

        btn_register = findViewById(R.id.btn_register);
        btn_login = findViewById(R.id.btn_login);
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        NomDutilisateur = findViewById(R.id.NomDutilisateur);
        email = findViewById(R.id.email);
        mdp = findViewById(R.id.mdp);


        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nom.getText().toString().isEmpty() || prenom.getText().toString().isEmpty() || email.getText().toString().isEmpty() || mdp.getText().toString().isEmpty()
                        || NomDutilisateur.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();

                } else{
                        openLoginPage();
                    }
            }

        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });
    }

    public void openLoginPage() {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
