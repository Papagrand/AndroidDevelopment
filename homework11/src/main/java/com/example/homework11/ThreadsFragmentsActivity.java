package com.example.homework11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ThreadsFragmentsActivity extends AppCompatActivity {
    private MyViewModel model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threads_fragments);
//
//        ProgressBar indicatorBar = findViewById(R.id.indicator);
//        TextView statusView = findViewById(R.id.statusView);
//        Button btnFetch = findViewById(R.id.progressBtn);
//        Button btnPause = findViewById(R.id.pausebutton);
//        Button btnResume = findViewById(R.id.resumebutton);
//
//        model = new ViewModelProvider(this).get(MyViewModel.class);
//        model.getValue().observe(this, value -> {
//            indicatorBar.setProgress(value);
//            statusView.setText("Статус: " + value);
//        });
//
//        btnFetch.setOnClickListener(v -> model.execute());
//        btnPause.setOnClickListener(v -> model.pause());
//        btnResume.setOnClickListener(v -> model.resume());
//
//        Button backbutton = findViewById(R.id.back);
//        backbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
    }
}