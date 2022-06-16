package com.example.fragmenttest1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private View view;
    CardView cardView_kor1, cardView_kor2,cardView_kor3;
    ImageView img_search_like1_border, img_search_like1;
    int imgIndex = 0;
    public SearchFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search, container, false);

        img_search_like1 = view.findViewById(R.id.img_search_like1);
        img_search_like1_border = view.findViewById(R.id.img_search_like1_border);

        cardView_kor1 = (CardView) view.findViewById(R.id.cardView_kor1);
        cardView_kor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(imgIndex == 1) {
                    img_search_like1_border.setVisibility(View.INVISIBLE);
                    img_search_like1.setVisibility(View.VISIBLE);
                    imgIndex = 0;
                }
                else  {
                    img_search_like1_border.setVisibility(View.VISIBLE);
                    img_search_like1.setVisibility(View.INVISIBLE);
                    imgIndex = 1;
                }


            }
        });

////        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_search);
////        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
////        recyclerView.setLayoutManager(layoutManager);
//
//        List<CardItem> dataList = new ArrayList<>();
//        dataList.add(new CardItem("로제떡볶이","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));
//        dataList.add(new CardItem("로제떡볶이","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));
//        dataList.add(new CardItem("로제떡볶이","02-2207-6288","서울특별시 중랑구 망우동 403-69","즐겨찾기"));
//
//        CardViewAdapter adapter = new CardViewAdapter(dataList);
//        recyclerView.setAdapter(adapter);

        return view;
    }
}
