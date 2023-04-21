package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class AddActivity extends AppCompatActivity {
    private ArrayList<String> flowers = new ArrayList<String>();
    private ArrayList<String> selectedFlowers = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private ListView flowersList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


            // добавляем начальные элементы
            Collections.addAll(flowers, "Розы", "Тюльпаны", "Лютики");
            // получаем элемент ListView
            flowersList = findViewById(R.id.flowersAddList);
            // создаем адаптер
            adapter = new ArrayAdapter(this,
                    android.R.layout.simple_list_item_multiple_choice, flowers);
            // устанавливаем для списка адаптер
            flowersList.setAdapter(adapter);
            flowersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String flower = adapter.getItem(position);
                    if(flowersList.isItemChecked(position))
                        selectedFlowers.add(flower);
                    else
                        selectedFlowers.remove(flower);
                }
            });

    }

    public void add(View view){
        EditText flowerName = findViewById(R.id.flowerName);
        String flower = flowerName.getText().toString();
        if(!flower.isEmpty()){
            adapter.add(flower);
            flowerName.setText("");
            adapter.notifyDataSetChanged();
        }
    }
    public void remove(View view){
        for (int i = 0; i<selectedFlowers.size();i++){
            adapter.remove(selectedFlowers.get(i));
        }
        flowersList.clearChoices();
        selectedFlowers.clear();
        adapter.notifyDataSetChanged();
    }

}