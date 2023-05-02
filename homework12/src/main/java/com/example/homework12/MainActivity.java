package com.example.homework12;

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
            case R.id.buttonVideoFile: {
                Intent intent = new Intent(this, VideofileActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.buttonInternetActivity: {
                Intent intent = new Intent(this, InternetActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.buttonMusicActivity: {
                Intent intent = new Intent(this, MusicActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.buttonCellAnimationActivity: {
                Intent intent = new Intent(this, CellAnimationActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.buttonTwinAnimation: {
                Intent intent = new Intent(this, TwinAnimationActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.buttonService: {
                Intent intent = new Intent(this, ServicesActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.buttonTimeNDataActivity: {
                Intent intent = new Intent(this, TimeNDataActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}