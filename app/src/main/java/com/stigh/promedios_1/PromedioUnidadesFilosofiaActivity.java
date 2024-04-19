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

public class PromedioUnidadesFilosofiaActivity extends AppCompatActivity {


    //Objetos para la Activity Filosofia
    private EditText obj1txtnfPC, obj1txtnfIC, obj1txtnfEP, obj1txtnfTotal; //1era Unidad
    private EditText obj2txtnfPC, obj2txtnfIC, obj2txtnfEP, obj2txtnfTotal; //2da Unidad
    private EditText obj3txtnfPC, obj3txtnfIC, obj3txtnfEP, obj3txtnfTotal; //3era Unidad
    private ImageButton objbtnRegresar;

    private EditText objtxtnPromTotal;
    private Button objbtnPromTotal;

    /**
     * VARIABLES OPERACIONALES
     */
//Variables Operacionales Filosofia
    private double filpc1, filic1, filep1, filosofiatotal1; //1era Unidad
    private double filpc2, filic2, filep2, filosofiatotal2; //2da Unidad
    private double filpc3, filic3, filep3, filosofiatotal3; //3era Unidad
    private double filosofiaPromTotal;
    private Toast toast;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.promedio_unidades_filosofia);

        //
        obj1txtnfPC = (EditText) findViewById(R.id.utxtnfPC);//1era Unidad
        obj1txtnfIC = (EditText) findViewById(R.id.utxtnfIC);//1era Unidad
        obj1txtnfEP = (EditText) findViewById(R.id.utxtnfEP);//1era Unidad
        obj1txtnfTotal = (EditText) findViewById(R.id.utxtnfTotal);//1era Unidad

        obj2txtnfPC = (EditText) findViewById(R.id.dtxtnfPC);//2da Unidad
        obj2txtnfIC = (EditText) findViewById(R.id.dtxtnfIC);//2da Unidad
        obj2txtnfEP = (EditText) findViewById(R.id.dtxtnfEP);//2da Unidad
        obj2txtnfTotal = (EditText) findViewById(R.id.dtxtnfTotal);//2da Unidad

        obj3txtnfPC = (EditText) findViewById(R.id.ttxtnfPC);//3era Unidad
        obj3txtnfIC = (EditText) findViewById(R.id.ttxtnfIC);//3era Unidad
        obj3txtnfEP = (EditText) findViewById(R.id.ttxtnfEP);//3era Unidad
        obj3txtnfTotal = (EditText) findViewById(R.id.ttxtnfTotal);//3era Unidad

        objtxtnPromTotal = (EditText) findViewById(R.id.pttxtnfTotal);

        objbtnRegresar = (ImageButton) findViewById(R.id.btnRegresar);
        objbtnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (PromedioUnidadesFilosofiaActivity.this, MainActivity.class);
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

        // Escuchador de cambio de texto para el primer campo de texto // 1era Unidad
        obj1txtnfPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadFilosofia();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        // Escuchador de cambio de texto para el segundo campo de texto
        obj1txtnfIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadFilosofia();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        // Escuchador de cambio de texto para el tercer campo de texto
        obj1txtnfEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularPrimeraUnidadFilosofia();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //2DA UNIDAD
        //Escuchador de cambio de texto para el primer campo de texto // 2da Unidad
        obj2txtnfPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadFilosofia();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Escuchador de cambio de texto para el primer campo de texto // 2da Unidad
        obj2txtnfIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadFilosofia();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Escuchador de cambio de texto para el segundo campo de texto // 2da Unidad
        obj2txtnfEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularSegundaUnidadFilosofia();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //3ERA  UNIDAD
        //Escuchador de cambio de texto para el primer campo de texto // 3era Unidad
        obj3txtnfPC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadFilosofia();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Escuchador de cambio de texto para el segundo campo de texto // 3era Unidad
        obj3txtnfIC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadFilosofia();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        //Escuchador de cambio de texto para el tercer campo de texto // 3era Unidad
        obj3txtnfEP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                calcularTerceraUnidadFilosofia();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }

    private void calcularPrimeraUnidadFilosofia() {
        String fil1PC = obj1txtnfPC.getText().toString();
        String fil1IC = obj1txtnfIC.getText().toString();
        String fil1EP = obj1txtnfEP.getText().toString();

        // Verificar si los campos de texto están vacíos y tratarlos como ceros si es necesario
        filpc1 = fil1PC.isEmpty() ? 0.0 : Double.parseDouble(fil1PC);
        filic1 = fil1IC.isEmpty() ? 0.0 : Double.parseDouble(fil1IC);
        filep1 = fil1EP.isEmpty() ? 0.0 : Double.parseDouble(fil1EP);

        // Validar si los valores están dentro del rango deseado (0 a 20)
        if (filpc1 < 0 || filpc1 > 20 || filic1 < 0 || filic1 > 20 || filep1 < 0 || filep1 > 20) {
            toast = Toast.makeText(getApplicationContext(), "Los datos deben estar entre 0 y 20", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        // Realizar el cálculo
        filosofiatotal1 = (0.30 * filpc1) + (0.40 * filic1) + (0.30 * filep1);
        String resultadoFormat1 = String.format("%.2f", filosofiatotal1);
        // Establecer el resultado en el campo de texto total
        obj1txtnfTotal.setText(String.valueOf(resultadoFormat1));
    }

    private void calcularSegundaUnidadFilosofia() {

        String fil2PC = obj2txtnfPC.getText().toString();
        String fil2IC = obj2txtnfIC.getText().toString();
        String fil2EP = obj2txtnfEP.getText().toString();

        filpc2 = fil2PC.isEmpty() ? 0.0 : Double.parseDouble(fil2PC);
        filic2 = fil2IC.isEmpty() ? 0.0 : Double.parseDouble(fil2IC);
        filep2 = fil2EP.isEmpty() ? 0.0 : Double.parseDouble(fil2EP);

        if (filpc2 < 0 || filpc2 > 20 || filic2 < 0 || filic2 > 20 || filep2 < 0 || filep2 > 20) {
            toast = Toast.makeText(getApplicationContext(), "Los datos deben de estar entre 0 y 20", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        //Realizamos el calculo
        filosofiatotal2 = (0.30 * filpc2) + (0.40 * filic2) + (0.30 * filep2);
        String resultadoFormat2 = String.format("%.2f", filosofiatotal2);
        obj2txtnfTotal.setText(String.valueOf(resultadoFormat2));
    }

    private void calcularTerceraUnidadFilosofia(){
        String fil3PC = obj3txtnfPC.getText().toString();
        String fil3IC = obj3txtnfIC.getText().toString();
        String fil3EP = obj3txtnfEP.getText().toString();

        filpc3 = fil3PC.isEmpty() ? 0.0 : Double.parseDouble(fil3PC);
        filic3 = fil3IC.isEmpty() ? 0.0 : Double.parseDouble(fil3IC);
        filep3 = fil3EP.isEmpty() ? 0.0 : Double.parseDouble(fil3EP);

        if(filpc3 < 0 || filpc3 > 20 || filic3 < 0 || filic3 > 20 || filep3 < 0 || filep3 > 20){
            toast = Toast.makeText(getApplicationContext(), "Los datos deben estar entre 0 y 20",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }

        filosofiatotal3 = ((0.30 * filpc3) + (0.40 * filic3) + (0.30 * filep3));
        String resultadoFormat3 = String.format("%.2f", filosofiatotal3);
        obj3txtnfTotal.setText(String.valueOf(resultadoFormat3));
    }

    private void calcularPromedioTotal(){
        filosofiaPromTotal = ((0.30 * filosofiatotal1) + (0.30 * filosofiatotal2) + (0.40 * filosofiatotal3));
        String resultadoFormatoPromTotal = String.format("%.2f", filosofiaPromTotal);
        objtxtnPromTotal.setText(String.valueOf(filosofiaPromTotal));
        if (Double.parseDouble(resultadoFormatoPromTotal)  >= 10.5 ){
            toast = Toast.makeText(getApplicationContext(), "APROBASTE EL CURSO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else if (Double.parseDouble(resultadoFormatoPromTotal) < 10.5) {
            toast = Toast.makeText(getApplicationContext(), "DESAPROBASTE EL CURSO", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }

    }
}
