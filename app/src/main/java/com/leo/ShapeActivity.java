package com.leo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lihang.ShadowLayout;

public class ShapeActivity extends AppCompatActivity {
    ShadowLayout ShadowLayout_Clickable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);
        ShadowLayout_Clickable = findViewById(R.id.ShadowLayout_Clickable);
        ShadowLayout_Clickable.setClickable(false);
    }
}
