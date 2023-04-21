package com.example.homework9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class VegetablesAdapter extends ArrayAdapter<Vegetable> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Vegetable> vegetablesList;
    VegetablesAdapter(Context context, int resource, ArrayList<Vegetable> vegetables){
        super(context, resource,vegetables);
        this.vegetablesList = vegetables;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        final ViewHolder viewHolder;
        if(convertView==null){
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Vegetable vegetables = vegetablesList.get(position);

        viewHolder.nameView.setText(vegetables.getName());
        viewHolder.countView.setText(vegetables.getCount() + " " + vegetables.getUnit());
        viewHolder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = vegetables.getCount()-1;
                if(count<0)count=0;
                vegetables.setCount(count);
                viewHolder.countView.setText(count + " "+vegetables.getUnit());
            }
        });
        viewHolder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = vegetables.getCount()+1;
                vegetables.setCount(count);
                viewHolder.countView.setText(count + " "+ vegetables.getUnit());
            }
        });
        return convertView;
    }

    private class ViewHolder {
        final Button addButton, removeButton;
        final TextView nameView, countView;
        ViewHolder(View view){
            addButton = view.findViewById(R.id.addButton);
            removeButton = view.findViewById(R.id.removeButton);
            nameView = view.findViewById(R.id.nameView);
            countView = view.findViewById(R.id.countView);
        }
    }

}
