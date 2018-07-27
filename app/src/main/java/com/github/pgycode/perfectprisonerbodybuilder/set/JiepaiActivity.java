package com.github.pgycode.perfectprisonerbodybuilder.set;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.github.pgycode.perfectprisonerbodybuilder.R;

/**
 * Created by Administrator on 2018/7/27/027.
 */

public class JiepaiActivity extends Activity {

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
    }
}
