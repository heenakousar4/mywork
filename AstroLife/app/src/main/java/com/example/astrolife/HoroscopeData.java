package com.example.astrolife;

import android.widget.ImageView;

public class HoroscopeData {
    String zodiacName;
    String zodiacImageName;
    ImageView imageView;
    public HoroscopeData(String zodiacName,String zodiacImageName,ImageView imageView){
        this.zodiacName = zodiacName;
        this.zodiacImageName = zodiacImageName;
        this.imageView = imageView;
    }
}
