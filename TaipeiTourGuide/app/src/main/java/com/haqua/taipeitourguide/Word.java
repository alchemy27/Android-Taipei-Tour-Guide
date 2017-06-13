package com.haqua.taipeitourguide;

/**
 * Created by haqua on 2017/05/25.
 */

public class Word {
    private String mAttraction;
    private String mDescription;

    // Setter for Word
    public Word(String defaultAttraction, String defaultDescription) {
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
}
