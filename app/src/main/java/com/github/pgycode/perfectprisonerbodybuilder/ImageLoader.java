package com.github.pgycode.perfectprisonerbodybuilder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;
import java.util.WeakHashMap;

/**
 * Created by Administrator on 2018/7/25/025.
 */

public class ImageLoader {


    private static WeakHashMap<Integer, Bitmap> bitmaps = new WeakHashMap<>();

    public static Bitmap readBitMap(int resId) {
        if (bitmaps.get(resId) != null)
            return bitmaps.get(resId);
        else {
            BitmapFactory.Options opt = new BitmapFactory.Options();
            opt.inPreferredConfig = Bitmap.Config.RGB_565;
            opt.inPurgeable = true;
            opt.inInputShareable = true;
            // 获取资源图片
            InputStream is = App.context.getResources().openRawResource(resId);
            Bitmap bitmap = BitmapFactory.decodeStream(is, null, opt);
            bitmaps.put(resId, bitmap);
            return bitmap;
        }
    }
}
