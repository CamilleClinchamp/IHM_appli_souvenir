package com.ensim.souvenir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ensim.souvenir.fragments.AccueilFragment;

public class LoginActivity extends AppCompatActivity {

    private Button btn_login1;
    private TextView tvRegister;
    private EditText email, mdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login1=findViewById(R.id.btn_login1);
        email=findViewById(R.id.email);
        mdp=findViewById(R.id.mdp);
        tvRegister=findViewById(R.id.tvRegister);

        btn_login1.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View v) {

            if (email.getText().toString().isEmpty() || mdp.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(LoginActivity.this, AccueilFragment.class);
                startActivity(intent);
            }
           }
        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterPage();
            }
        });
    }


    public void openRegisterPage() {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

}
