package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MultipleChoice extends AppCompatActivity {

    String[] flowerNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);

        flowerNames = getResources().getStringArray(R.array.flowers);
        // получаем элемент TextView
        TextView selection = findViewById(R.id.selection);
        // получаем элемент ListView
        ListView flowersList = findViewById(R.id.flowersMultiplyList);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_multiple_choice, flowerNames);
        // устанавливаем для списка адаптер
        flowersList.setAdapter(adapter);
        // добавляем для списка слушатель
        flowersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SparseBooleanArray selected=flowersList.getCheckedItemPositions();
                String selectedItems="";
                for(int i=0;i < flowerNames.length;i++)
                {
                    if(selected.get(i))
                        selectedItems+=flowerNames[i]+",";
                }
                // установка текста элемента TextView
                selection.setText("Выбрано: " + selectedItems);
            }
        });
    }
}