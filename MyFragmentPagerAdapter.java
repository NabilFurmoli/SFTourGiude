package com.example.android.sftourgiude;


import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MyFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ResturantsFragment();
        } else if (position == 1){
            return new ParksFragment();
        } else if(position == 2) {
            return new BeachesFragment();
        }
        else {
            return new TeamActivitiesFragment();
        }

    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.rest_catg);
        } else if (position == 1) {
            return mContext.getString(R.string.parks_catg);
        } else if (position == 2) {
            return mContext.getString(R.string.beaches_catg);
        } else {
            return mContext.getString(R.string.team_activity);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
