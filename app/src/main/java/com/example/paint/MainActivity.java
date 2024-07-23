package com.example.paint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {



    CardView cardView, cardView1, cardView2, cardView3, cardView4, cardView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);





        cardView = findViewById(R.id.chizish);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChizishActivity.class);
                startActivity(intent);
            }
        });

        cardView1 = findViewById(R.id.boyash);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BoyashActivity.class);
                startActivity(intent);
            }
        });
        cardView2 = findViewById(R.id.galeriya);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,galeryActivity2.class);
                startActivity(intent);
            }
        });
        cardView3 = findViewById(R.id.savol);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,savolActivity.class);
                startActivity(intent);
            }
        });
        cardView4 = findViewById(R.id.misol);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intet = new Intent(MainActivity.this,misolActivity.class);
                startActivity(intet);
            }
        });
        cardView5 = findViewById(R.id.qollanma);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intet = new Intent(MainActivity.this,qollanmaActivity.class);
                startActivity(intet);
            }
        });

    }
}