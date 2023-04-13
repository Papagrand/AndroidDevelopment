package com.example.homework8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DataTaskCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_task_code);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container_view, ContentFragment.class, null)
                    .commit();
        }
    }

}