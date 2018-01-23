package com.example.asus.myviewgroup;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class Adapter extends FragmentPagerAdapter {
    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                MyFragment_1 frist = new MyFragment_1();
                return frist;
            case 1:
                MyFragment_2 two = new MyFragment_2();
                return two;
            case 2:
                MyFragment_3 three = new MyFragment_3();
                return three;
            case 3:
                MyFragment_4 four = new MyFragment_4();
                return  four;
            default:
             return null;

        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
