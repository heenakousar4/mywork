package com.example.demo_1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class know_your_sign extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_your_sign);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(know_your_sign.this,
                        know_your_sign.this, year, month, day);
                datePickerDialog.show();
            }
        });
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        //return date
        textView.setText("Your zodiac sign is " +getZodiacSign(dayOfMonth, month));
    }

    private String getZodiacSign(int day, int month) {
        String zodiacSign = "";
        if (month == 0) {
            if (day < 20) {
                zodiacSign = "capricorn";
            } else {
                zodiacSign = "Aquarius";
            }
        } else if (month == 1) {
            if (day < 20) {
                zodiacSign = "Aquarius";
            } else {
                zodiacSign = "Pisces";
            }
        } else if (month == 2) {
            if (day < 20) {
                zodiacSign = "Pisces";
            } else {
                zodiacSign = "Aries";
            }
        } else if (month == 3) {
            if (day < 20) {
                zodiacSign = "Aries";
            } else {
                zodiacSign = "Taurus";
            }
        } else if (month == 4) {
            if (day < 20) {
                zodiacSign = "Taurus";
            } else {
                zodiacSign = "Gemini";
            }
        } else if (month == 5) {
            if (day < 20) {
                zodiacSign = "Gemini";
            } else {
                zodiacSign = "Cancer";
            }
        } else if (month == 6) {
            if (day < 20) {
                zodiacSign = "Cancer";
            } else {
                zodiacSign = "Leo";
            }
        } else if (month == 7) {
            if (day < 20) {
                zodiacSign = "Leo";
            } else {
                zodiacSign = "Virgo";
            }
        } else if (month == 8) {
            if (day < 20) {
                zodiacSign = "Virgo";
            } else {
                zodiacSign = "Libra";
            }
        } else if (month == 9) {
            if (day < 20) {
                zodiacSign = "Libra";
            } else {
                zodiacSign = "Scorpio";
            }
        } else if (month == 10) {
            if (day < 20) {
                zodiacSign = "Scorpio";
            } else {
                zodiacSign = "Sagittarius";
            }
        } else if (month == 11) {
            if (day < 20) {
                zodiacSign = "Sagittarius";
            } else {
                zodiacSign = "Capricorn";
            }
        }
        return zodiacSign;
    }
}
