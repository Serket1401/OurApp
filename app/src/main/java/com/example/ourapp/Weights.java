package com.example.ourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Weights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weights);

        Button emileweightbtn = (Button) findViewById(R.id.emileweightbtn);
        emileweightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText addweight = (EditText) findViewById(R.id.addweight)
            }
        });
        };
    }
}
