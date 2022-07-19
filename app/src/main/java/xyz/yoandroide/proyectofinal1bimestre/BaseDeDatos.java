package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class BaseDeDatos extends AppCompatActivity {

    EditText txtnom, txtapellido, txtcedula, txtasignatura, txtnota;
    Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_de_datos);
        relacionamosVistas();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        final String nombre=txtnom.getText().toString();
        final String apellido=txtapellido.getText().toString();
        final String cedula=txtcedula.getText().toString();
        final String asignatura=txtasignatura.getText().toString();
        final String nota=txtnota.getText().toString();


        String url="http://192.168.1.17/proyecto/ingresodatos.php?nombre="+nombre+"&apellido="+apellido+"&cedula="+cedula+"&asignatura="+asignatura+"&nota="+nota;
        RequestQueue servicio= Volley.newRequestQueue(BaseDeDatos.this);
        StringRequest respuesta=new StringRequest(
                Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(),
                        response,Toast.LENGTH_LONG).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),
                        "Error comunicación",Toast.LENGTH_SHORT).show();
            }
        });
        servicio.add(respuesta);



            }
        });

        txtnom.setText("");
        txtapellido.setText("");
        txtcedula.setText("");
        txtasignatura.setText("");
        txtnota.setText("");

        }
    public void relacionamosVistas(){
        txtnom=(EditText) findViewById(R.id.txtnom);
        txtapellido=(EditText) findViewById(R.id.txtapellido);
        txtcedula=(EditText) findViewById(R.id.txtcedula);
        txtasignatura=(EditText) findViewById(R.id.txtasignatura);
        txtnota=(EditText) findViewById(R.id.txtnota);

        btn1=(Button) findViewById(R.id.btning);

    }

    public void validar(View v){

        final String nombre=txtnom.getText().toString();
        final String apellido=txtapellido.getText().toString();
        final String cedula=txtcedula.getText().toString();
        final String asignatura=txtasignatura.getText().toString();
        final String nota=txtnota.getText().toString();


        String url="http://192.168.100.19/proyecto/ingresodatos.php?nombre="+nombre+"&apellido="+apellido+"&cedula="+cedula+"&asignatura="+asignatura+"&nota="+nota;
        RequestQueue servicio= Volley.newRequestQueue(this);
        StringRequest respuesta=new StringRequest(
                Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(),
                        response,Toast.LENGTH_LONG).show();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),
                        "Error comunicación",Toast.LENGTH_SHORT).show();
            }
        });
        servicio.add(respuesta);

    }
    public void regresar(View view) {
        Intent i = new Intent(this, BaseDeDatos.class);
        startActivity(i);
    }

}