package com.example.roskata.tourguideapp;

public class Cite {
    /** App cite image resource ID */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static int NO_IMAGE_PROVIDED = -1;

    /** App item Label*/
    private String citeLabel;

    /** App item Description*/
    private String citeDescription;

    /**
     * Create a new Cite object.
     *
     * @param imageRecourceId is the image for this cite
     *
     *@param citeDescription is the text explain the what to find on this cite
     */
    public Cite(int imageRecourceId, String citeLabel, String citeDescription){
        this.imageResourceId = imageRecourceId;
        this.citeLabel = citeLabel;
        this.citeDescription = citeDescription;
    }

    /**
     * Get the image for this cite.
     */
    public int getImageResourceId() { return imageResourceId; }

    /**
     * Get this cite's label.
     */
    public String getCiteLabel() {
        return citeLabel;
    }

    /**
     * Get the description for this cite.
     */
    public String getCiteText() {return citeDescription; }

    /**
     * Return weather or not there is a image for this word.
     * @return mImageResourceId
     * */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

}