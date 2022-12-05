package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText s1;
    EditText s2;
    Button rastgele;
    Button carp;
    Button topla;
    Button cikart;
    EditText sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1=(EditText)findViewById(R.id.editTextNumber1);
        s2=(EditText)findViewById(R.id.editTextNumber2);
        rastgele=(Button) findViewById(R.id.buttonRastgele);

        carp=(Button) findViewById(R.id.buttoncarp);
        topla=(Button) findViewById(R.id.buttontopla);
        cikart=(Button) findViewById(R.id.buttoncikar);

        sonuc=(EditText)findViewById(R.id.editTextNumberSonuc);



        rastgele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r=new Random();
                s1.setText(String.valueOf(r.nextInt(100)));
                s2.setText(String.valueOf(r.nextInt(100)));
            }
        });

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s1.getText().toString()!="" && s2.getText().toString()!="")
                {
                    sonuc.setText(String.valueOf(Integer.valueOf(s1.getText().toString())*Integer.valueOf(s2.getText().toString())));
                }
            }
        });

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s1.getText().toString()!="" && s2.getText().toString()!="")
                {
                    sonuc.setText(String.valueOf(Integer.valueOf(s1.getText().toString())+Integer.valueOf(s2.getText().toString())));
                }
            }
        });

        cikart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s1.getText().toString()!="" && s2.getText().toString()!="")
                {
                    sonuc.setText(String.valueOf(Integer.valueOf(s1.getText().toString())-Integer.valueOf(s2.getText().toString())));
                }
            }
        });

    }
}