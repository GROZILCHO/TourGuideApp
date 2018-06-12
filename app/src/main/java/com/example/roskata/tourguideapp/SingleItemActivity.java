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
    TextView singleAddressView;
    Toolbar toolbar;
    ImageView imageView;
    String description;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_item_activity);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarText = (TextView) findViewById(R.id.toolbar_text);
        singleAddressView = (TextView) findViewById(R.id.single_address_view);
        imageView = (ImageView) findViewById(R.id.imageView);
        itemDescription = (TextView) findViewById(R.id.textView_item_description);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            toolbarText.setText(bundle.getString("CiteName"));
            if (toolbarText.getText().toString().equals("Yo-Ho-Hostel")){
                singleAddressView.setText(R.string.yoho_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.yohohostel));
                itemDescription.setText(R.string.yoho_description);
            } else if (toolbarText.getText().toString().equals("Hostel Del Mar")){
                singleAddressView.setText(R.string.del_mar_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.del_mare));
                itemDescription.setText(R.string.del_mar_description);
            } else if (toolbarText.getText().toString().equals("X-Hostel")){
                singleAddressView.setText(R.string.xhostel_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.x_hostel));
                itemDescription.setText(R.string.xhostel_description);
            } else if (toolbarText.getText().toString().equals("Avocado Hostel")){
                singleAddressView.setText(R.string.avocado_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.avocado));
                itemDescription.setText(R.string.avocado_description);
            } else if (toolbarText.getText().toString().equals("\"Varna Summer\" International Music Festival")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.varna_summer_int_music_fest_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.varna_summer));
                itemDescription.setText(R.string.varna_summer_int_music_fest_description);
            }  else if (toolbarText.getText().toString().equals("International Theatre Festival \"Varna Summer\"")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.int_theater_fest_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.theatral_fest));
                itemDescription.setText(R.string.int_theater_fest_description);
            }  else if (toolbarText.getText().toString().equals("28th International Ballet Competition")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.int_ballet_fest_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.ballet));
                itemDescription.setText(R.string.int_ballet_fest_description);
            } else if (toolbarText.getText().toString().equals("26th INTERNATIONAL JAZZ FESTIVAL")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.int_jazz_fest_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.jazz));
                itemDescription.setText(R.string.int_jazz_fest_description);
            } else if (toolbarText.getText().toString().equals("International Folklore Festival \"Varna Summer\"")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.int_folk_fest_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.folk));
                itemDescription.setText(R.string.int_folk_fest_description);
            } else if (toolbarText.getText().toString().equals("XIX International Print Biennial")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.print_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.print));
                itemDescription.setText(R.string.print_description);
            } else if (toolbarText.getText().toString().equals("RADAR Festival")){
                toolbar.setBackgroundResource(R.drawable.culture);
                singleAddressView.setText(R.string.radar_fest_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.radar));
                itemDescription.setText(R.string.radar_fest_description);
            } else if (toolbarText.getText().toString().equals("International regatta \"Cor Caroli\" 2018")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.cor_caroli_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.cor_caroli));
                itemDescription.setText(R.string.cor_caroli_description);
            } else if (toolbarText.getText().toString().equals("Love is folly - International Film Festival")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(30);
                singleAddressView.setText(R.string.love_is_folly_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.love));
                itemDescription.setText(R.string.love_is_folly_description);
            } else if (toolbarText.getText().toString().equals("17th Festival Of Red Cross And Health Films")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(30);
                singleAddressView.setText(R.string.red_cross_film_fest_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.red_cross));
                itemDescription.setText(R.string.red_cross_film_fest_description);
            } else if (toolbarText.getText().toString().equals("Golden Rose Bulgarian Feature Film Fest")){
                toolbar.setBackgroundResource(R.drawable.culture);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.golden_rose_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.golden_rose));
                itemDescription.setText(R.string.golden_rose_description);
            } else if (toolbarText.getText().toString().equals("Archaeological Museum")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.archaeological_museum_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.archeological));
                itemDescription.setText(R.string.archaeological_museum_description);
            } else if (toolbarText.getText().toString().equals("Ethnographic Museum")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.ethnographic_museum_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.ethnographical));
                itemDescription.setText(R.string.ethnographic_museum_description);
            } else if (toolbarText.getText().toString().equals("Varna Necropolis")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.varna_necropolis_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.necropolis));
                itemDescription.setText(R.string.varna_necropolis_description);
            } else if (toolbarText.getText().toString().equals("Park Museum \"Vladislav Varnenchik\"")){
                toolbar.setBackgroundResource(R.drawable.museums);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.vladislav_varnenchik_museum_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.varnenchik));
                itemDescription.setText(R.string.vladislav_varnenchik_museum_description);
            } else if (toolbarText.getText().toString().equals("Naval Museum")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.naval_museum_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.naval));
                itemDescription.setText(R.string.naval_museum_description);
            } else if (toolbarText.getText().toString().equals("Varna Aquarium")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.aquarium_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.aquarium));
                itemDescription.setText(R.string.aquarium_description);
            } else if (toolbarText.getText().toString().equals("Varna Puppet Museum")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.pupets_museum_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.puppets));
                itemDescription.setText(R.string.pupets_museum_description);
            } else if (toolbarText.getText().toString().equals("Roman Thermae")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.roman_baths_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.roman_baths));
                itemDescription.setText(R.string.roman_baths_description);
            } else if (toolbarText.getText().toString().equals("Astronomical Observatory and Planetarium Copernicus")){
                toolbar.setBackgroundResource(R.drawable.museums);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.observatory_museum_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.observatory));
                itemDescription.setText(R.string.observatory_museum_description);
            } else if (toolbarText.getText().toString().equals("FIVB Volleyball Men's World Championship")){
                toolbar.setBackgroundResource(R.drawable.museums);
                toolbarText.setTextSize(33);
                singleAddressView.setText(R.string.volley_calendar);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.volley));
                itemDescription.setText(R.string.volley_description);
            } else if (toolbarText.getText().toString().equals("Na Tamno")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.na_tamno_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.na_tamno));
                itemDescription.setText(R.string.na_tamno_description);
            } else if (toolbarText.getText().toString().equals("Three Lions Pub")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.three_lions_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.three_lions));
                itemDescription.setText(R.string.three_lions_description);
            } else if (toolbarText.getText().toString().equals("Cubo")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.cubo_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.cubo));
                itemDescription.setText(R.string.cubo_description);
            } else if (toolbarText.getText().toString().equals("Menthol")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.menthol_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.menthol));
                itemDescription.setText(R.string.menthol_description);
            } else if (toolbarText.getText().toString().equals("Sundogs")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.sundogs_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.sundogs));
                itemDescription.setText(R.string.sundogs_description);
            } else if (toolbarText.getText().toString().equals("Indian Bar")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.indian_bar_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.indian));
                itemDescription.setText(R.string.indian_bar_description);
            } else if (toolbarText.getText().toString().equals("The Social Teahouse")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.the_social_teahouse_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.social_teahouse));
                itemDescription.setText(R.string.the_social_teahouse_description);
            } else if (toolbarText.getText().toString().equals("Rubik Art Center")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.rubic_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.rubic));
                itemDescription.setText(R.string.rubic_description);
            } else if (toolbarText.getText().toString().equals("Dockers Club")){
                toolbar.setBackgroundResource(R.drawable.museums);
                singleAddressView.setText(R.string.dockers_dlub_address);
                imageView.setImageDrawable(ContextCompat.getDrawable(SingleItemActivity.this, R.drawable.dockers));
                itemDescription.setText(R.string.dockers_dlub_description);
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
