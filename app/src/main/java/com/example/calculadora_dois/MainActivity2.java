package com.example.calculadora_dois;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_resultado = (TextView) findViewById(R.id.tv_resultado);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String resultado = extras.getString("resultado");
            tv_resultado.setText(resultado);
        }
    }
}
