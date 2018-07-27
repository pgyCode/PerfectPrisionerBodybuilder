package com.github.pgycode.perfectprisonerbodybuilder;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2018/7/26/026.
 */

public class ActionActivity extends Activity {



    private String[] parts = {
            "胸肌|肱三头肌",
            "腹肌",
            "背肌|肱二头肌",
            "臀肌|大腿肌",
            "肩部",
            "脊椎"
    };

    private String[][] projects = {
            {
                    "墙壁俯卧撑",
                    "上斜俯卧撑",
                    "膝盖俯卧撑",
                    "半俯卧撑",
                    "标准俯卧撑",
                    "窄距俯卧撑",
                    "偏重俯卧撑",
                    "单臂半俯卧撑",
                    "杠杆俯卧撑",
                    "单臂俯卧撑"
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
                    "肩倒立深蹲",
                    "折刀深蹲",
                    "支撑深蹲",
                    "半深蹲",
                    "标准深蹲",
                    "窄距深蹲",
                    "偏重深蹲",
                    "单腿半深蹲",
                    "单腿辅助深蹲",
                    "单腿深蹲"
            },
            {
                    "垂直引体",
                    "水平引体向上",
                    "折刀引体向上",
                    "半引体向上",
                    "标准引体向上",
                    "窄距引体向上",
                    "偏重引体向上",
                    "单臂半引体向上",
                    "单臂辅助引体向上",
                    "单臂引体向上"
            },
            {
                    "靠墙顶立",
                    "乌鸦倒立撑",
                    "靠墙倒立",
                    "半式倒立撑",
                    "标准倒立撑",
                    "窄距倒立撑",
                    "偏重倒立撑",
                    "单臂半倒立撑",
                    "杠杆倒立撑",
                    "单臂倒立撑"
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

    private int[][] imgs = {
            {
                    R.drawable.train_breast_a,
                    R.drawable.train_breast_b,
                    R.drawable.train_breast_c,
                    R.drawable.train_breast_d,
                    R.drawable.train_breast_e,
                    R.drawable.train_breast_f,
                    R.drawable.train_breast_g,
                    R.drawable.train_breast_h,
                    R.drawable.train_breast_i,
                    R.drawable.train_breast_j
            },
            {
                    R.drawable.train_stomach_a,
                    R.drawable.train_stomach_b,
                    R.drawable.train_stomach_c,
                    R.drawable.train_stomach_d,
                    R.drawable.train_stomach_e,
                    R.drawable.train_stomach_f,
                    R.drawable.train_stomach_g,
                    R.drawable.train_stomach_h,
                    R.drawable.train_stomach_i,
                    R.drawable.train_stomach_j
            },
            {
                    R.drawable.train_back_a,
                    R.drawable.train_back_b,
                    R.drawable.train_back_c,
                    R.drawable.train_back_d,
                    R.drawable.train_back_e,
                    R.drawable.train_back_f,
                    R.drawable.train_back_g,
                    R.drawable.train_back_h,
                    R.drawable.train_back_i,
                    R.drawable.train_back_j
            },
            {
                    R.drawable.train_leg_a,
                    R.drawable.train_leg_b,
                    R.drawable.train_leg_c,
                    R.drawable.train_leg_d,
                    R.drawable.train_leg_e,
                    R.drawable.train_leg_f,
                    R.drawable.train_leg_g,
                    R.drawable.train_leg_h,
                    R.drawable.train_leg_i,
                    R.drawable.train_leg_j
            },
            {
                    R.drawable.train_shoulder_a,
                    R.drawable.train_shoulder_b,
                    R.drawable.train_shoulder_c,
                    R.drawable.train_shoulder_d,
                    R.drawable.train_shoulder_e,
                    R.drawable.train_shoulder_f,
                    R.drawable.train_shoulder_g,
                    R.drawable.train_shoulder_h,
                    R.drawable.train_shoulder_i,
                    R.drawable.train_shoulder_j
            },
            {
                    R.drawable.train_spine_a,
                    R.drawable.train_spine_b,
                    R.drawable.train_spine_c,
                    R.drawable.train_spine_d,
                    R.drawable.train_spine_e,
                    R.drawable.train_spine_f,
                    R.drawable.train_spine_g,
                    R.drawable.train_spine_h,
                    R.drawable.train_spine_i,
                    R.drawable.train_spine_j
            }
    };

    public Plan[][][] plans = {
            {
                    {
                            new Plan(10, 1),
                            new Plan(25, 2),
                            new Plan(50, 3),
                    },
                    {
                            new Plan(10, 1),
                            new Plan(20, 2),
                            new Plan(40, 3),
                    },
                    {
                            new Plan(10, 1),
                            new Plan(15, 2),
                            new Plan(30, 3),
                    },
                    {
                            new Plan(8, 1),
                            new Plan(12, 2),
                            new Plan(25, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(20, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(20, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(20, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(20, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(20, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(100, 1),
                    }
            },
            {
                    {
                            new Plan(10, 1),
                            new Plan(25, 2),
                            new Plan(40, 3),
                    },
                    {
                            new Plan(10, 1),
                            new Plan(20, 2),
                            new Plan(35, 3),
                    },
                    {
                            new Plan(8, 1),
                            new Plan(15, 2),
                            new Plan(25, 3),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(20, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(30, 2),
                    }
            },{
            {
                    new Plan(10, 1),
                    new Plan(20, 2),
                    new Plan(30, 3),
            },
            {
                    new Plan(10, 1),
                    new Plan(20, 2),
                    new Plan(30, 3),
            },
            {
                    new Plan(10, 1),
                    new Plan(15, 2),
                    new Plan(20, 3),
            },
            {
                    new Plan(8, 1),
                    new Plan(11, 2),
                    new Plan(15, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(8, 2),
                    new Plan(10, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(8, 2),
                    new Plan(10, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(7, 2),
                    new Plan(8, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(8, 2),
                    new Plan(11, 2),
            },
            {
                    new Plan(2, 1),
                    new Plan(5, 2),
                    new Plan(7, 2),
            },
            {
                    new Plan(1, 1),
                    new Plan(3, 2),
                    new Plan(6, 2),
            }
    },{
            {
                    new Plan(10, 1),
                    new Plan(25, 2),
                    new Plan(50, 3),
            },
            {
                    new Plan(10, 1),
                    new Plan(20, 2),
                    new Plan(40, 3),
            },
            {
                    new Plan(10, 1),
                    new Plan(15, 2),
                    new Plan(30, 3),
            },
            {
                    new Plan(8, 1),
                    new Plan(12, 2),
                    new Plan(25, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(10, 2),
                    new Plan(20, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(10, 2),
                    new Plan(20, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(10, 2),
                    new Plan(20, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(10, 2),
                    new Plan(20, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(10, 2),
                    new Plan(20, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(10, 2),
                    new Plan(100, 1),
            }
    },
            {
                    {
                            new Plan(10, 1),
                            new Plan(25, 2),
                            new Plan(40, 3),
                    },
                    {
                            new Plan(10, 1),
                            new Plan(20, 2),
                            new Plan(35, 3),
                    },
                    {
                            new Plan(8, 1),
                            new Plan(15, 2),
                            new Plan(25, 3),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(20, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(15, 2),
                    },
                    {
                            new Plan(5, 1),
                            new Plan(10, 2),
                            new Plan(30, 2),
                    }
            },{
            {
                    new Plan(10, 1),
                    new Plan(20, 2),
                    new Plan(30, 3),
            },
            {
                    new Plan(10, 1),
                    new Plan(20, 2),
                    new Plan(30, 3),
            },
            {
                    new Plan(10, 1),
                    new Plan(15, 2),
                    new Plan(20, 3),
            },
            {
                    new Plan(8, 1),
                    new Plan(11, 2),
                    new Plan(15, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(8, 2),
                    new Plan(10, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(8, 2),
                    new Plan(10, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(7, 2),
                    new Plan(8, 2),
            },
            {
                    new Plan(5, 1),
                    new Plan(8, 2),
                    new Plan(11, 2),
            },
            {
                    new Plan(2, 1),
                    new Plan(5, 2),
                    new Plan(7, 2),
            },
            {
                    new Plan(1, 1),
                    new Plan(3, 2),
                    new Plan(6, 2),
            }
    }
    };
    
    private ImageView img;
    private TextView txt;


    private int yi;
    private int shi;
    private int rank;

    private MyAsyncTask myAsyncTask;

    private TextView txtAgroup = null;


    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(this, Uri.parse("android.resource://com.github.pgycode.perfectprisionerbodybuilder/"+R.raw.bengbengca));
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        // 通过异步的方式装载媒体资源
        mediaPlayer.prepareAsync();
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                // 装载完毕回调
                mediaPlayer.start();
            }
        });

        setContentView(R.layout.action);
        
        img = findViewById(R.id.img);
        txt = findViewById(R.id.txt);

        txtAgroup = findViewById(R.id.txt_agroup);
        
        yi = getIntent().getIntExtra(App.STR_TO_YI, 0);
        shi = getIntent().getIntExtra(App.STR_TO_SHI, 0);
        rank = getIntent().getIntExtra(App.STR_TO_RANK, 0);
        
        img.setImageBitmap(ImageLoader.readBitMap(imgs[yi][shi]));
        txt.setText(projects[yi][shi]);
        txtAgroup.setText("共" +
                plans[yi][shi][rank].group +
                "组");

        myAsyncTask = new MyAsyncTask(this);
        myAsyncTask.execute();
    }
    
    
    public class Plan{
        
        public int num;
        public int group;
        
        public Plan(int num, int group){
            this.num = num;
            this.group = group;
        }
    }


    private static class MyAsyncTask extends AsyncTask<Void, Integer, Integer>{

        private WeakReference<ActionActivity> actionActivityWeakReference;
        public MyAsyncTask(ActionActivity actionActivity){
            actionActivityWeakReference = new WeakReference<ActionActivity>(actionActivity);
        }

        @Override
        protected Integer doInBackground(Void... voids) {
            ActionActivity actionActivity = actionActivityWeakReference.get();
            if (actionActivity != null){
                Plan plan = actionActivity.plans[actionActivity.yi][actionActivity.shi][actionActivity.rank];
                try {
                    Thread.sleep(3000);
                    App.soundPool.play(App.SOUND_FIRST_ACTION, 7, 7, 7, 0, 1);
                    Thread.sleep(2000);
                    App.soundPool.play(App.SOUND_THREE_WOMEN, 7, 7, 7, 0, 1);
                    publishProgress(-1, 3);
                    Thread.sleep(2000);
                    App.soundPool.play(App.SOUND_TWO_WOMEN, 7, 7, 7, 0, 1);
                    publishProgress(-1, 2);
                    Thread.sleep(2000);
                    App.soundPool.play(App.SOUND_ONE_WOMEN, 7, 7, 7, 0, 1);
                    publishProgress(-1, 1);
                    Thread.sleep(2000);
                    for (int i = 0; i < plan.group; i++){
                        App.soundPool.play(App.SOUND_START_WOMEN, 7, 7, 7, 0, 1);
                        publishProgress(0, i + 1, plan.num);
                        Thread.sleep(5000);
                        App.soundPool.play(App.SOUND_ONE_WOMEN, 7, 7, 7, 0, 1);;
                        for (int j = 0; j < plan.num; j++){
                            publishProgress(2, i + 1, j + 1, plan.num);
                            Thread.sleep(2500);
                            App.soundPool.play(App.SOUND_TWO_WOMEN, 7, 7, 7, 0, 1);
                            publishProgress(1);
                            Thread.sleep(2500);
                            if (j + 1 == plan.num)
                                App.soundPool.play(App.SOUND_FINISH_WOMEN, 7, 7, 7, 0, 1);
                            else
                                App.soundPool.play(App.SOUND_ONE_WOMEN, 7, 7, 7, 0, 1);
                        }

                        if (i + 1 == plan.group)
                            break;
                        for (int k = 45; k > 0; k--){
                            publishProgress(3, k);
                            Thread.sleep(1000);
                            if (k == 8) {
                                if (i + 2 == plan.group)
                                    App.soundPool.play(App.SOUND_LAST_ACTION, 7, 7, 7, 0, 1);
                                else
                                    App.soundPool.play(App.SOUND_NEXT_ACTION, 7, 7, 7, 0, 1);
                            }
                            if (k == 6)
                                App.soundPool.play(App.SOUND_THREE_WOMEN, 7, 7, 7, 0, 1);
                            if (k == 4)
                                App.soundPool.play(App.SOUND_TWO_WOMEN, 7, 7, 7, 0, 1);
                            if (k == 2)
                                App.soundPool.play(App.SOUND_ONE_WOMEN, 7, 7, 7, 0, 1);
                        }
                    }
                    if (actionActivity.mediaPlayer != null && actionActivity.mediaPlayer.isPlaying()){
                        actionActivity.mediaPlayer.stop();
                        actionActivity.mediaPlayer.release();
                        actionActivity.mediaPlayer = null;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

                ActionActivity actionActivity = actionActivityWeakReference.get();
                if (actionActivity != null) {
                    if (values[0] == -1) {
                        View viewCount = actionActivity.findViewById(R.id.view_count);
                        TextView txtTime = actionActivity.findViewById(R.id.txt_time);
                        TextView txtRelax = actionActivity.findViewById(R.id.txt_relax);
                        viewCount.setVisibility(View.GONE);
                        txtRelax.setVisibility(View.GONE);
                        txtTime.setVisibility(View.VISIBLE);
                        txtTime.setText(values[1] + "");
                    }else if(values[0] == 0){
                        View viewCount = actionActivity.findViewById(R.id.view_count);
                        TextView txtTime = actionActivity.findViewById(R.id.txt_time);
                        TextView txtRelax = actionActivity.findViewById(R.id.txt_relax);
                        viewCount.setVisibility(View.VISIBLE);
                        txtRelax.setVisibility(View.GONE);
                        txtTime.setVisibility(View.GONE);
                        TextView txtTip = actionActivity.findViewById(R.id.txt_tip);
                        txtTip.setText("吸气");
                        TextView txtCgroup = actionActivity.findViewById(R.id.txt_cgroup);
                        txtCgroup.setText("第" +
                                values[1] +
                                "组");
                        TextView txtCount = actionActivity.findViewById(R.id.txt_count);
                        txtCount.setText(String.format("00/%02d", values[2]));
                    }else if(values[0] == 1){
                        TextView txtTip = actionActivity.findViewById(R.id.txt_tip);
                        txtTip.setText("呼气");
                    }else if(values[0] == 2){
                        TextView txtTip = actionActivity.findViewById(R.id.txt_tip);
                        txtTip.setText("吸气");
                        TextView txtCgroup = actionActivity.findViewById(R.id.txt_cgroup);
                        txtCgroup.setText("第" +
                                values[1] +
                                "组");
                        TextView txtCount = actionActivity.findViewById(R.id.txt_count);
                        txtCount.setText(String.format("%02d/%02d", values[2], values[3]));
                    }else if(values[0] == 3){
                        View viewCount = actionActivity.findViewById(R.id.view_count);
                        TextView txtTime = actionActivity.findViewById(R.id.txt_time);
                        TextView txtRelax = actionActivity.findViewById(R.id.txt_relax);
                        viewCount.setVisibility(View.GONE);
                        txtRelax.setVisibility(View.VISIBLE);
                        txtTime.setVisibility(View.GONE);
                        txtRelax.setText("休息" +
                                values[1] +
                                "秒");
                    }
                }
        }


        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            ActionActivity actionActivity = actionActivityWeakReference.get();
            if (actionActivity != null){
                Intent intent = new Intent(actionActivity, AwardActivity.class);
                intent.putExtra("time", 6 * actionActivity.plans[actionActivity.yi][actionActivity.shi][actionActivity.rank].num * actionActivity.plans[actionActivity.yi][actionActivity.shi][actionActivity.rank].group + "秒");
                String string = null;
                switch (actionActivity.rank)
                {
                    case 0:
                        string = "初级";
                        break;
                    case 1:
                        string = "中级";
                        break;
                    case 2:
                        string = "高级";
                        break;
                }
                intent.putExtra("name", string + actionActivity.projects[actionActivity.yi][actionActivity.shi] + "完成");
                intent.putExtra("part", actionActivity.parts[actionActivity.yi]);
                actionActivity.startActivity(intent);
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        myAsyncTask.cancel(true);
        if (mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
