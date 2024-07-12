package com.example.project_app_laptop.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.example.project_app_laptop.Fragments.frmHome_main;
import com.example.project_app_laptop.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    AHBottomNavigation nav_bottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addcontrols();
        addevents();
    }
    void addcontrols()
    {
        nav_bottom = findViewById(R.id.nav_bottom_main);

        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.tab_1, R.drawable.baseline_home_24, R.color.white);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.tab_2, R.drawable.baseline_shopping_cart_24, R.color.white);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.tab_3, R.drawable.baseline_playlist_add_check_circle_24, R.color.white);
        AHBottomNavigationItem item4 = new AHBottomNavigationItem(R.string.tab_4, R.drawable.baseline_account_circle_24, R.color.white);

        nav_bottom.addItem(item1);
        nav_bottom.addItem(item2);
        nav_bottom.addItem(item3);
        nav_bottom.addItem(item4);

        nav_bottom.setColored(false);
        replaceFragment(new frmHome_main());
    }
    void addevents()
    {
        nav_bottom.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                if (position == 0)
                {
                    replaceFragment(new frmHome_main());
                    return true;
                }
                if (position == 1)
                {
                    Intent intent = new Intent(MainActivity.this, CartActivity.class);
                    startActivity(intent);
                    return true;
                }
                if (position == 2)
                {
                    replaceFragment(new frmHome_main());
                    return true;
                }
                if (position == 3)
                {
                    replaceFragment(new frmHome_main());
                    return true;
                }
                return false;
            }
        });
    }
    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.frm_layout_main, fragment).commit();
    }
}