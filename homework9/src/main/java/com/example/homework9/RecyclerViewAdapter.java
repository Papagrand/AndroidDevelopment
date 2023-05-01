package com.example.homework9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    interface OnStateClickListener{
        void onStateClick(FlowerInfo flowerInfo, int position);
    }
    private final OnStateClickListener onClickListener;
    private final LayoutInflater inflater;
    private final List<FlowerInfo> flowerInfos;

    RecyclerViewAdapter(Context context, List<FlowerInfo> flowerInfos, OnStateClickListener onClickListener){
        this.flowerInfos = flowerInfos;
        this.onClickListener = onClickListener;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int
            viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
        FlowerInfo flowerInfo = flowerInfos.get(position);
        holder.imgView.setImageResource(flowerInfo.getImgResource());
        holder.nameView.setText(flowerInfo.getName());
        holder.latinNameView.setText(flowerInfo.getLatinName());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                onClickListener.onStateClick(flowerInfo, position);
            }
        });
    }
    @Override
    public int getItemCount() {
        return flowerInfos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imgView;
        final TextView nameView, latinNameView;
        ViewHolder(View view){
            super(view);
            imgView = view.findViewById(R.id.img);
            nameView = view.findViewById(R.id.flwrName);
            latinNameView = view.findViewById(R.id.latinName);
        }
    }
}