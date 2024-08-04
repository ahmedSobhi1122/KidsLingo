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

public class SportsActivity extends BaseActivity {
    private CardView football, running, swimming, cycling, boxing, climbing, snowboarding, skateboarding, yoga;
    private MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        football = findViewById(R.id.football);
        running = findViewById(R.id.running);
        swimming = findViewById(R.id.swimming);
        cycling = findViewById(R.id.cycling);
        boxing = findViewById(R.id.boxing);
        climbing = findViewById(R.id.climbing);
        snowboarding = findViewById(R.id.snowboarding);
        skateboarding = findViewById(R.id.skateboarding);
        yoga = findViewById(R.id.yoga);

        football.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.football);
            mp.start();
            message("Football");
        });
        running.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.running);
            mp.start();
            message("Running");
        });
        swimming.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.swimming);
            mp.start();
            message("Swimming");
        });
        cycling.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.cycling);
            mp.start();
            message("Cycling");
        });
        boxing.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.boxing);
            mp.start();
            message("Boxing");
        });
        climbing.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.climbing);
            mp.start();
            message("Climbing");
        });
        snowboarding.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.snowboarding);
            mp.start();
            message("Snowboarding");
        });
        skateboarding.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.skateboarding);
            mp.start();
            message("Skateboarding");
        });
        yoga.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.yoga);
            mp.start();
            message("Yoga");
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