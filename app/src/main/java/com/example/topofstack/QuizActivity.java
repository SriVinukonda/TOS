package com.example.topofstack;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.quiz_activity);
        AnimationDrawable backgroundAnimation = (AnimationDrawable) background.getBackground();

        backgroundAnimation.setEnterFadeDuration(0);
        backgroundAnimation.setExitFadeDuration(3000);

        backgroundAnimation.start();

        final Button WrongOne, WrongTwo, WrongThree,Correct;

        WrongOne = findViewById(R.id.wrong1);
        WrongTwo = findViewById(R.id.wron2);
        WrongThree = findViewById(R.id.wrong3);
        Correct = findViewById(R.id.correct);

        WrongOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                WrongOne.setText("Wrong");
                WrongTwo.setText("Wrong");
                WrongThree.setText("Wrong");
                Correct.setText("Wrong");
            }
        });

        Correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WrongOne.setText("Correct!");
                WrongTwo.setText("Correct!");
                WrongThree.setText("Correct!");
                Correct.setText("Correct!");

                Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainIntent);

            }
        });





    }
}
