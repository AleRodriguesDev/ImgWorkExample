package com.ale.imgworkexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgSaldo, imgPoupanca, imgTrasferencia, imgFatura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgSaldo = findViewById(R.id.img_saldo);
        imgPoupanca = findViewById(R.id.img_poupanca);
        imgTrasferencia = findViewById(R.id.img_transferencia);
        imgFatura = findViewById(R.id.img_fatura);

        imgSaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamaSaldo = new Intent(MainActivity.this, Saldo.class);
                startActivity(chamaSaldo);
            }
        });

        imgPoupanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamaPoupanca = new Intent(MainActivity.this, Poupanca.class);
                startActivity(chamaPoupanca);
            }
        });

        imgTrasferencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamaTransferencia = new Intent(MainActivity.this, Transferencia.class);
                startActivity(chamaTransferencia);
            }
        });

        imgFatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chamaFatura = new Intent(MainActivity.this, Fatura.class);
                startActivity(chamaFatura);
            }
        });
    }
}