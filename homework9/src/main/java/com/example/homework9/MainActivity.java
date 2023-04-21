package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] tasks = {"Ресурс string-array","Множественный выбор в списке", "Добавление и удаление", "Расширение списков", "Сложный список с кнопками","Spinner", "GridView", "RecycleView"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView tasksList = findViewById(R.id.tasksList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,tasks);
        tasksList.setAdapter(adapter);
        tasksList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = tasks[position];
                switch(selectedItem){
                    case "Ресурс string-array":{
                        Intent intent = new Intent(MainActivity.this, StringActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case "Множественный выбор в списке":{
                        Intent intent = new Intent(MainActivity.this, MultipleChoice.class);
                        startActivity(intent);
                        break;
                    }
                    case "Добавление и удаление":{
                        Intent intent = new Intent(MainActivity.this, AddActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case "Расширение списков":{
                        Intent intent = new Intent(MainActivity.this, ExpandingLists.class);
                        startActivity(intent);
                        break;
                    }
                    case "Сложный список с кнопками":{
                        Intent intent = new Intent(MainActivity.this, HardListActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case "Spinner":{
                        Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case "GridView":{
                        Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case "RecycleView":{
                        Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }
}