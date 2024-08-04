package com.example.englishlearning;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ColorsActivity extends BaseActivity {
    private CardView red, blue, green, yellow, orange, pink, gray, black, white;
    private MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        yellow = findViewById(R.id.yellow);
        orange = findViewById(R.id.orange);
        pink = findViewById(R.id.pink);
        gray = findViewById(R.id.gray);
        black = findViewById(R.id.black);
        white = findViewById(R.id.white);

        red.setOnClickListener(v->{
            mp = MediaPlayer.create(this, R.raw.red);
            mp.start();
            message("Red");
        });
        blue.setOnClickListener(v->{
            mp = MediaPlayer.create(this, R.raw.blue);
            mp.start();
            message("Blue");
        });
        green.setOnClickListener(v->{
            mp = MediaPlayer.create(this, R.raw.green);
            mp.start();
            message("Green");
        });
        yellow.setOnClickListener(v->{
            mp = MediaPlayer.create(this, R.raw.yellow);
            mp.start();
            message("Yellow");
        });
        orange.setOnClickListener(v-> {
            mp = MediaPlayer.create(this, R.raw.orange);
            mp.start();
            message("Orange");
        });
        pink.setOnClickListener(v->{
            mp = MediaPlayer.create(this, R.raw.pink);
            mp.start();
            message("Pink");
        });
        gray.setOnClickListener(v->{
            mp = MediaPlayer.create(this, R.raw.gray);
            mp.start();
            message("Gray");
        });
        black.setOnClickListener(v->{
            mp = MediaPlayer.create(this, R.raw.black);
            mp.start();
            message("Black");
        });
        white.setOnClickListener(v->{
            mp = MediaPlayer.create(this, R.raw.white);
            mp.start();
            message("White");
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mp != null) {
            mp.release();
            mp = null;
        }
    }
}