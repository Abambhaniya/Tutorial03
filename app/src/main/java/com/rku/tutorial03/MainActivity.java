package com.rku.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUsername,edtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        EditText edtusername = findViewById(R.id.edtUsername);
        EditText edtpassword = findViewById(R.id.edtPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String username = edtusername.getText().toString();
                String password = edtpassword.getText().toString();

                if(username.equals("") && password.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please fill the field", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(username.equals("admin@gmail.com") && password.equals("123"))
                {
                    Toast.makeText(MainActivity.this, "Login Succssfull", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,Welcome.class));
                    finish();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Plese, ener your correct data", Toast.LENGTH_SHORT).show();
                }
                 }
        });

    }
}