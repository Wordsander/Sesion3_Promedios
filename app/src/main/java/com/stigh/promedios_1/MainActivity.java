package com.stigh.promedios_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Objetos botones Generales
    private Button objbtnFilosofia, objbtnComunicacion, objbtnMatematica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Llamando los Botones
        objbtnFilosofia = (Button) findViewById(R.id.btnFilosofia);
        objbtnFilosofia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromedioUnidadesFilosofiaActivity.class);
                startActivity(intent);
            }
        });

        objbtnComunicacion = (Button) findViewById(R.id.btnComunicacion);
        objbtnComunicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromedioUnidadesComunicacionActivity.class);
                startActivity(intent);
            }
        });

        objbtnMatematica = (Button) findViewById(R.id.btnMatematica);
        objbtnMatematica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PromedioUnidadesMatematicaActivity.class);
                startActivity(intent);
            }
        });


    }
}