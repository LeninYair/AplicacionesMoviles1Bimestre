package xyz.yoandroide.proyectofinal1bimestre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class TouchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch);

        View v1;
        TextView txt1;

        v1=(View) findViewById(R.id.v);
        txt1=(TextView) findViewById(R.id.txtv1);

        v1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    txt1.setText("Esta tocando la pantalla");
                    return true;
                }
                if (event.getAction()==MotionEvent.ACTION_UP){
                    txt1.setText("se dejo de tocar la pantalla");
                    return true;
                }
                if (event.getAction()==MotionEvent.ACTION_MOVE){
                    txt1.setText("se ESTA MOVIENDO de tocar la pantalla");
                    return true;
                }

                return false;
            }
        });

    }
}