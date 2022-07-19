package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText user,clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user= (EditText) findViewById(R.id.eTxtUsuario);
        clave= (EditText) findViewById(R.id.clave);

    }

    public void verificar(View view) {
        String users = user.getText().toString();
        String contra = clave.getText().toString();
        if (users.equals("admin" )){

        }else{
            Toast notificacio = Toast.makeText(this, "NO EXISTE ESTE USUARIO", Toast.LENGTH_SHORT);
            notificacio.show();
        }
        if (contra.equals("12345" )){

        }else{
            Toast notificacio = Toast.makeText(this, "CONTRASEÑA INCORRECTA", Toast.LENGTH_SHORT);
            notificacio.show();
        }
        if (users.equals("admin") &&contra.equals("12345")){
            Toast notificacio = Toast.makeText(this, "USUARIO Y CONTRASEÑA CORRECTO", Toast.LENGTH_SHORT);
            notificacio.show();
            Intent i = new Intent(this, MenuPrincipal.class);
            startActivity(i);

        }
    }
}
