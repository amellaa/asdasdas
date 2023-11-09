package com.example.sqlitecrudalejandro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Resultado extends AppCompatActivity {


    Button btn1,btn2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        btn1=findViewById(R.id.btn_mapa);
        btn2=findViewById(R.id.btn_crud);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent opcion = new Intent(Resultado.this,mapa.class);
                startActivity(opcion);
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent opcion = new Intent(Resultado.this, crud.class);
                startActivity(opcion);
            }


        });
    }
}