package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usuario;
        EditText clave;
        Button login;
        Button register;

        usuario=(EditText) findViewById(R.id.eTxtUsuario);
        clave=(EditText)  findViewById(R.id.eTxtClave);
        login=(Button) findViewById(R.id.btnLogin);
        register=(Button) findViewById(R.id.btnRegister);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = usuario.getText().toString();
                String contrasenia = clave.getText().toString();
                if (user=="lenin" || contrasenia=="yair"){
                    Intent intent=new Intent(MainActivity.this,MenuPrincipal.class);
                    startActivity(intent);
                }else{
                    Intent intent=new Intent(MainActivity.this,MenuPrincipal.class);
                    startActivity(intent);
                }
            }
        });








    }
}