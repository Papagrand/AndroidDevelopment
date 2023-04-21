package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HardListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_list);
        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
        if(vegetables.size()==0){
            vegetables.add(new Vegetable("Картофель", "кг."));
            vegetables.add(new Vegetable("Капуста", "кг."));
            vegetables.add(new Vegetable("Авокадо", "шт."));
            vegetables.add(new Vegetable("Морковь", "кг."));
        }
        ListView vegetablesList = findViewById(R.id.vegetablesList);
        VegetablesAdapter adapter = new VegetablesAdapter(this, R.layout.list_item2,
                vegetables);
        vegetablesList.setAdapter(adapter);
    }
}