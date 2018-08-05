package com.example.snehasaj.secapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LOGIN extends AppCompatActivity {
    private static Button login;
    private static TextView attempts;
    private static TextView signup;
    private static EditText username;
    private static EditText password;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        attempts = (TextView) findViewById(R.id.attempt);
        signup = (TextView)findViewById(R.id.signup);
        username = (EditText) findViewById(R.id.user);
        password = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.log);
        attempts.setText("no of attempts remaining : 5");
        login.setOnClickListener((view) -> {
            validate(username.getText().toString(), password.getText().toString());
        });
        signup.setOnClickListener((View view) -> {
            startActivity(new Intent(LOGIN.this,signapp.class));
        });
    }


    private void validate(String userName, String userPassword) {

        if ((userName.equals("Sneha")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(LOGIN.this, signapp.class);
            startActivity(intent);
            System.out.println("heloo");
        }
        }


    }


