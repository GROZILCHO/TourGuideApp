package com.example.roskata.tourguideapp;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemActivity extends AppCompatActivity {
    TextView toolbarText;
    TextView itemDescription;
    Toolbar toolbar;
    ImageView imageView;
    String description;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_item_activity);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarText = (TextView) findViewById(R.id.toolbar_text);
        imageView = (ImageView) findViewById(R.id.imageView);
        itemDescription = (TextView) findViewById(R.id.textView_item_description);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            toolbarText.setText(bundle.getString("CiteName"));
            if (toolbarText.toString().equalsIgnoreCase("Yo-Ho-Hostel")){
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.yohohostel));
                itemDescription.setText(R.string.yoho_description);
            }
        }


    }

    //Just destroy the activity like "home button" for not recreating the main/parent activity
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Responds to the action bar's Up/Home/back button
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
