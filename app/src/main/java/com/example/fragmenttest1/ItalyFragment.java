package com.example.fragmenttest1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ItalyFragment extends Fragment {
    private View view;
    public ItalyFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_italy, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_italy);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> dataList = new ArrayList<>();
        dataList.add(new CardItem("한솥","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));
        dataList.add(new CardItem("한솥","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));
        dataList.add(new CardItem("한솥","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));

        CardViewAdapter adapter = new CardViewAdapter(dataList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
