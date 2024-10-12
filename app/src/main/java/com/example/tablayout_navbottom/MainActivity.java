package com.example.tablayout_navbottom;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.tablayout_navbottom.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    private ViewPageAdapter viewPageAdapter;
    private BottomNavigationView bottomNavigationView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Khởi tạo ViewPager2 và BottomNavigationView
        viewPageAdapter = new ViewPageAdapter(this);
        binding.viewPager.setAdapter(viewPageAdapter);

        bottomNavigationView = binding.bottomNavigationView;
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.bottom_home) {
                    binding.viewPager.setCurrentItem(0);
                    return true;
                } else if (item.getItemId() == R.id.bottom_accout) {
                    binding.viewPager.setCurrentItem(1);
                    return true;
                }
                return false;
            }
        });


    }
}
