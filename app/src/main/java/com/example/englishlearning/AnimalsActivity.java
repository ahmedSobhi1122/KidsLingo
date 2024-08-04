package com.example.englishlearning;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnimalsActivity extends BaseActivity {
    private CardView cat, dog, lion, elephant, monkey, cow, horse, rabbit, giraffe;
    private MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        cat = findViewById(R.id.cat);
        dog = findViewById(R.id.dog);
        lion = findViewById(R.id.lion);
        elephant = findViewById(R.id.elephant);
        monkey = findViewById(R.id.monkey);
        cow = findViewById(R.id.cow);
        horse = findViewById(R.id.horse);
        rabbit = findViewById(R.id.rabbit);
        giraffe = findViewById(R.id.giraffe);

        cat.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.cat);
            mp.start();
            message("Cat");
        });
        dog.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.dog);
            mp.start();
            message("Dog");
        });
        lion.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.lion);
            mp.start();
            message("Lion");
        });
        elephant.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.elephant);
            mp.start();
            message("Elephant");
        });
        monkey.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.monkey);
            mp.start();
            message("Monkey");
        });
        cow.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.cow);
            mp.start();
            message("Cow");
        });
        horse.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.horse);
            mp.start();
            message("Horse");
        });
        rabbit.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.rabbit);
            mp.start();
            message("Rabbit");
        });
        giraffe.setOnClickListener(v -> {
            mp = MediaPlayer.create(this, R.raw.giraffe);
            mp.start();
            message("Giraffe");
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