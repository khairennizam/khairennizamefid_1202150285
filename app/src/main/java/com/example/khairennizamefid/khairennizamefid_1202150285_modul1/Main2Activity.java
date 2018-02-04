package com.example.khairennizamefid.khairennizamefid_1202150285_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView porsi, cafe, nasduk, harga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent ia = getIntent();

        int jumlah = ia.getIntExtra("jumlah", 0);
        String tm = ia.getStringExtra("tempat");
        String menu = ia.getStringExtra("menu");
        int harmak = ia.getIntExtra("Harga", 0);

        cafe = (TextView)findViewById(R.id.tvCafe);
        cafe.setText(tm);
        nasduk=(TextView)findViewById(R.id.tvNasduk);
        nasduk.setText(menu);
        porsi=(TextView)findViewById(R.id.tvTotal);
        porsi.setText(""+jumlah);
        harga=(TextView)findViewById(R.id.tvRupiah);
        harga.setText(""+harmak);


        if (harmak > 65000){
            Toast toast = Toast.makeText(this,"Jangan disini makan malamnya!!! uang kamu tidak cukup",Toast.LENGTH_LONG);
            toast.show();
        } else{
            Toast toast  =Toast.makeText(this, "Disini aja makan malamnya ", Toast.LENGTH_LONG);
            toast.show();

        }

    }
}
