package com.example.digidress;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessangerAdapter extends FragmentPagerAdapter {


    public ViewPagerMessangerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new DailyServicesFragment();
        } else if(position==1){
            return new StichingFragment();
        }else if(position==2){
            return new PendingOrderFragment();
        } else {
            return new ProfileFinalFragment();
        }
    }

    @Override
    public int getCount() {
        return 4; //no. of tabs
    }



    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Daily Services";
        }else if(position==1){
            return "Stiching";
        }else if(position==2){
            return "Pending Order";
        }else{
            return "Profile";
        }

    }
}
