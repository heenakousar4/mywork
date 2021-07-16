package com.example.astrolife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final List<HoroscopeData> horoscopeDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        prepareHoroscopeData();

    }
    private void prepareHoroscopeData(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        ImageView imageView = findViewById(R.id.imageView);
        HoroscopeAdapter horoscopeAdapter = new HoroscopeAdapter(this,horoscopeDataList);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(horoscopeAdapter);

        String[] zodiacArray = {"taurus","gemini","cancer","leo","virgo","libra","scorpio","sagittarius","capricorn","aquarius","pisces"};
        HoroscopeData horoscopeData = new HoroscopeData("ARIES","aries200",imageView);
        horoscopeDataList.add(horoscopeData);
        for(String zodiac : zodiacArray){
            horoscopeData = new HoroscopeData(zodiac.toUpperCase(),zodiac.toLowerCase()+"200",imageView);
            horoscopeDataList.add(horoscopeData);
        }
    }
}