package com.priyankanandiraju.pocketprompter.utils;

import android.content.Context;
import android.support.annotation.ColorInt;

import com.priyankanandiraju.pocketprompter.R;

/**
 * Created by priyankanandiraju on 8/11/17.
 */

public class TeleprompterView {

    private final Context mContext;

    public TeleprompterView(Context context) {
        mContext = context;
    }

    public int generateBgColor(String newBgColorKey) {

        @ColorInt
        int bgColor;

        if (newBgColorKey.equals(mContext.getString(R.string.bg_color_black_value))) {
            bgColor = android.R.color.black;
        } else {
            bgColor = android.R.color.white;
        }
        return bgColor;
    }

    /**
     * Sets the color of the teleprompter text. This should be one of the preference color values
     *
     * @param newColorKey
     */
    public int generateTextColor(String newColorKey) {

        @ColorInt
        int textColor;

        if (newColorKey.equals(mContext.getString(R.string.text_color_blue_value))) {
            textColor = android.R.color.holo_blue_bright;
        } else if (newColorKey.equals(mContext.getString(R.string.text_color_red_value))) {
            textColor = android.R.color.holo_red_dark;
        } else if (newColorKey.equals(mContext.getString(R.string.text_color_white_value))) {
            textColor = android.R.color.white;
        } else {
            textColor = android.R.color.black;
        }
        return textColor;
    }

    public int generateTextSize(String newSizeKey) {

        int textSize;

        if (newSizeKey.equals(mContext.getString(R.string.text_size_small_value))) {
            textSize = 24;
        } else if (newSizeKey.equals(mContext.getString(R.string.text_size_medium_value))) {
            textSize = 48;
        } else {
            textSize = 72;
        }

        return textSize;
    }

    public int generateTextScrollSpeed(String newSpeedKey) {
        int textScrollSpeed;

        if (newSpeedKey.equals(mContext.getString(R.string.speed_30_value))) {
            textScrollSpeed = 30;
        } else if (newSpeedKey.equals(mContext.getString(R.string.speed_20_value))) {
            textScrollSpeed = 20;
        } else {
            textScrollSpeed = 10;
        }

        return textScrollSpeed * 5 * 1000;
    }

}
