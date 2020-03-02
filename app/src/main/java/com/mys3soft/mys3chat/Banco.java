package com.mys3soft.mys3chat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;



public class Banco extends AppCompatActivity {


    ViewPager viewPager;
    ImageButton btn1, btnmas;
    EditText usuarioTxt;
    Button trans,button1,button2;
    boolean uno = false, dos = false, tres = false;
    String usuario;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.banco_1);


        final Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                uno =  true;
                startActivity(new Intent(Banco.this,ActivityMain.class));

            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dos = true;
                if(uno == true  && dos == true) {
                   startActivity(new Intent(Banco.this,ActivityMain.class));

                    uno =false;
                    dos =false;
                }

            }
        });
    }
}




