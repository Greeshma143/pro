package com.example.ekatha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class presiregi extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6, e7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presiregi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        e7 = findViewById(R.id.t);
        e1 = findViewById(R.id.t1);
        e2 = findViewById(R.id.t2);
        e3 = findViewById(R.id.t3);
        e4 = findViewById(R.id.t4);
        e5 = findViewById(R.id.t5);
        e6 = findViewById(R.id.t6);
    }

    public void reset(View view) {
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
        e5.setText("");
        e6.setText("");
        e7.setText("");
    }

    public void sentreq(View view1) {
        int s6 = Integer.parseInt(e7.getText().toString().trim());

        String s1 = e1.getText().toString().trim();
        String s2 = e2.getText().toString().trim();

        String s3 = e4.getText().toString().trim();
        String s4 = e5.getText().toString().trim();
        String s5 = e6.getText().toString().trim();


        if (s1.equals(""))
        {
            e1.setError("Unitname is required");
        }
        else if (s2.equals(""))
        {
            e2.setError("Place is required");
        }
        else if (s3.equals("")) {
            e4.setError("Username is required");
        }
        else if (s4.equals("")) {
            e5.setError("Password is required");
        }
        else if (!s4.equals(s5)) {
            e6.setError("Password does not match");
        }

    }


}

