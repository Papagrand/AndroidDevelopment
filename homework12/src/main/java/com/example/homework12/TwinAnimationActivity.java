package com.example.homework12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TwinAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twin_animation);

        ImageView img = findViewById(R.id.animationView);
        // определим для ImageView какое-нибудь изображение
        img.setImageResource(R.drawable.city);
        // создаем анимацию
        Animation animation = AnimationUtils.loadAnimation(this,
                R.anim.common_animation);
        // запуск анимации
        img.startAnimation(animation);
    }
}