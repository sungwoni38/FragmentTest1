package com.example.fragmenttest1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;

    private ViewPager2 mViewPager;
    private SearchAdapter searchAdapter;

    private int[] tabIcons = {
            R.drawable.korea_50dp,
            R.drawable.china_50dp,
            R.drawable.bread_50dp,
            R.drawable.bunsik_50dp,
            R.drawable.fastfood_50dp,
            R.drawable.drink_50dp

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
//        mTabLayout.addTab(mTabLayout.newTab().setText("홈"));

        mViewPager = (ViewPager2) findViewById(R.id.pager);

        //프레그먼트 이동 구현
        SearchAdapter searchAdapter = new SearchAdapter(this);
        mViewPager.setAdapter(searchAdapter);

        List<String> tabElement = Arrays.asList("한식","중식","일식","양식","분식","제과","기타");

//       List<Integer> img = Arrays.asList(R.drawable.korea_50dp,R.drawable.china_50dp,R.drawable.bunsik_50dp,
//               R.drawable.drink_50dp,R.drawable.bread_50dp,R.drawable.fastfood_50dp,R.drawable.korea_50dp);



//        ArrayList<Integer> image = new ArrayList<>();
//        image.add(R.drawable.korea);
//        image.add(R.drawable.china);
//        image.add(R.drawable.bunsik);
//        image.add(R.drawable.drink);
//        image.add(R.drawable.bread);
//        image.add(R.drawable.fastfood);
//        image.add(R.drawable.korea);
//
//        for(int i=0; i<7; i++){
//            mTabLayout.getTabAt(i).setIcon(image.get(i));
//        }

        //tabLyout와 viewPager 연결
        new TabLayoutMediator(mTabLayout, mViewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull  TabLayout.Tab tab, int position) {
//                ImageView imageView = new ImageView(MainActivity.this);
//                imageView.setImageResource(img.get(position));
//                tab.setCustomView(imageView);

                TextView textView = new TextView(MainActivity.this);
                textView.setText(tabElement.get(position));
                tab.setCustomView(textView);
            }
        }).attach();


    }

}