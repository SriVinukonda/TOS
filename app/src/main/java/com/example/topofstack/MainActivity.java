package com.example.topofstack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void quizLayout(View view) {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.main_activity);
        AnimationDrawable backgroundAnimation = (AnimationDrawable) background.getBackground();

        backgroundAnimation.setEnterFadeDuration(0);
        backgroundAnimation.setExitFadeDuration(3000);

        backgroundAnimation.start();

        Button javaButton = findViewById(R.id.button);
        javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),QuizActivity.class);
                startActivity(intent);
            }
        });


    }
}