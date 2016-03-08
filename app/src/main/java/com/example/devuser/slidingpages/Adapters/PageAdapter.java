package com.example.devuser.slidingpages.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.devuser.slidingpages.Fragments.BlueFragment;
import com.example.devuser.slidingpages.Fragments.GreenFragment;
import com.example.devuser.slidingpages.Fragments.RedFragment;

/**
 * Created by devuser on 07-03-2016.
 */
public class PageAdapter extends FragmentStatePagerAdapter {

    int noOfPages ;

    public PageAdapter(FragmentManager fm , int noOfPages) {
        super(fm);
        this.noOfPages = noOfPages ;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                BlueFragment blueFragment = new BlueFragment();
                return blueFragment ;
            case 1 :
                RedFragment redFragment = new RedFragment();
                return redFragment;
            case 2 :
                GreenFragment greenFragment = new GreenFragment();
                return greenFragment;

            default: return null;
        }
    }

    @Override
    public int getCount() {
        return noOfPages;
    }
}
