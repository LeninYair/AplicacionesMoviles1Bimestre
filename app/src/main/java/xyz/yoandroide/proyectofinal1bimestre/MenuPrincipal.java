package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Button btnHolaMundo;
        Button btnSuma;
        Button btnButtonGroup;
        Button btnRadioButton;
        Button btnCalculadora;
        Button btnTouch;
        Button btnLenin;
        Button btnBaseDatos;

        btnHolaMundo=(Button) findViewById(R.id.btnHolaMundo);
        btnSuma=(Button) findViewById(R.id.btnSuma);
        btnButtonGroup=(Button) findViewById(R.id.btnButtonGroup);
        btnRadioButton=(Button) findViewById(R.id.btnRadioButton);
        btnCalculadora=(Button) findViewById(R.id.btnCalculadora);
        btnTouch=(Button) findViewById(R.id.btnTouch);
        btnLenin=(Button) findViewById(R.id.btnLenin);
        btnBaseDatos=(Button) findViewById(R.id.btnBaseDatos);

        btnHolaMundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuPrincipal.this,HolaMundo.class);
                startActivity(intent);
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuPrincipal.this,SumaDosNumeros.class);
                startActivity(intent);
            }
        });

        btnButtonGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuPrincipal.this,buttonGroup.class);
                startActivity(intent);
            }
        });

        btnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuPrincipal.this,radioButton.class);
                startActivity(intent);
            }
        });

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuPrincipal.this, spinner.class);
                startActivity(intent);
            }
        });

        btnTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuPrincipal.this,TouchActivity.class);
                startActivity(intent);
            }
        });

        btnLenin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuPrincipal.this,Lenin.class);
                startActivity(intent);
            }
        });

        btnBaseDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuPrincipal.this,BaseDeDatos.class);
                startActivity(intent);
            }
        });
    }

}