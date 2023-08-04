package com.antonio.evc3juan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtcorreo, edtpassword;
    Button btnLogin;
    String correo, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EnlazarControles();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo = edtcorreo.getText().toString();
                pass = edtpassword.getText().toString();
                if(correo.equals("antonio@gmail.com") && pass.equals("123")){
                    Intent i = new Intent(
                            LoginActivity.this,
                            ListarPlatosActivity.class
                    );
                }
                else{
                    Toast.makeText(LoginActivity.this,
                            "Correo o Contraseña invalidos", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


    void EnlazarControles(){

        btnLogin = findViewById(R.id.btnlogin);
        //
        edtpassword = findViewById(R.id.edtpassword);
        edtcorreo = findViewById(R.id.edtcorreo);

    }
}