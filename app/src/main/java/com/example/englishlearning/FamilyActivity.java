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

public class FamilyActivity extends BaseActivity {
    private MediaPlayer mp;
    private CardView grandfather, grandmother, father, mother, brother, sister, uncle, aunt, cousin;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        grandfather = findViewById(R.id.grandfather);
        grandmother = findViewById(R.id.grandmother);
        father = findViewById(R.id.father);
        mother = findViewById(R.id.mother);
        brother = findViewById(R.id.brother);
        sister = findViewById(R.id.sister);
        uncle = findViewById(R.id.uncle);
        aunt = findViewById(R.id.aunt);
        cousin = findViewById(R.id.cousin);

        grandfather.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.grandfather);
            mp.start();
            message("Grandfather");
        });
        grandmother.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.grandmother);
            mp.start();
            message("Grandmother");
        });
        father.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.father);
            mp.start();
            message("Father");
        });
        mother.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.mother);
            mp.start();
            message("Mother");
        });
        brother.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.brother);
            mp.start();
            message("Brother");
        });
        sister.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.sister);
            mp.start();
            message("Sister");
        });
        uncle.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.uncle);
            mp.start();
            message("Uncle");
        });
        aunt.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.aunt);
            mp.start();
            message("Aunt");
        });
        cousin.setOnClickListener(view -> {
            mp = MediaPlayer.create(this, R.raw.cousin);
            mp.start();
            message("Cousin");
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