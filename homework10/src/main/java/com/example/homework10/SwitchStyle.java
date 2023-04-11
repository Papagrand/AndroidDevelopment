package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SwitchStyle extends AppCompatActivity {
    public static int prev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_style);

    }
    public void onClick(View view){
        Random random = new Random();
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        int rand = random.nextInt(4) + 1;
        while (rand==prev){
            rand = random.nextInt(4) + 1;
        }
        if(rand == 1){
            textView1.setTextAppearance(R.style.fstStyle);
            textView2.setTextAppearance(R.style.fstStyle);
            textView3.setTextAppearance(R.style.fstStyle);
        }
        else if(rand == 2){
            textView1.setTextAppearance(R.style.sndStyle);
            textView2.setTextAppearance(R.style.sndStyle);
            textView3.setTextAppearance(R.style.sndStyle);
        }
        else if(rand == 3){
            textView1.setTextAppearance(R.style.thrdStyle);
            textView2.setTextAppearance(R.style.thrdStyle);
            textView3.setTextAppearance(R.style.thrdStyle);
        }
        else{
            textView1.setTextAppearance(R.style.frthStyle);
            textView2.setTextAppearance(R.style.frthStyle);
            textView3.setTextAppearance(R.style.frthStyle);
        }
        prev = rand;
    }
    public void onBackClick(View view){
        finish();
    }
}