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

public class NumbersActivity extends BaseActivity {
    private CardView one, two, three, four, five, six, seven, eight, nine;
    private MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        one.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.one);
            mp.start();
            message("one");
        });
        two.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.two);
            mp.start();
            message("two");
        });
        three.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.three);
            mp.start();
            message("three");
        });
        four.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.four);
            mp.start();
            message("four");
        });
        five.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.five);
            mp.start();
            message("five");
        });
        six.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.six);
            mp.start();
            message("six");
        });
        seven.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.seven);
            mp.start();
            message("seven");
        });
        eight.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.eight);
            mp.start();
            message("eight");
        });
        nine.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.nine);
            mp.start();
            message("nine");
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