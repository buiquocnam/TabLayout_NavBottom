package com.example.tablayout_navbottom.Accout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AccoutViewAdapt̉er extends FragmentStateAdapter {
    private int totalTabs;
    public AccoutViewAdapt̉er(@NonNull FragmentActivity fragmentActivity, int totalTabs) {
        super(fragmentActivity);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new tabLeftFragment();
            case 1:
                return new tabRightFragment();
            default:
                return new tabLeftFragment();
        }
    }

    @Override
    public int getItemCount() {
        return totalTabs;
    }
}
