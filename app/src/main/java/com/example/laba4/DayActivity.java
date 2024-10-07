package com.example.laba4;

import android.content.Context;
import android.content.Intent;
import android.app.NotificationManager;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DayActivity extends AppCompatActivity {

    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //вертикальное расположение
        next=findViewById(R.id.buttonDD);
        //создание пуша
        MyPushNotification myPushNotification = new MyPushNotification(this,
                getSystemService(NotificationManager.class));
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPushNotification.sendNotify("Предупреждение","Спаааать!");
                Intent intent=new Intent(getApplicationContext(),EveningActivity.class);
                startActivity(intent);
            }
        });
    }
}