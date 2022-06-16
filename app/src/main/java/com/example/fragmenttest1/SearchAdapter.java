package com.example.fragmenttest1;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchAdapter extends FragmentStateAdapter {
    private ArrayList<Fragment> arrayList = new ArrayList<>();
    private int mPageCount = 7;

    public SearchAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
//
//    public SearchAdapter(@NonNull Fragment fragment) {
//        super(fragment);
//    }

    public SearchAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        arrayList.add(new SearchFragment());
        arrayList.add(new ItalyFragment());
        arrayList.add(new LikeFragment());

    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                SearchFragment searchFragment = new SearchFragment();
                return searchFragment;
            case 1:
                ItalyFragment italyFragment = new ItalyFragment();
                return italyFragment;
            case 2:
                LikeFragment likeFragment = new LikeFragment();
                return likeFragment;
            case 3:
                SearchFragment searchFragment1 = new SearchFragment();
                return searchFragment1;
            case 4:
                ItalyFragment italyFragment1 = new ItalyFragment();
                return italyFragment1;
            case 5:
                LikeFragment likeFragment1 = new LikeFragment();
                return likeFragment1;
            case 6:
                SearchFragment searchFragment2 = new SearchFragment();
                return searchFragment2;
            default:
                return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemCount() {
        return mPageCount;
    }

}

