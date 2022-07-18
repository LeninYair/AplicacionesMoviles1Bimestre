package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class radioButton extends AppCompatActivity {

    EditText numUno;
    EditText numDos;
    Button calcular;
    RadioButton suma;
    RadioButton resta;
    RadioButton multiplicacion;
    RadioButton division;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        numUno=(EditText) findViewById(R.id.numeroUno);
        numDos=(EditText) findViewById(R.id.numeroDos);
        calcular=(Button) findViewById(R.id.btnCalcular);
        suma=(RadioButton) findViewById(R.id.rBtnSumar);
        resta=(RadioButton) findViewById(R.id.rBtnResta);
        multiplicacion=(RadioButton) findViewById(R.id.rBtnMultiplicacion);
        division=(RadioButton) findViewById(R.id.rBtnDivision);
        resultado=(TextView) findViewById(R.id.txtResultadoRadio);


    }

    public void operar(View view) {
        String valor1 =numUno.getText().toString();
        String valor2 = numDos.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        if (suma.isChecked() == true) {
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            resultado.setText(resu);
        } else if (resta.isChecked() == true) {
            int resta = nro1 - nro2;
            String resu = String.valueOf(resta);
            resultado.setText(resu);
        }  else if (multiplicacion.isChecked() == true) {
            int resta = nro1 * nro2;
            String resu = String.valueOf(resta);
            resultado.setText(resu);
        }  else if (division.isChecked() == true) {
            int resta = nro1 / nro2;
            String resu = String.valueOf(resta);
            resultado.setText(resu);
        }


    }



}