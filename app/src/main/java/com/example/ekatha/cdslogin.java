package com.example.ekatha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cdslogin extends AppCompatActivity {
    private EditText USERNAME;
    private EditText PASSWORD;
    private Button LOGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cdslogin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        USERNAME = (EditText)findViewById(R.id.etusername);
        PASSWORD = (EditText)findViewById(R.id.etpassword);
        LOGIN = (Button)findViewById(R.id.btnlogin);

    }
    public void gotor(View view)
    {
        String s1=USERNAME.getText().toString().trim();
        String s2=PASSWORD.getText().toString().trim();
        if (s1 .equals( "ekatha"))
        {   if(s2 .equals( "1234567890"))
        {
            Intent go = new Intent(this,cdshome.class);
            startActivity(go);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"incorrect password",Toast.LENGTH_SHORT).show();
        }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"incorrect username",Toast.LENGTH_SHORT).show();
        }
    }

    }

