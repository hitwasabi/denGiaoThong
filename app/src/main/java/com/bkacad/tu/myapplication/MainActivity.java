package com.bkacad.tu.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView imgView;
    private Button btnSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link var = by Id
        imgView = findViewById(R.id.imgView);
        btnSwitch = findViewById(R.id.btnSwitch);
        //su kien click
        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int status = 0;
            if(status == 0){
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.yellow));
                Toast.makeText(MainActivity.this,"yellow light",Toast.LENGTH_LONG).show();
                status = 1;
            }
            if(status == 1){
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.red));
                    Toast.makeText(MainActivity.this,"red light",Toast.LENGTH_LONG).show();
                    status = 2;
                }
            if(status == 2){
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.green));
                    Toast.makeText(MainActivity.this,"green light",Toast.LENGTH_LONG).show();
                    status = 0;
                }
            }
        }

        );
    }
}