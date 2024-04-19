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

public class PromedioUnidadesMatematicaActivity extends AppCompatActivity {
    //Declarando los objetos:
    private EditText objutxtnmPC, objutxtnmIC, objutxtnmEP, objutxtnmTotal; //Primera Unidad
    private EditText objdtxtnmPC, objdtxtnmIC, objdtxtnmEP, objdtxtnmTotal; // Segunda Unidad
    private EditText objttxtnmPC, objttxtnmIC, objttxtnmEP, objttxtnmTotal; //Tercera Unidad

    private EditText objmpromTotal; //Promedio Total
    private ImageButton objbtnRegresar;
    private Button objbtnPromTotal;
    //Declarando las Variables Operacionales:
    private double matpc1, matic1, matep1, matematica1Total; //1era Unidad
    private double matpc2, matic2, matep2, matematica2Total; //2da Unidad
    private double matpc3, matic3, matep3, matematica3Total; //2da Unidad
    private double matematicapromTotal; //Promedio Total
    private Toast toast;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.promedio_unidades_matematica);

        //Primera Unidad
        objutxtnmPC = (EditText) findViewById(R.id.utxtnmPC);
        objutxtnmIC = (EditText) findViewById(R.id.utxtnmIC);
        objutxtnmEP = (EditText) findViewById(R.id.utxtnmEP);
        objutxtnmTotal = (EditText) findViewById(R.id.utxtnmTotal);

        //Segunda Unidad
        objdtxtnmPC = (EditText) findViewById(R.id.dtxtnmPC);
        objdtxtnmIC = (EditText) findViewById(R.id.dtxtnmIC);
        objdtxtnmEP = (EditText) findViewById(R.id.dtxtnmEP);
        objdtxtnmTotal = (EditText) findViewById(R.id.dtxtnmTotal);

        //Tercera Unidad
        objttxtnmPC = (EditText) findViewById(R.id.ttxtnmPC);
        objttxtnmIC = (EditText) findViewById(R.id.ttxtnmIC);
        objttxtnmEP = (EditText) findViewById(R.id.ttxtnmEP);
        objttxtnmTotal = (EditText) findViewById(R.id.ttxtnmTotal);

        objmpromTotal = (EditText) findViewById(R.id.pttxtnmTotal);

        objbtnRegresar = (ImageButton) findViewById(R.id.btnRegresar);
        objbtnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PromedioUnidadesMatematicaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        objbtnPromTotal = (Button) findViewById(R.id.btnPromTotal);
        objbtnPromTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPromedioTotal();
            }
        });
        //Escuchar Unidad 1
        objutxtnmPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        objutxtnmIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        objutxtnmEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Escuchar Unidad 2
        objdtxtnmPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        objdtxtnmIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        objdtxtnmEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //Escuchar Unidad 3
        objttxtnmPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        objttxtnmIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        objttxtnmEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadMatematica();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void calcularPrimeraUnidadMatematica (){
        String mat1PC = objutxtnmPC.getText().toString();
        String mat1IC = objutxtnmIC.getText().toString();
        String mat1EP = objutxtnmEP.getText().toString();

        matpc1 = mat1PC.isEmpty() ? 0.0 : Double.parseDouble(mat1PC);
        matic1 = mat1IC.isEmpty() ? 0.0 : Double.parseDouble(mat1IC);
        matep1 = mat1EP.isEmpty() ? 0.0 : Double.parseDouble(mat1EP);

        if (matpc1 < 0 || matpc1 > 20 || matic1 < 0 || matic1 > 20 || matep1 < 0 || matep1 > 20){
            toast = Toast.makeText(getApplicationContext(), "Los valores deben estar entre 0 y 20", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        matematica1Total = (0.30 * matpc1) + ( 0.40 * matic1) + (0.30 * matep1);
        String resultadoFormat1 = String.format("%.2f", matematica1Total);
        objutxtnmTotal.setText(String.valueOf(resultadoFormat1));
    }

    private void calcularSegundaUnidadMatematica (){
        String mat2PC = objdtxtnmPC.getText().toString();
        String mat2IC = objdtxtnmIC.getText().toString();
        String mat2EP = objdtxtnmEP.getText().toString();

        matpc2 = mat2PC.isEmpty() ? 0.0 : Double.parseDouble(mat2PC);
        matic2 = mat2IC.isEmpty() ? 0.0 : Double.parseDouble(mat2IC);
        matep2 = mat2EP.isEmpty() ? 0.0 : Double.parseDouble(mat2EP);

        if ( matpc2 < 0 || matpc2 > 20 || matic2 < 0 || matic2 > 20 || matep2 < 0 || matep2 > 20){
            toast = Toast.makeText(getApplicationContext(), "Los datos deben estar entre 0 y 20", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        matematica2Total = (0.30 * matpc2) + (0.40 * matic2) + (0.30 * matep2);
        String resultadoFormat2 = String.format("%.2f", matematica2Total);
        objdtxtnmTotal.setText(String.valueOf(resultadoFormat2));

    }

    private void calcularTerceraUnidadMatematica(){
        String mat3PC = objttxtnmPC.getText().toString();
        String mat3IC = objttxtnmIC.getText().toString();
        String mat3EP = objttxtnmEP.getText().toString();

        matpc3 = mat3PC.isEmpty() ? 0.0 : Double.parseDouble(mat3PC);
        matic3 = mat3IC.isEmpty() ? 0.0 : Double.parseDouble(mat3IC);
        matep3 = mat3EP.isEmpty() ? 0.0 : Double.parseDouble(mat3EP);

        if (matpc3 < 0 || matpc3 > 20 || matic3 < 0 || matic3 > 20 || matep3 < 0 || matep3 > 20){
            toast = Toast.makeText(getApplicationContext(), "Los datos deben estar entre 0 y 20", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        matematica3Total = (0.30 * matpc3) + (0.40 * matic3) + (0.30 * matep3);
        String resultadoFormat3 = String.format("%.2f", matematica3Total);
        objttxtnmTotal.setText(String.valueOf(resultadoFormat3));
    }

    private void calcularPromedioTotal(){
        matematicapromTotal = (0.30 * matematica1Total) + (0.30 * matematica2Total) + (0.40 * matematica3Total);
        String resultadoPromTotalMat = String.format("%.2f", matematicapromTotal);
        objmpromTotal.setText(String.valueOf(resultadoPromTotalMat));

        if (Double.parseDouble(resultadoPromTotalMat) >= 10.5){
            toast = Toast.makeText(getApplicationContext(), "APROBASTE EL CURSO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }else if (Double.parseDouble(resultadoPromTotalMat) < 10.5){
            toast = Toast.makeText(getApplicationContext(), "DESAPROBASTE EL CURSO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

    }
}
