package com.github.pgycode.perfectprisonerbodybuilder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class ContentActivity extends Activity {

    private final int[][] imgs = {
            {
                    R.drawable.content_breast_a,
                    R.drawable.content_breast_b,
                    R.drawable.content_breast_c,
                    R.drawable.content_breast_d,
                    R.drawable.content_breast_e,
                    R.drawable.content_breast_f,
                    R.drawable.content_breast_g,
                    R.drawable.content_breast_h,
                    R.drawable.content_breast_i,
                    R.drawable.content_breast_j
            },
            {
                    R.drawable.content_stomach_a,
                    R.drawable.content_stomach_b,
                    R.drawable.content_stomach_c,
                    R.drawable.content_stomach_d,
                    R.drawable.content_stomach_e,
                    R.drawable.content_stomach_f,
                    R.drawable.content_stomach_g,
                    R.drawable.content_stomach_h,
                    R.drawable.content_stomach_i,
                    R.drawable.content_stomach_j
            },
            {
                    R.drawable.content_back_a,
                    R.drawable.content_back_b,
                    R.drawable.content_back_c,
                    R.drawable.content_back_d,
                    R.drawable.content_back_e,
                    R.drawable.content_back_f,
                    R.drawable.content_back_g,
                    R.drawable.content_back_h,
                    R.drawable.content_back_i,
                    R.drawable.content_back_j
            },
            {
                    R.drawable.content_leg_a,
                    R.drawable.content_leg_b,
                    R.drawable.content_leg_c,
                    R.drawable.content_leg_d,
                    R.drawable.content_leg_e,
                    R.drawable.content_leg_f,
                    R.drawable.content_leg_g,
                    R.drawable.content_leg_h,
                    R.drawable.content_leg_i,
                    R.drawable.content_leg_j,
            },
            {
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a,
                    R.drawable.content_shoulder_a
            },
            {
                    R.drawable.content_spine_a,
                    R.drawable.content_spine_b,
                    R.drawable.content_spine_c,
                    R.drawable.content_spine_d,
                    R.drawable.content_spine_e,
                    R.drawable.content_spine_g,
                    R.drawable.content_spine_f,
                    R.drawable.content_spine_g,
                    R.drawable.content_spine_h,
                    R.drawable.content_spine_i,
                    R.drawable.content_spine_j
            }
    };


    private final String[][] txts = {
            {
                    "墙壁式",
                    "上斜式",
                    "膝盖式",
                    "半式",
                    "标准式",
                    "窄距式",
                    "偏重式",
                    "单臂半式",
                    "杠杆式",
                    "单臂式"
            },
            {
                    "坐姿屈膝",
                    "平卧抬膝",
                    "平卧屈",
                    "平卧蛙",
                    "平卧直",
                    "悬垂屈膝",
                    "悬垂屈",
                    "悬垂蛙",
                    "悬垂平",
                    "悬垂直"
            },
            {
                    "垂直引体",
                    "水平式",
                    "折刀式",
                    "半式",
                    "标准式",
                    "窄距式",
                    "偏重式",
                    "单臂半式",
                    "单臂辅助式",
                    "单臂式"
            },
            {
                    "肩倒立式",
                    "折刀式",
                    "支撑式",
                    "半式",
                    "标准式",
                    "窄距式",
                    "偏重式",
                    "单腿半式",
                    "单腿辅助式",
                    "单腿式"
            },
            {
                    "靠墙顶立",
                    "乌鸦式",
                    "靠墙倒立",
                    "半式",
                    "标准式",
                    "窄距式",
                    "偏重式",
                    "单臂半式",
                    "杠杆式",
                    "单臂式"
            },
            {
                    "短桥",
                    "直桥",
                    "高低桥",
                    "顶桥",
                    "半桥",
                    "标准桥",
                    "下行桥",
                    "上行桥",
                    "合桥",
                    "铁板桥"
            }
    };

    private final String[] titles = {
            "俯卧撑",
            "举腿",
            "引体向上",
            "深蹲",
            "倒立撑",
            "桥"
    };

    private LinearLayout container = null;

    private TextView txtTip = null;

    private int yi = 0;

    private MyAsycnTask myAsycnTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.content);

        findViewById(R.id.root).setBackground(new BitmapDrawable(ImageLoader.readBitMap(R.drawable.content_bg)));
        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        container = findViewById(R.id.container);

        txtTip = findViewById(R.id.txt_tip);

        yi = getIntent().getIntExtra(App.STR_TO_YI, 0);

        txtTip.setText(titles[yi]);


        myAsycnTask = new MyAsycnTask(this);
        myAsycnTask.execute();
    }

    private static class MyAsycnTask extends AsyncTask<Void, View, View>{

        private WeakReference<ContentActivity> contentActivityWeakReference;

        public MyAsycnTask(ContentActivity contentActivity){
            this.contentActivityWeakReference = new WeakReference<ContentActivity>(contentActivity);
        }

        @Override
        protected View doInBackground(Void... voids) {
            final ContentActivity contentActivity = contentActivityWeakReference.get();
            if (contentActivity != null){
                for (int i = 0; i < contentActivity.txts[contentActivity.yi].length; i++){
                    View view = LayoutInflater.from(contentActivity).inflate(R.layout.content_item, contentActivity.container, false);
                    TextView txtYi = view.findViewById(R.id.txt_yi);
                    TextView txtShi = view.findViewById(R.id.txt_shi);
                    ImageView img = view.findViewById(R.id.img);
                    txtShi.setText(contentActivity.txts[contentActivity.yi][i]);
                    txtYi.setText(contentActivity.titles[contentActivity.yi] + " 一 ");
                    img.setImageBitmap(ImageLoader.readBitMap(contentActivity.imgs[contentActivity.yi][i]));

                    final int finalI = i;
                    view.findViewById(R.id.btn_ranka).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(contentActivity, TrainActivity.class);
                            intent.putExtra(App.STR_TO_YI, contentActivity.yi);
                            intent.putExtra(App.STR_TO_SHI, finalI);
                            intent.putExtra(App.STR_TO_RANK, 0);
                            contentActivity.startActivity(intent);
                        }
                    });

                    view.findViewById(R.id.btn_rankb).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(contentActivity, TrainActivity.class);
                            intent.putExtra(App.STR_TO_YI, contentActivity.yi);
                            intent.putExtra(App.STR_TO_SHI, finalI);
                            intent.putExtra(App.STR_TO_RANK, 1);
                            contentActivity.startActivity(intent);
                        }
                    });

                    view.findViewById(R.id.btn_rankc).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(contentActivity, TrainActivity.class);
                            intent.putExtra(App.STR_TO_YI, contentActivity.yi);
                            intent.putExtra(App.STR_TO_SHI, finalI);
                            intent.putExtra(App.STR_TO_RANK, 2);
                            contentActivity.startActivity(intent);
                        }
                    });
                    publishProgress(view);
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(View... values) {
            super.onProgressUpdate(values);
            ContentActivity contentActivity = contentActivityWeakReference.get();
            if (contentActivity != null){
                contentActivity.container.addView(values[0]);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        myAsycnTask.cancel(true);
    }
}
