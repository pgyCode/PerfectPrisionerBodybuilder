package com.github.pgycode.perfectprisonerbodybuilder;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.SoundPool;

public class App extends Application {

    public static final String STR_TO_YI = "STR_TO_YI";
    public static final String STR_TO_SHI = "STR_TO_SHI";
    public static final String STR_TO_RANK = "STR_TO_RANK";

    public static final int INT_YI_BREAST = 0;
    public static final int INT_YI_STAMACH = 1;
    public static final int INT_YI_BACK = 2;
    public static final int INT_YI_LEG = 3;
    public static final int INT_YI_SHOULDER = 4;
    public static final int INT_YI_SPINE = 5;

    public static final int INT_RANK_A = 0;
    public static final int INT_RANK_B = 1;
    public static final int INT_RANK_C = 2;
    public static final int INT_RANK_D = 3;


    public static final int SOUND_ONE = 1;
    public static final int SOUND_ONE_WOMEN = 2;
    public static final int SOUND_TWO = 3;
    public static final int SOUND_TWO_WOMEN = 4;
    public static final int SOUND_THREE = 5;
    public static final int SOUND_THREE_WOMEN = 6;
    public static final int SOUND_START = 7;
    public static final int SOUND_START_WOMEN = 8;
    public static final int SOUND_FINISH = 9;
    public static final int SOUND_FINISH_WOMEN = 10;
    public static final int SOUND_FIRST_ACTION = 11;
    public static final int SOUND_NEXT_ACTION = 12;
    public static final int SOUND_LAST_ACTION = 13;


    public static Context context;
    public static SoundPool soundPool;

    public static SharedPreferences sharedPreferences;

    public static int sound;
    public static long start;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        soundPool = new SoundPool(9, AudioManager.STREAM_MUSIC, 0);
        soundPool.load(context, R.raw.one, 5);
        soundPool.load(context, R.raw.one_woman, 5);
        soundPool.load(context, R.raw.two, 5);
        soundPool.load(context, R.raw.two_woman, 5);
        soundPool.load(context, R.raw.three, 5);
        soundPool.load(context, R.raw.three_woman, 5);
        soundPool.load(context, R.raw.start, 5);
        soundPool.load(context, R.raw.start_woman, 5);
        soundPool.load(context, R.raw.finish, 5);
        soundPool.load(context, R.raw.finish_woman, 5);
        soundPool.load(context, R.raw.frist_action, 5);
        soundPool.load(context, R.raw.next_action, 5);
        soundPool.load(context, R.raw.last_action, 5);

        sharedPreferences = getSharedPreferences("config", MODE_PRIVATE);
        sound = sharedPreferences.getInt("sound", 0);
        start = sharedPreferences.getLong("start", 0);
        if (start == 0){
            sharedPreferences.edit().putLong("start", System.currentTimeMillis()).commit();
            start = sharedPreferences.getLong("start", System.currentTimeMillis());
        }
    }
}
