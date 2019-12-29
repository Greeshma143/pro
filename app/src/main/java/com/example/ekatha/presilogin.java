package com.example.ekatha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class presilogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presilogin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public  void  gotow(View view) {
        Intent ob = new Intent(this, ekatha2.class);
        startActivity(ob);
    }
}
