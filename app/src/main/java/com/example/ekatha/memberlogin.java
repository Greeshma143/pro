package com.example.ekatha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class memberlogin extends AppCompatActivity {
    private EditText USERNAME;
    private EditText PASSWORD;
    private Button LOGIN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memberlogin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        USERNAME = (EditText)findViewById(R.id.eusername);
        PASSWORD = (EditText)findViewById(R.id.epassword);
        LOGIN = (Button)findViewById(R.id.btlogin);
    }


}
