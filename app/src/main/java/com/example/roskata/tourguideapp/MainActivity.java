package com.example.roskata.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView toolbarText;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    toolbarText.setText(R.string.accommodation_label);
                    toolbar.setBackgroundResource(R.drawable.accommodation);
                } else if (position == 1) {
                    toolbarText.setText(R.string.culture_label);
                    toolbar.setBackgroundResource(R.drawable.culture);
                } else if (position == 2) {
                    toolbarText.setText(R.string.museums_label);
                    toolbar.setBackgroundResource(R.drawable.museums);
                } else {
                    toolbarText.setText(R.string.fun_label);
                    toolbar.setBackgroundResource(R.drawable.fun);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        toolbarText = findViewById(R.id.toolbar_text);
        toolbar = findViewById(R.id.toolbar);
    }


}
