package com.example.fragmentqr;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    int numTabs;
    public MyPagerAdapter(@NonNull FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Fragment1 f1=new Fragment1();
                return f1;
            case 1:
                Fragment2 f2=new Fragment2();
                return f2;
            case 2:
                Fragment3 f3=new Fragment3();
                return f3;
            case 3:
                Fragment3 f4=new Fragment3();
                return f4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}

