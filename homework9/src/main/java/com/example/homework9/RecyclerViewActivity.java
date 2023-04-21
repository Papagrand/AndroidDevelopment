package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    ArrayList<FlowerInfo> flowerInfos = new ArrayList<FlowerInfo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        RecyclerViewAdapter.OnStateClickListener stateClickListener = new RecyclerViewAdapter.OnStateClickListener() {
            @Override
            public void onStateClick(FlowerInfo flowerInfo, int position) {
                Toast.makeText(getApplicationContext(), "Был выбран пункт " +
                                flowerInfo.getName(),
                        Toast.LENGTH_SHORT).show();

            }
        };
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, flowerInfos,stateClickListener);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        flowerInfos.add(new FlowerInfo("Роза", "Rósa",R.drawable.roses));
        flowerInfos.add(new FlowerInfo("Тюльпан", "Tulipa suaveolens",R.drawable.tulips));
        flowerInfos.add(new FlowerInfo("Лаванда", "Lavandula bipinnata",R.drawable.lavender));
        flowerInfos.add(new FlowerInfo("Пионы", "Paeónia",R.drawable.peonies));
        flowerInfos.add(new FlowerInfo("Лютик", "Ranúnculus",R.drawable.lily_of_the_valley));
    }
}