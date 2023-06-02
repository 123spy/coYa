package com.spy.coya.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.spy.coya.R;
import com.spy.coya.databinding.ActivityMainBinding;

import kotlin.collections.IntIterator;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    private Button aiButton;

    private Button imageButton;

    private Button toolsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        imageButton = findViewById(R.id.image_button);
        aiButton = findViewById(R.id.ai_button);
        toolsButton = findViewById(R.id.tools_button);

        aiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AiActivity.class);
                startActivity(intent);
            }
        });

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        });

        toolsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ToolActivity.class);
                startActivity(intent);
            }
        });
    }
}