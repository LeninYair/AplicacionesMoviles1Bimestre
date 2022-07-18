package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class spinner extends AppCompatActivity {

    Spinner spinner1;
    EditText et1,et2;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        et1=(EditText)findViewById(R.id.NumUno);
        et2=(EditText)findViewById(R.id.NumDos);
        tv1=(TextView)findViewById(R.id.txtResultadoSpinner);

        spinner1 = (Spinner) findViewById(R.id.spinner);

        String []opciones={"sumar","restar","multiplicar","dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);

    }

    public void operar(View view) {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String selec = spinner1.getSelectedItem().toString();
        if (selec.equals("sumar")) {
            int suma = nro1 + nro2;
            String resu = String.valueOf(suma);
            tv1.setText(resu);
        } else if (selec.equals("restar")) {
            int resta = nro1 - nro2;
            String resu = String.valueOf(resta);
            tv1.setText(resu);
        } else if (selec.equals("multiplicar")) {
            int multi = nro1 * nro2;
            String resu = String.valueOf(multi);
            tv1.setText(resu);
        } else if (selec.equals("dividir")) {
            int divi = nro1 / nro2;
            String resu = String.valueOf(divi);
            tv1.setText(resu);
        }
    }

}