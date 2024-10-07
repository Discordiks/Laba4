package com.example.laba4;

import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.buttonMorning);
        btn2=findViewById(R.id.buttonDay);
        btn3=findViewById(R.id.buttonEvening);
        btn4=findViewById(R.id.buttonNight);
        //создание пуша
        MyPushNotification myPushNotification = new MyPushNotification(this,
                getSystemService(NotificationManager.class));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MorningActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPushNotification.sendNotify("Предупреждение","Скоро конец рабочего дня ;)");
                Intent intent=new Intent(getApplicationContext(),DayActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPushNotification.sendNotify("Предупреждение","Спаааать!");
                Intent intent=new Intent(getApplicationContext(),EveningActivity.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),NightActivity.class);
                startActivity(intent);
            }
        });
    }
}