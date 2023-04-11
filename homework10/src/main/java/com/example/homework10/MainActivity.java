package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    public void onClickSwitch(View view) {
        switch (view.getId()) {
            case R.id.buttonStyle: {
                Intent intent = new Intent(this, SwitchStyle.class);

                startActivity(intent);
                break;
            }
            case R.id.buttonMyTheme: {
                Intent intent = new Intent(this, MyThemeAct.class);

                startActivity(intent);
                break;
            }
        }
    }
}