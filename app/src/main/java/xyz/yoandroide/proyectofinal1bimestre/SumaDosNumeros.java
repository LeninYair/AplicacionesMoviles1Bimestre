package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumaDosNumeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma_dos_numeros);

        EditText numUno;
        EditText numDos;
        Button btnSuma;
        TextView txtResultado;

        numUno=(EditText) findViewById(R.id.etNumUno);
        numDos=(EditText) findViewById(R.id.etNumDos);
        btnSuma=(Button) findViewById(R.id.btnSumar);
        txtResultado=(TextView) findViewById(R.id.txtResultado);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1;
                int num2;
                int resul;
                 num1=Integer.parseInt(numUno.getText().toString()) ;
                num2=Integer.parseInt(numDos.getText().toString()) ;
                resul=num1+num2;
                txtResultado.setText(" "+resul);
            }
        });






    }
}