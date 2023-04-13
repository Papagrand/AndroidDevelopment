package com.example.homework8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class BetweenFragments extends AppCompatActivity implements
        ListFragment.OnFragmentSendDataListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_between_fragments);
        Button backButton = findViewById(R.id.backButton2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BetweenFragments.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onSendData(String selectedItem) {
        DetailFragment fragment = (DetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detailFragment);
        if (fragment != null && fragment.isVisible())
            fragment.setSelectedItem(selectedItem);
        else {
            Intent intent = new Intent(getApplicationContext(),
                    DetailActivity.class);
            intent.putExtra(DetailActivity.SELECTED_ITEM, selectedItem);
            startActivity(intent);
        }
    }
}
