package com.example.homework11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSwitch(View view) {
        switch (view.getId()) {
            case R.id.buttonUsingThreads: {
                Intent intent = new Intent(this, UsingThreadsActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.buttonThreadsFragments: {
                Intent intent = new Intent(this, ThreadsFragmentsActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.buttonAsyncTask: {
                Intent intent = new Intent(this, AsyncTaskActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.goToWebsite: {
                Intent intent = new Intent(this, GoToWebActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.buttonGetInf: {
                Intent intent = new Intent(this, GetInformationActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}