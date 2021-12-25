package com.example.eremeeva_v_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    Button btnSteps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSteps =  findViewById(R.id.btnSteps);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, steps.class);
        startActivity(intent);
    }
}