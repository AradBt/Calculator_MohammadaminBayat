package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    TextView text1;
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        text1 = (TextView) findViewById(R.id.text1);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        text1 =  findViewById(R.id.text1);
         btn2 = (Button) findViewById(R.id.btn2);
         btn3 = (Button) findViewById(R.id.btn3);
         btn4 = (Button) findViewById(R.id.btn4);
         btn5 = (Button) findViewById(R.id.btn5);
         btn6 = (Button) findViewById(R.id.btn6);
         btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
            }
        });


                Button btn7 = (Button) findViewById(R.id.btn7);
                btn7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btn2.setEnabled(false);
                        btn3.setEnabled(false);
                        btn4.setEnabled(false);
                        btn5.setEnabled(false);
                        btn6.setEnabled(false);

                    }
                });


            }
    public void amal(View v) {
        if (v.getId() == R.id.btn2) {
            float a = Float.parseFloat(edt1.getText().toString());
            float b = Float.parseFloat(edt2.getText().toString());
            float c = a + b;
            s = Float.toString(c);
            text1.setText(s);
        } else if (v.getId() == R.id.btn3) {
            float a = Float.parseFloat(edt1.getText().toString());
            float b = Float.parseFloat(edt2.getText().toString());
            float c = a - b;
            s = Float.toString(c);
            text1.setText(s);
        } else if (v.getId() == R.id.btn4) {
            float a = Float.parseFloat(edt1.getText().toString());
            float b = Float.parseFloat(edt2.getText().toString());
            float c = a * b;
            s = Float.toString(c);
            text1.setText(s);
        } else if (v.getId() == R.id.btn5) {
            float a = Float.parseFloat(edt1.getText().toString());
            float b = Float.parseFloat(edt2.getText().toString());
            float c = a / b;
            s = Float.toString(c);
            text1.setText(s);

        } else if (v.getId() == R.id.btn6) {
            float a = Float.parseFloat(edt1.getText().toString());
            float b = Float.parseFloat(edt2.getText().toString());
            float c = (float) Math.pow(a,b);
            s = Float.toString(c);
            text1.setText(s);
        }

    }
}