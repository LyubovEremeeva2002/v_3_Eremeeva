package com.example.eremeeva_v_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;

public class steps extends AppCompatActivity implements OnClickListener {


    Button btnMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        btnMap =  findViewById(R.id.btnMap);
    }

    @Override
    public void onClick(View view) {
        Intent i  = new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:55.754283,37.62002"));
        startActivity(i);
    }
}