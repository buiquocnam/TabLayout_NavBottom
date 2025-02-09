package com.example.tablayout_navbottom;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayout_navbottom.fragment.AccoutFragment;
import com.example.tablayout_navbottom.fragment.HomeFragment;

public class ViewPageAdapter extends FragmentStateAdapter {
    private int i;
    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.i = i;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new AccoutFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2; // Số lượng fragment
    }


}
