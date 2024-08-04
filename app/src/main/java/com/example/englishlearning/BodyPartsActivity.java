package com.example.englishlearning;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class BodyPartsActivity extends BaseActivity {
    private CardView hand, foot, eye, ear, mouth, nose, arm, leg, teeth;
    private MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_parts);
        hand = findViewById(R.id.hand);
        foot = findViewById(R.id.foot);
        eye = findViewById(R.id.eye);
        ear = findViewById(R.id.ear);
        mouth = findViewById(R.id.mouth);
        nose = findViewById(R.id.nose);
        arm = findViewById(R.id.arm);
        leg = findViewById(R.id.leg);
        teeth = findViewById(R.id.teeth);

        hand.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.hand);
            mp.start();
            message("Hand");
        });
        foot.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.foot);
            mp.start();
            message("Foot");
        });
        eye.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.eye);
            mp.start();
            message("Eye");
        });
        ear.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.ear);
            mp.start();
            message("Ear");
        });
        mouth.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.mouth);
            mp.start();
            message("Mouth");
        });
        nose.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.nose);
            mp.start();
            message("Nose");
        });
        arm.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.arm);
            mp.start();
            message("Arm");
        });
        leg.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.leg);
            mp.start();
            message("Leg");
        });
        teeth.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.teeth);
            mp.start();
            message("Teeth");
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