package com.example.homework12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class SendDataDialogActivity extends AppCompatActivity {

    private ArrayList<String> flowers = new ArrayList<String>();
    private ArrayList<String> selectedFlowers = new ArrayList<String>();
    private ArrayAdapter<String> adapter;
    private ListView flowersList;

    String[] moreFlowers = {"Роза","Ромашка","Мак","Маргаритка","Орхидея","Одуванчик","Тюльпан","Дейзия"," Дельфиниум","Нарцисс","Настурция","Сирень"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data_dialog);
        MultiAutoCompleteTextView multiAutoCompleteTextView = findViewById(R.id.flowerName);
        ArrayAdapter<String> adapter2 = new ArrayAdapter (this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,moreFlowers);
        multiAutoCompleteTextView.setAdapter(adapter2);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        // добавляем начальные элементы
        Collections.addAll(flowers, "Роза", "Тюльпан", "Лютик");
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
        MultiAutoCompleteTextView flowerName = findViewById(R.id.flowerName);
        String flower = flowerName.getText().toString();
        if(flowers.contains(flower)){
            Toast.makeText(this, "This flower already exists in the list", Toast.LENGTH_SHORT).show();
        }
        if(!flower.isEmpty() && !flowers.contains(flower)){
            adapter.add(flower);
            flowerName.setText("");
            adapter.notifyDataSetChanged();
        }
    }
    public void remove(View view){
        DeleteDialogFragment dialog = new DeleteDialogFragment();
        Bundle args = new Bundle();
        args.putString("flower", String.join(", ", selectedFlowers));
        if (!selectedFlowers.isEmpty()) {
            dialog.setArguments(args);
            dialog.show(getSupportFragmentManager(), "custom");
        }
    }
    public void removeSelectedFlowers() {
        for (String flower : selectedFlowers) {
            adapter.remove(flower);
        }
        flowersList.clearChoices();
        selectedFlowers.clear();
        adapter.notifyDataSetChanged();
    }
}