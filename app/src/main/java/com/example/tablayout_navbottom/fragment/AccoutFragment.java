package com.example.tablayout_navbottom.fragment;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tablayout_navbottom.Accout.AccoutViewAdapt̉er;
import com.example.tablayout_navbottom.R;
import com.example.tablayout_navbottom.databinding.FragmentAccoutBinding;
import com.example.tablayout_navbottom.databinding.FragmentHomeBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class AccoutFragment extends Fragment {
    FragmentAccoutBinding binding;
    AccoutViewAdapt̉er viewPageAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAccoutBinding.inflate(inflater, container, false);

        viewPageAdapter = new AccoutViewAdapt̉er(requireActivity(), 2);
        binding.accoutViewPager.setAdapter(viewPageAdapter);

        new TabLayoutMediator(binding.tabLayout, binding.accoutViewPager,
                (tab, position) -> {

                    switch (position) {
                        case 0:
                            tab.setText("Học tập");
                            break;
                        case 1:
                            tab.setText(" Hoạt động ");
                            break;
                    }
                }).attach();
        changeTabFontSize();
        setTabDividers();
        return binding.getRoot();
    }
    private void setTabDividers() {
        View root = binding.tabLayout.getChildAt(0);
        if (root instanceof LinearLayout) {
            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
            GradientDrawable drawable = new GradientDrawable();
            drawable.setColor(Color.WHITE);
            drawable.setSize(30, 1);
            ((LinearLayout) root).setDividerPadding(20);
            ((LinearLayout) root).setDividerDrawable(drawable);
        }
    }
    private void changeTabFontSize() {
        for (int i = 0; i < binding.tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = binding.tabLayout.getTabAt(i);
            if (tab != null) {
                // Lấy TextView của tab
                View tabView = ((ViewGroup) binding.tabLayout.getChildAt(0)).getChildAt(i);
                if (tabView instanceof LinearLayout) {
                    LinearLayout layout = (LinearLayout) tabView;
                    TextView tabTextView = (TextView) layout.getChildAt(1);

                    // Đặt kích thước chữ cho TextView của tab
                    tabTextView.setTextSize(18); // Thay đổi kích thước chữ
                    tabTextView.setTypeface(null, Typeface.BOLD); // In đậm
                }
            }
        }
    }
}