package com.haqua.taipeitourguide;

/**
 * Created by haqua on 2017/05/25.
 */

public class Word {
    private String mAttraction;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    // Setter for Word
    public Word(String defaultAttraction, String defaultDescription, int imageResourceId) {
        mAttraction = defaultAttraction;
        mDescription = defaultDescription;
    }

    // Getter for attraction
    public String getAttraction() {
        return mAttraction;
    }

    // Getter for description
    public String getDescription() {
        return mDescription;
    }

    // Getter for image resource ID
    public int getImageResourceID() {
        return mImageResourceId;
    }

    // Returns if there is an image for the attraction
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
