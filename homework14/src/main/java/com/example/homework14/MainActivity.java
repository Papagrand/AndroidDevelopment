package com.example.homework14;

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
            case R.id.button_addcontact: {
                Intent intent = new Intent(this, Task1_AddContactActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.button_provider: {
                Intent intent = new Intent(this, Task2_8_Provider.class);

                startActivity(intent);
                break;
            }
            case R.id.button_json: {
                Intent intent = new Intent(this, Task10_JSON.class);

                startActivity(intent);
                break;
            }
            case R.id.button_xml: {
                Intent intent = new Intent(this, WorkWithXML.class);

                startActivity(intent);
                break;
            }
        }
    }
}