package com.example.roskata.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Cite {
    /** App cite image resource ID */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static int NO_IMAGE_PROVIDED = -1;

    /** App item Label*/
    private String mCiteLabel;

    /** App item Description*/
    private String mCiteDescription;

    /**
     * Create a new Cite object.
     *
     * @param imageRecourceId is the image for this cite
     *
     *@param citeDescription is the text explain the what to find on this cite
     */
    public Cite(int imageRecourceId, String citeLabel, String citeDescription){
        mImageResourceId = imageRecourceId;
        mCiteLabel = citeLabel;
        mCiteDescription = citeDescription;
    }

    /**
     * Get the image for this cite.
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Get this cite's label.
     */
    public String getCiteLabel() {
        return mCiteLabel;
    }

    /**
     * Get the description for this cite.
     */
    public String getCiteText() {return mCiteDescription; }

    /**
     * Return weather or not there is a image for this word.
     * @return mImageResourceId
     * */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    /**
     * Returns the string representation of the {@link Cite} object.
     */
    @Override
    public String toString() {
        return "Cite{" +
                "mImageResourceId" + mImageResourceId +
                "mCiteLabel" + mCiteLabel +
                "mCiteDescription" + mCiteDescription +
                "}";
    }
}