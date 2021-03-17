package com.example.verifyproduct;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    private TextView scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scan = findViewById(R.id.Scan);

        String text = "Scan Your Product";

        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new ForegroundColorSpan(
                        ContextCompat.getColor(getApplicationContext(), R.color.purple_app_theme)),
                0, 7,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new ForegroundColorSpan(
                        ContextCompat.getColor(getApplicationContext(), R.color.pink_app_theme)),
                7, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        scan.setText(spannableString);

        // make sure to import android.support.v7.app.ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.gradient));
    }
}