package com.example.laba4;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EveningActivity extends AppCompatActivity {

    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //вертикальное расположение
        next=findViewById(R.id.buttonED);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),NightActivity.class);
                startActivity(intent);
            }
        });
    }
}