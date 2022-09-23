package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private TextView textview;
    private Button Osszeadas;
    private Button Kivonas;
    private int szam;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        textview.setOnClickListener(x -> {
            textview.setText("0");
            szam=0;
            textview.setTextColor(Color.BLUE);

        });


        Osszeadas.setOnClickListener(x -> {
            szam++;
            textview.setText(String.valueOf(szam));
        });

        Kivonas.setOnClickListener(x -> {
            szam--;
            textview.setText(String.valueOf(szam));
        });
        if (szam < 0){
            textview.setTextColor(Color.RED);

        }else if(szam > 0){
            textview.setTextColor(Color.GREEN);
        }else{
            textview.setTextColor(Color.BLUE);
        }


    }



    private void init(){
        layout=findViewById(R.id.layout);
        textview=findViewById(R.id.textview);
        Osszeadas=findViewById(R.id.Osszeadas);
        Kivonas=findViewById(R.id.Kivonas);

    }


}