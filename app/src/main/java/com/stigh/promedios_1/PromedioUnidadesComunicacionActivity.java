package com.stigh.promedios_1;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PromedioUnidadesComunicacionActivity extends AppCompatActivity {

    //Objetos para la Activity Comunicacion
    private EditText obj1txtncPC, obj1txtncIC, obj1txtncEP, obj1txtncTotal; //1era Unidad
    private EditText obj2txtncPC, obj2txtncIC, obj2txtncEP, obj2txtncTotal; //2da Unidad
    private EditText obj3txtncPC, obj3txtncIC, obj3txtncEP, obj3txtncTotal; //3era Unidad
    private ImageButton objbtnRegresar;
    private Button objbtnPromTotal;

    private EditText objtxtnPromTotal;

    /**
     * VARIABLES OPERACIONALES
     */
//Variables Operacionales Comunicacion
    private double compc1, comic1, comep1, comunicaciontotal1; //1era Unidad
    private double compc2, comic2, comep2, comunicaciontotal2; //2da Unidad
    private double compc3, comic3, comep3, comunicaciontotal3; //3era Unidad
    private double comunicacionPromTotal;

    private Toast toast;

    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.promedio_unidades_comunicacion);

        //1ERA UNIDAD
        obj1txtncPC = (EditText) findViewById(R.id.utxtncPC);
        obj1txtncIC = (EditText) findViewById(R.id.utxtncIC);
        obj1txtncEP = (EditText) findViewById(R.id.utxtncEP);
        obj1txtncTotal = (EditText) findViewById(R.id.utxtncTotal);

            //

        //2DA UNIDAD
        obj2txtncPC = (EditText) findViewById(R.id.dtxtncPC);
        obj2txtncIC = (EditText) findViewById(R.id.dtxtncIC);
        obj2txtncEP = (EditText) findViewById(R.id.dtxtncEP);
        obj2txtncTotal = (EditText) findViewById(R.id.dtxtncTotal);

        //3ERA UNIDAD
        obj3txtncPC = (EditText) findViewById(R.id.ttxtncPC);
        obj3txtncIC = (EditText) findViewById(R.id.ttxtncIC);
        obj3txtncEP = (EditText) findViewById(R.id.ttxtncEP);
        obj3txtncTotal = (EditText) findViewById(R.id.ttxtncTotal);

        objtxtnPromTotal = (EditText) findViewById(R.id.pttxtncTotal);

        objbtnRegresar = (ImageButton) findViewById(R.id.btnRegresar);
        objbtnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PromedioUnidadesComunicacionActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        objbtnPromTotal = (Button) findViewById(R.id.btnPromTotal);
        //Accion al Boton Calcular Promedio Total
        objbtnPromTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedioTotal();
            }
        });

        //PRIMERA UNIDAD:
        obj1txtncPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadComunicacion();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        obj1txtncIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadComunicacion();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        obj1txtncEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadComunicacion();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //SEGUNDA UNIDAD:
        obj2txtncPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadComunicacion();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        obj2txtncIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadComunicacion();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        obj2txtncEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadComunicacion();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //TERCERA UNIDAD.
        obj3txtncPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadcomunicacion();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        obj3txtncIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadcomunicacion();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        obj3txtncEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadcomunicacion();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }

    private void calcularPrimeraUnidadComunicacion(){
        String com1PC = obj1txtncPC.getText().toString();
        String com1IC = obj1txtncIC.getText().toString();
        String com1EP = obj1txtncEP.getText().toString();

        compc1 = com1PC.isEmpty() ? 0.0 : Double.parseDouble(com1PC);
        comic1 = com1IC.isEmpty() ? 0.0 : Double.parseDouble(com1IC);
        comep1 = com1EP.isEmpty() ? 0.0 : Double.parseDouble(com1EP);

        if (compc1 < 0 || compc1 > 20 || comic1 < 0 || comic1 > 20 || comep1 < 0 || comep1 >20){
            toast = Toast.makeText(getApplicationContext(), "Los datos deben estar entre 0 y 20", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        comunicaciontotal1 = (0.30 * compc1) + (0.40 * comic1) + (0.30 * comep1);
        String resultadoFormato1 = String.format("%.2f", comunicaciontotal1);
        obj1txtncTotal.setText(String.valueOf(resultadoFormato1));
    }

    private void calcularSegundaUnidadComunicacion(){
        String com2PC = obj2txtncPC.getText().toString();
        String com2IC = obj2txtncIC.getText().toString();
        String com2EP = obj2txtncEP.getText().toString();

        compc2 = com2PC.isEmpty() ? 0.0 : Double.parseDouble(com2PC);
        comic2 = com2IC.isEmpty() ? 0.0 : Double.parseDouble(com2IC);
        comep2 = com2EP.isEmpty() ? 0.0 : Double.parseDouble(com2EP);

        if (compc2 < 0 || compc2 > 20 || comic2 < 0 || comic2 > 20 || comep2 < 0 || comep2 > 20){
            toast = Toast.makeText(getApplicationContext(), "Los datos deben estar entre 0 y 20", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        comunicaciontotal2 = (0.30 * compc2) + (0.40 * comic2) + (0.30 * comep2);
        String resultadoFormato2 = String.format("%.2f", comunicaciontotal2);
        obj2txtncTotal.setText(String.valueOf(resultadoFormato2));
    }

    private void calcularTerceraUnidadcomunicacion(){
        String com3PC = obj3txtncPC.getText().toString();
        String com3IC = obj3txtncIC.getText().toString();
        String com3EP = obj3txtncEP.getText().toString();

        compc3 = com3PC.isEmpty() ? 0.0 : Double.parseDouble(com3PC);
        comic3 = com3IC.isEmpty() ? 0.0 : Double.parseDouble(com3IC);
        comep3 = com3EP.isEmpty() ? 0.0 : Double.parseDouble(com3EP);

        if (compc3 < 0 || compc3 > 20 || comic3 < 0 || comic3 > 20 || comep3 < 0 || comep3 > 20){
            toast = Toast.makeText(getApplicationContext(), "Los datos deben estar entre 0 y 20", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        comunicaciontotal3 = (0.30 * compc3) + (0.40 * comic3) + (0.30 * comep3);
        String resultadoFormato3 = String.format("%.2f", comunicaciontotal3);
        obj3txtncTotal.setText(String.valueOf(resultadoFormato3));
    }

    private void calcularPromedioTotal(){
        comunicacionPromTotal = (0.30 * comunicaciontotal1) + (0.30 * comunicaciontotal2) + (0.40 * comunicaciontotal3);
        String resultadoPromTotal = String.format("%.2f", comunicacionPromTotal);
        objtxtnPromTotal.setText(String.valueOf(resultadoPromTotal));
        if (Double.parseDouble(resultadoPromTotal) >= 10.5 ){
            toast = Toast.makeText(getApplicationContext(), "APROBASTE EL CURSO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if (Double.parseDouble(resultadoPromTotal) < 10.5) {
            toast = Toast.makeText(getApplicationContext(), "DESAPROBASTE EL CURSO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }
}
