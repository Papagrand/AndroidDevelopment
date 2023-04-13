package com.example.homework8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Date;

public class ContentFragment extends Fragment {
    public ContentFragment(){
        super(R.layout.fragment_content);
    }
static int countOfClick = 0;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button updButton = view.findViewById(R.id.updateButton);
        TextView curDateTextView = view.findViewById(R.id.curDateTextView);
        TextView prevDateTextView =  view.findViewById(R.id.prevdateTextView);
        prevDateTextView.setText("Дата предыдущего обновления:\n"+new Date().toString());
        updButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dataprev = curDateTextView.getText().toString();
                countOfClick++;
                if(countOfClick>=2){
                    prevDateTextView.setText("Дата предыдущего обновления:"+
                        dataprev.substring(dataprev.indexOf("\n")));
                }
                String curDate = new Date().toString();
                curDateTextView.setText("Текущая дата:\n"+curDate);
            }
        });
        Button backButton = view.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext() ,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

