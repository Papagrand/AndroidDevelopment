package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ExpandingLists extends AppCompatActivity {
    ArrayList<FlowerInfo> flowers = new ArrayList<FlowerInfo>();
    ListView flowersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expanding_lists);
        setInitialData();
        flowersList = findViewById(R.id.flowersExpandingList);
        FlowersAdapter flowersAdapter = new FlowersAdapter(this, R.layout.list_item,flowers);
        flowersList.setAdapter(flowersAdapter);
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FlowerInfo selecterFlower = (FlowerInfo)parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"Был выбран цветок "+ selecterFlower.getName(),Toast.LENGTH_LONG).show();

            }
        };
        flowersList.setOnItemClickListener(itemListener);
    }
    private void setInitialData(){
        flowers.add(new FlowerInfo("Роза", "Rósa",R.drawable.roses));
        flowers.add(new FlowerInfo("Тюльпан", "Tulipa suaveolens",R.drawable.tulips));
        flowers.add(new FlowerInfo("Лаванда", "Lavandula bipinnata",R.drawable.lavender));
        flowers.add(new FlowerInfo("Пионы", "Paeónia",R.drawable.peonies));
        flowers.add(new FlowerInfo("Лютик", "Ranúnculus",R.drawable.lily_of_the_valley));
        flowers.add(new FlowerInfo("Роза", "Rósa",R.drawable.roses));
        flowers.add(new FlowerInfo("Тюльпан", "Tulipa suaveolens",R.drawable.tulips));
        flowers.add(new FlowerInfo("Лаванда", "Lavandula bipinnata",R.drawable.lavender));
        flowers.add(new FlowerInfo("Пионы", "Paeónia",R.drawable.peonies));
        flowers.add(new FlowerInfo("Лютик", "Ranúnculus",R.drawable.lily_of_the_valley));
        flowers.add(new FlowerInfo("Роза", "Rósa",R.drawable.roses));
        flowers.add(new FlowerInfo("Тюльпан", "Tulipa suaveolens",R.drawable.tulips));
        flowers.add(new FlowerInfo("Лаванда", "Lavandula bipinnata",R.drawable.lavender));
        flowers.add(new FlowerInfo("Пионы", "Paeónia",R.drawable.peonies));
        flowers.add(new FlowerInfo("Лютик", "Ranúnculus",R.drawable.lily_of_the_valley));
        flowers.add(new FlowerInfo("Роза", "Rósa",R.drawable.roses));
        flowers.add(new FlowerInfo("Тюльпан", "Tulipa suaveolens",R.drawable.tulips));
        flowers.add(new FlowerInfo("Лаванда", "Lavandula bipinnata",R.drawable.lavender));
        flowers.add(new FlowerInfo("Пионы", "Paeónia",R.drawable.peonies));
        flowers.add(new FlowerInfo("Лютик", "Ranúnculus",R.drawable.lily_of_the_valley));


    }
}