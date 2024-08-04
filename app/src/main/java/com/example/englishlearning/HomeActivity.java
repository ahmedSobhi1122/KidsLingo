package com.example.englishlearning;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends BaseActivity {
    private CardView colors, animals, family, numbers, sports, bodyParts;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        colors = findViewById(R.id.colors);
        animals = findViewById(R.id.animals);
        family = findViewById(R.id.family);
        numbers = findViewById(R.id.numbers);
        sports = findViewById(R.id.sports);
        bodyParts = findViewById(R.id.bodyParts);

        colors.setOnClickListener(v -> {
            goTo(HomeActivity.this, ColorsActivity.class);
        });
        animals.setOnClickListener(v -> {
            goTo(HomeActivity.this, AnimalsActivity.class);
        });
        family.setOnClickListener(v -> {
            goTo(HomeActivity.this, FamilyActivity.class);
        });
        numbers.setOnClickListener(v -> {
            goTo(HomeActivity.this, NumbersActivity.class);
        });
        sports.setOnClickListener(v -> {
            goTo(HomeActivity.this, SportsActivity.class);
        });
        bodyParts.setOnClickListener(v -> {
            goTo(HomeActivity.this, BodyPartsActivity.class);
        });
    }
}