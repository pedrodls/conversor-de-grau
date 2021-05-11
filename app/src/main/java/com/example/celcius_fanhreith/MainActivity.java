package com.example.celcius_fanhreith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        TextView txtRes = (TextView) findViewById(R.id.txtResult);

        EditText grauCel = (EditText) findViewById(R.id.editTextNumber);

        txtRes.setText((Integer.parseInt(grauCel.getText()+"") * 1.8 + 32)+"");
    }
}