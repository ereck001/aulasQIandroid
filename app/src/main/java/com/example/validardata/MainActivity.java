package com.example.validardata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText
            dia,
            mes,
            ano;
    TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dia = findViewById(R.id.edtDia);
        mes = findViewById(R.id.edtMes);
        ano = findViewById(R.id.edtAno);
        resposta = findViewById(R.id.txtResp);
    }


    public void validar(View v){
        TestadorData data = new TestadorData();
        data.setDia(Byte.parseByte(dia.getText().toString()));
        data.setMes(Byte.parseByte(mes.getText().toString()));
        data.setAno(Integer.parseInt(ano.getText().toString()));
        resposta.setText(data.toString());
    }


}