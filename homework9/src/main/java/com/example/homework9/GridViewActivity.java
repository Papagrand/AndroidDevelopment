package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] flowerNames = getResources().getStringArray(R.array.flowers);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        final ImageView imageView = findViewById(R.id.imageView2);

        GridView flowersList = findViewById(R.id.gridview);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,flowerNames);
        flowersList.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedFlower = flowerNames[position];

                // Отображаем соответствующую картинку
                if (selectedFlower.equals("Розы")) {
                    imageView.setImageResource(R.drawable.roses);
                } else if (selectedFlower.equals("Гвоздики")) {
                    imageView.setImageResource(R.drawable.carnations);
                } else if (selectedFlower.equals("Хризантема")) {
                    imageView.setImageResource(R.drawable.chrysanthemum);
                } else if (selectedFlower.equals("Пионы")) {
                    imageView.setImageResource(R.drawable.peonies);
                } else if (selectedFlower.equals("Астра")) {
                    imageView.setImageResource(R.drawable.aster);
                } else if (selectedFlower.equals("Лютик")) {
                    imageView.setImageResource(R.drawable.lily_of_the_valley);
                } else if (selectedFlower.equals("Лаванда")) {
                    imageView.setImageResource(R.drawable.lavender);
                } else if (selectedFlower.equals("Тюльпаны")) {
                    imageView.setImageResource(R.drawable.tulips);
                }
            }
        };
        flowersList.setOnItemClickListener(itemClickListener);
    }
}