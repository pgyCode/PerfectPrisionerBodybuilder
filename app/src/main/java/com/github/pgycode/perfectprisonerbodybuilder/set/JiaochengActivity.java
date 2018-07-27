package com.github.pgycode.perfectprisonerbodybuilder.set;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.github.pgycode.perfectprisonerbodybuilder.R;

/**
 * Created by Administrator on 2018/7/27/027.
 */

public class JiaochengActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_jiaocheng);

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        findViewById(R.id.btn_qa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (findViewById(R.id.txt_aa).getVisibility() == View.VISIBLE){
                    findViewById(R.id.txt_aa).setVisibility(View.GONE);
                }else{
                    findViewById(R.id.txt_aa).setVisibility(View.VISIBLE);
                }
            }
        });

        findViewById(R.id.btn_qb).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (findViewById(R.id.txt_ab).getVisibility() == View.VISIBLE){
                    findViewById(R.id.txt_ab).setVisibility(View.GONE);
                }else{
                    findViewById(R.id.txt_ab).setVisibility(View.VISIBLE);
                }
            }
        });

        findViewById(R.id.btn_qc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (findViewById(R.id.txt_ac).getVisibility() == View.VISIBLE){
                    findViewById(R.id.txt_ac).setVisibility(View.GONE);
                }else{
                    findViewById(R.id.txt_ac).setVisibility(View.VISIBLE);
                }
            }
        });

        findViewById(R.id.btn_qd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (findViewById(R.id.txt_ad).getVisibility() == View.VISIBLE){
                    findViewById(R.id.txt_ad).setVisibility(View.GONE);
                }else{
                    findViewById(R.id.txt_ad).setVisibility(View.VISIBLE);
                }
            }
        });

        findViewById(R.id.btn_qe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (findViewById(R.id.txt_ae).getVisibility() == View.VISIBLE){
                    findViewById(R.id.txt_ae).setVisibility(View.GONE);
                }else{
                    findViewById(R.id.txt_ae).setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
