package com.example.matheussimonproject1;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    TextView babyTextView;

    Button nextActivityButton;
    Button funWithBabyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.babyBossSaco);
        babyTextView = findViewById(R.id.textViewBaby);

        nextActivityButton = findViewById(R.id.buttonNextActivity);
        nextActivityButton.setBackgroundColor(Color.GREEN);

        funWithBabyButton = findViewById(R.id.buttonFun);
        funWithBabyButton.setBackgroundColor(Color.RED);

    }



    int i = R.drawable.babybosssaco;
    public void onBabyBoss(View view) {
        if(i==R.drawable.babybosssaco)
        {
            image.setImageResource(R.drawable.babybossdiaper);
            i = R.drawable.babybossdiaper;
            babyTextView.setBackgroundColor(Color.RED);
            babyTextView.setText(getString(R.string.changeDiapers));

        }
        else
        {
            image.setImageResource((R.drawable.babybosssaco));
            i = R.drawable.babybosssaco;
            babyTextView.setBackgroundColor(Color.WHITE);
            babyTextView.setText(getString(R.string.babyReady));
        }

    }

    public void onFun(View view) {
        if(i==R.drawable.babybosssaco)
        {
            image.setImageResource(R.drawable.babybossdiaper);
            i = R.drawable.babybossdiaper;
            babyTextView.setBackgroundColor(Color.RED);
            babyTextView.setText(getString(R.string.changeDiapers));
            funWithBabyButton.setBackgroundColor(Color.GREEN);

        }
        else
        {
            image.setImageResource((R.drawable.babybosssaco));
            i = R.drawable.babybosssaco;
            babyTextView.setBackgroundColor(Color.WHITE);
            babyTextView.setText(getString(R.string.babyReady));
            funWithBabyButton.setBackgroundColor(Color.RED);
        }

    }

    public void onNext(View view) {
        Intent intent = new Intent(this,recordingActivity.class);
        startActivity(intent);
    }

    public void onSettings(View view) {
        Intent intent = new Intent(this,settingsActivity.class);
        startActivity(intent);
    }
}