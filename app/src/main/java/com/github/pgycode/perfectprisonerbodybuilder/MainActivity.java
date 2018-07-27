package com.github.pgycode.perfectprisonerbodybuilder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {


    private TextView txtTime = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        System.out.println("有没有使用");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btn_breast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                intent.putExtra(App.STR_TO_YI, App.INT_YI_BREAST);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_stomach).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                intent.putExtra(App.STR_TO_YI, App.INT_YI_STAMACH);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                intent.putExtra(App.STR_TO_YI, App.INT_YI_BACK);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_leg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                intent.putExtra(App.STR_TO_YI, App.INT_YI_LEG);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_shoulder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                intent.putExtra(App.STR_TO_YI, App.INT_YI_SHOULDER);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_spine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContentActivity.class);
                intent.putExtra(App.STR_TO_YI, App.INT_YI_SPINE);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn_set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SetActivity.class);
                startActivity(intent);
            }
        });


        txtTime = findViewById(R.id.txt_time);
        txtTime.setText("今天是你进入里克斯岛监狱的第" +
                ((System.currentTimeMillis() - App.start) / (24 * 60 * 60 * 1000) + 1)  +
                "天");
    }

    @Override
    protected void onResume() {
        super.onResume();

        System.out.println(System.currentTimeMillis() + "销毁之后");
    }
}
