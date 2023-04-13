package com.example.homework8;

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
            case R.id.DataInActivityButton: {
                Intent intent = new Intent(this, DataTaskActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.DataInCodeButton: {
                Intent intent = new Intent(this, DataTaskCodeActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.BetweenFragmentsButton: {
                Intent intent = new Intent(this, BetweenFragments.class);

                startActivity(intent);
                break;
            }
        }
    }
}