package com.example.englishlearning;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void goTo(Context from, Class<?> to){
        startActivity(new Intent(from, to));
    }
    public void goToWithDelay(Context from, Class<?> to){
        new Handler().postDelayed(() -> {
            goTo(from,to);
            finish();
        },2500);
    }
    public void message(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}