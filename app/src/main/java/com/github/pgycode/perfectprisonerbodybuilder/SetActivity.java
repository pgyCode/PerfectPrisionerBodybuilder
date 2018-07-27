package com.github.pgycode.perfectprisonerbodybuilder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.github.pgycode.perfectprisonerbodybuilder.set.FankuiActivity;
import com.github.pgycode.perfectprisonerbodybuilder.set.HaojiaoActivity;
import com.github.pgycode.perfectprisonerbodybuilder.set.JiaochengActivity;
import com.github.pgycode.perfectprisonerbodybuilder.set.JiepaiActivity;
import com.github.pgycode.perfectprisonerbodybuilder.set.JiluActivity;
import com.github.pgycode.perfectprisonerbodybuilder.set.ShangchengActivity;

/**
 * Created by Administrator on 2018/7/27/027.
 */

public class SetActivity extends Activity {


    private TextView txtTip;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.set);

        txtTip = findViewById(R.id.txt_tip);
        txtTip.setText("监狱设施");

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        findViewById(R.id.btn_haojiao).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SetActivity.this, HaojiaoActivity.class));
            }
        });
        findViewById(R.id.btn_jilu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SetActivity.this, JiluActivity.class));
            }
        });
        findViewById(R.id.btn_jiepai).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SetActivity.this, JiepaiActivity.class));
            }
        });
        findViewById(R.id.btn_fankui).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SetActivity.this, FankuiActivity.class));
            }
        });
        findViewById(R.id.btn_jiaocheng).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SetActivity.this, JiaochengActivity.class));
            }
        });
        findViewById(R.id.btn_shangcheng).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(SetActivity.this, ShangchengActivity.class));
                Toast.makeText(SetActivity.this, "这不是正版app，没有商城功能", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
