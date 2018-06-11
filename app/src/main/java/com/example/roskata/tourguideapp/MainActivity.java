package com.example.roskata.tourguideapp;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView toolbarText;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(getSupportFragmentManager(), this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    toolbarText.setText("Accommodation");
                    toolbar.setBackgroundResource(R.drawable.accommodation);
                } else if (position == 1) {
                    toolbarText.setText("Culture");
                    toolbar.setBackgroundResource(R.drawable.culture);
                } else if (position == 2) {
                    toolbarText.setText("Museums");
                    toolbar.setBackgroundResource(R.drawable.museums);
                } else {
                    toolbarText.setText("Fun");
                    toolbar.setBackgroundResource(R.drawable.fun);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
    }


}
