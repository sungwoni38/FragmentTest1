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

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder>{
    private final List<CardItem> mDataList;
    private Map<String, Integer> mLikeImgMap;

    public CardViewAdapter(List<CardItem> dataList) {
        mDataList = dataList;
        mLikeImgMap = new HashMap<>();
        mLikeImgMap.put("즐겨찾기", R.drawable.ic_baseline_star_24);
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardItem item = mDataList.get(position);
        holder.txt_name.setText(item.getName());
        holder.txt_call.setText(item.getCall());
        holder.txt_add.setText(item.getAdd());
        holder.img_search_like.setImageResource(mLikeImgMap.get(item.getLike()));
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_name, txt_call, txt_add;
        ImageView img_search_like;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_name);
            txt_call = itemView.findViewById(R.id.txt_call);
            txt_add = itemView.findViewById(R.id.txt_add);
            img_search_like = itemView.findViewById(R.id.img_search_like);
        }
    }
}