package com.example.ekatha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }
    public  void  gotoq(View view)
    {
        Intent ob=new Intent(this,ekatha.class);
        startActivity(ob);
    }
    public  void  gotoe(View view) {
        Intent ob = new Intent(this, ekatha3.class);
        startActivity(ob);
    }
    public  void  gotoz(View view) {
        Intent ob = new Intent(this, ekatha4.class);
        startActivity(ob);
    }
    public  void  gotoj(View view) {
        Intent ob = new Intent(this, ekatha5.class);
        startActivity(ob);
    }

}
