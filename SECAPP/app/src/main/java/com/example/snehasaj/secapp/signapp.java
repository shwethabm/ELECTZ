package com.example.snehasaj.secapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signapp extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static EditText email;
    private static EditText floors;
    private static Button   login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signapp);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        email=(EditText)findViewById(R.id.email);
        floors=(EditText)findViewById(R.id.floor);
        login=(Button)findViewById(R.id.add);
    }
}
