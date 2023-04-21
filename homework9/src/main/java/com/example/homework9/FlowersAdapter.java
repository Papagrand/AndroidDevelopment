package com.example.homework9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlowersAdapter extends ArrayAdapter<FlowerInfo> {
    private LayoutInflater inflater;
    private int layout;
    private List<FlowerInfo> flowerInfos;

    public FlowersAdapter(Context context, int resource, List<FlowerInfo> flowerInfos){
        super(context,resource,flowerInfos);
        this.flowerInfos = flowerInfos;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder viewHolder;

        if(convertView==null){
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }else{
            viewHolder=(ViewHolder)convertView.getTag();
        }


        FlowerInfo flowerInfo = flowerInfos.get(position);

        viewHolder.imgView.setImageResource(flowerInfo.getImgResource());
        viewHolder.latinNameView.setText(flowerInfo.getLatinName());
        viewHolder.nameView.setText(flowerInfo.getName());

        return convertView;
    }
    private class ViewHolder {
        final ImageView imgView;
        final TextView nameView, latinNameView;
        ViewHolder(View view){
            imgView = view.findViewById(R.id.img);
            nameView = view.findViewById(R.id.flwrName);
            latinNameView = view.findViewById(R.id.latinName);
        }
    }
}
