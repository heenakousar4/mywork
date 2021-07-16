package com.example.fetch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pd.setMessage("Please Wait .....");
        pd.setProgress(ProgressDialog.STYLE_SPINNER);
    }
    Retrofit retrofit= new Retrofit.Builder()
            .baseUrl("https://www.astroyogi.com/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build();

}