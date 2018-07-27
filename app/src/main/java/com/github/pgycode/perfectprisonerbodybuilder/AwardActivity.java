package com.github.pgycode.perfectprisonerbodybuilder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/7/26/026.
 */

public class AwardActivity extends Activity {



    private TextView txtTip;

    private TextView txtName;
    private TextView txtTime;
    private TextView txtPart;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.award);

        txtTip = findViewById(R.id.txt_tip);
        txtTip.setText("返回主页");

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        txtName = findViewById(R.id.txt_name);
        txtTime = findViewById(R.id.txt_time);
        txtPart = findViewById(R.id.txt_part);

        findViewById(R.id.root).setBackground(new BitmapDrawable(ImageLoader.readBitMap(R.drawable.award_bg)));

        ((ImageView)findViewById(R.id.icon)).setImageBitmap(ImageLoader.readBitMap(R.drawable.award_icon));

        txtName.setText(getIntent().getStringExtra("name"));
        txtTime.setText(getIntent().getStringExtra("time"));
        txtPart.setText(getIntent().getStringExtra("part"));
    }


    @Override
    public void finish() {
        startActivity(new Intent(AwardActivity.this, TrainActivity.class));
    }
}
