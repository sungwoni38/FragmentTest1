package com.example.fragmenttest1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class LikeFragment extends Fragment {
    private View view;
    public LikeFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_like, container, false);



        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_like);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> dataList = new ArrayList<>();
        dataList.add(new CardItem("본죽 망우우림시장점","02-2207-6288","서울특별시 중랑구 망우동 403-69", "즐겨찾기"));
        dataList.add(new CardItem("본죽 망우우림시장점","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));
        dataList.add(new CardItem("본죽 망우우림시장점","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));
        dataList.add(new CardItem("본죽 망우우림시장점","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));

        CardViewAdapter adapter = new CardViewAdapter(dataList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
