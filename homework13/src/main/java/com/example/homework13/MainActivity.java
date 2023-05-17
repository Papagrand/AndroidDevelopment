package com.example.homework13;

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
            case R.id.button_saveinst: {
                Intent intent = new Intent(this, SaveInst.class);

                startActivity(intent);
                break;
            }
            case R.id.button_sharedpref: {
                Intent intent = new Intent(this, SharedPref.class);

                startActivity(intent);
                break;
            }
            case R.id.button_readsave: {
                Intent intent = new Intent(this, ReadSave.class);

                startActivity(intent);
                break;
            }
            case R.id.button_externalstorage: {
                Intent intent = new Intent(this, ExternalStorage.class);

                startActivity(intent);
                break;
            }
            case R.id.button_task7Sqlite: {
                Intent intent = new Intent(this, Task7SQLite.class);

                startActivity(intent);
                break;
            }
            case R.id.button_openhelper: {
                Intent intent = new Intent(this, OpenHelper.class);

                startActivity(intent);
                break;
            }
            case R.id.button_cursoract: {
                Intent intent = new Intent(this, CursorActivity.class);

                startActivity(intent);
                break;
            }
            case R.id.button_uploaddatabase: {
                Intent intent = new Intent(this, UploadDatabase.class);

                startActivity(intent);
                break;
            }
            case R.id.button_task11: {
                Intent intent = new Intent(this, Task11.class);

                startActivity(intent);
                break;
            }
            case R.id.button_task12: {
                Intent intent = new Intent(this, Task12.class);

                startActivity(intent);
                break;
            }
            case R.id.button_task13: {
                Intent intent = new Intent(this, Task13.class);

                startActivity(intent);
                break;
            }
        }
    }
}