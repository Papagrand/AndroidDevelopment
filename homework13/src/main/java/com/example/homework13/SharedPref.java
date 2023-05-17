package com.example.homework13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SharedPref extends AppCompatActivity {

    private static final String PREFS_FILE = "Account";
    private static final String PREF_NAME = "Name";
    EditText nameBox;
    SharedPreferences settings;
    SharedPreferences.Editor prefEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);
        nameBox = findViewById(R.id.t2nameBox);
        settings = getSharedPreferences(PREFS_FILE, MODE_PRIVATE);
        // получаем настройки
        String name = settings.getString(PREF_NAME,"");
        nameBox.setText(name);
    }
    @Override
    protected void onPause(){
        super.onPause();
        String name = nameBox.getText().toString();
        // сохраняем в настройках
        prefEditor = settings.edit();
        prefEditor.putString(PREF_NAME, name);
        prefEditor.apply();
    }
    public void saveName(View view) {
        // получаем введенное имя
        EditText nameBox = findViewById(R.id.t2nameBox);
        String name = nameBox.getText().toString();
        // сохраняем его в настройках
        SharedPreferences.Editor prefEditor = settings.edit();
        prefEditor.putString(PREF_NAME, name);
        prefEditor.apply();

    }
    public void getName(View view) {
        // получаем сохраненное имя
        TextView nameView = findViewById(R.id.t2nameView);
        String name = settings.getString(PREF_NAME,"не определено");
        nameView.setText(name);

    }

}