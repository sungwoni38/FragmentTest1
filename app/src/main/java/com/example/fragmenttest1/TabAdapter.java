package com.example.fragmenttest1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabAdapter extends RecyclerView.Adapter<TabAdapter.ViewHolder>{
    private final List<TabItem> mDataList;
    private Map<String, Integer> mfood;

    public TabAdapter(List<TabItem> dataList) {
        mDataList = dataList;
        mfood = new HashMap<>();
        mfood.put("한식", R.drawable.korea);
        mfood.put("중식", R.drawable.china);
        mfood.put("일식", R.drawable.fastfood);
        mfood.put("양식", R.drawable.korea);
        mfood.put("제과", R.drawable.bread);
        mfood.put("분식", R.drawable.bunsik);
        mfood.put("기타", R.drawable.drink);
        
    }
    @NonNull
    @Override
    public TabAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tab, parent, false);
        return new TabAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TabAdapter.ViewHolder holder, int position) {
        TabItem item = mDataList.get(position);
        holder.txt_food.setText(item.getName());
        holder.img_food.setImageResource(mfood.get(item.getFood()));
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_food;
        ImageView img_food;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_food = itemView.findViewById(R.id.txt_food);
            img_food = itemView.findViewById(R.id.img_food);
        }
    }
}
