package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class buttonGroup extends AppCompatActivity {

    EditText numUno;
    EditText numDos;
    Button aceptar;
    RadioButton suma;
    RadioButton resta;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_group);

        numUno=(EditText) findViewById(R.id.etNumeroUno);
        numDos=(EditText) findViewById(R.id.etNumeroDos);
        aceptar=(Button) findViewById(R.id.btnAceptar);
        suma=(RadioButton) findViewById(R.id.rBtnSumar);
        resta=(RadioButton) findViewById(R.id.rBtnResta);
        resultado=(TextView) findViewById(R.id.txtResultadoGrup);

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
        }


    }
}