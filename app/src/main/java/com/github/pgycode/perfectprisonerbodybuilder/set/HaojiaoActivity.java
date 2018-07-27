package com.github.pgycode.perfectprisonerbodybuilder.set;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.github.pgycode.perfectprisonerbodybuilder.App;
import com.github.pgycode.perfectprisonerbodybuilder.ImageLoader;
import com.github.pgycode.perfectprisonerbodybuilder.R;

/**
 * Created by Administrator on 2018/7/27/027.
 */

public class HaojiaoActivity extends Activity {


    private ImageButton btnMan;
    private ImageButton btnWomen;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_haojiao);

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnMan = findViewById(R.id.btn_man);
        btnWomen = findViewById(R.id.btn_women);

        if (App.sound == 0){
            btnMan.setImageBitmap(ImageLoader.readBitMap(R.drawable.man_chinese_s));
            btnWomen.setImageBitmap(ImageLoader.readBitMap(R.drawable.woman_english_n));
        }else{
            btnMan.setImageBitmap(ImageLoader.readBitMap(R.drawable.man_chinese_n));
            btnWomen.setImageBitmap(ImageLoader.readBitMap(R.drawable.woman_english_s));
        }

        btnMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMan.setImageBitmap(ImageLoader.readBitMap(R.drawable.man_chinese_s));
                btnWomen.setImageBitmap(ImageLoader.readBitMap(R.drawable.woman_english_n));
                App.sound = 0;
                App.sharedPreferences.edit().putInt("sound", 0).commit();
            }
        });

        btnWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnMan.setImageBitmap(ImageLoader.readBitMap(R.drawable.man_chinese_n));
                btnWomen.setImageBitmap(ImageLoader.readBitMap(R.drawable.woman_english_s));
                App.sound = 1;
                App.sharedPreferences.edit().putInt("sound", 1).commit();
            }
        });
    }
}
