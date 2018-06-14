package com.example.roskata.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ImageView;

class CategoryAdapter extends FragmentPagerAdapter{

    /** Context of the app */
    private Context context;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return new AccommodationFragment();
        } else if (position == 1){
            return new CultureFragment();
        } else if (position == 2){
            return new MuseumsFragment();
        } else {
            return new FunFragment();
        }
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return context.getString(R.string.category_accommodation);
        } else if (position == 1){
            return context.getString(R.string.category_culture);
        } else if (position == 2){
            return context.getString(R.string.category_museums);
        } else {
            return context.getString(R.string.category_fun);
        }
    }


}
