package com.example.khairennizamefid.khairennizamefid_1202150285_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText menu , jumlah;
    Button btEB , btAN ;
    int prs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menu = (EditText)findViewById(R.id.et1);
        jumlah=(EditText)findViewById(R.id.et2);

    }

    public void btEB (View view){
        Intent ia = new Intent(this, Main2Activity.class);

        String menumkn = menu.getText().toString();
        prs = Integer.parseInt(jumlah.getText().toString());
        int Harga = 50000*prs;

        ia.putExtra("cafe", "eatbus");
        ia.putExtra("menu", menumkn );
        ia.putExtra("jumlah", prs);
        ia.putExtra("Harga", Harga);
        startActivity(ia);
    }

    public void btAN (View view){
        Intent ia = new Intent( this, Main2Activity.class);

        String mkn = menu.getText().toString();
        prs = Integer.parseInt(jumlah.getText().toString());
        int Harga = 30000*prs;

        ia.putExtra("tempat", "Abnormal");
        ia.putExtra("menu", mkn);
        ia.putExtra("jumlah", prs);
        ia.putExtra("Harga", Harga);
        startActivity(ia);
    }

}
