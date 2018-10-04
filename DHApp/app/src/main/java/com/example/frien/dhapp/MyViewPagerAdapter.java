package com.example.frien.dhapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    final int MAX_PAGE = 2;
    FirstFragment fragmentFirst = new FirstFragment();
    SecFragment fragmentSec = new SecFragment();
    Fragment currentFragment = new Fragment();

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position<0||MAX_PAGE<=position)
        return null;
        switch(position){
            case 0:
                currentFragment = fragmentFirst;
                break;
            case 1:
                currentFragment = fragmentSec;
                break;
        }
        return currentFragment;
    }

    @Override
    public int getCount() {
        return MAX_PAGE;
    }
}
