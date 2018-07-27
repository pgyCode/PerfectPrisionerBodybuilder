package com.github.pgycode.perfectprisonerbodybuilder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/7/25/025.
 */

public class TrainActivity extends Activity {

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

    private Plan[][][] plans = {
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


    private TextView txtTip = null;
    private TextView txtProject = null;
    private TextView txtPlan = null;

    private int yi = 0;
    private int shi = 0;
    private int rank = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.train);

        yi = getIntent().getIntExtra(App.STR_TO_YI, 0);
        shi = getIntent().getIntExtra(App.STR_TO_SHI, 0);
        rank = getIntent().getIntExtra(App.STR_TO_RANK, 0);

        findViewById(R.id.btn_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        txtTip = findViewById(R.id.txt_tip);
        txtProject = findViewById(R.id.txt_project);
        txtPlan = findViewById(R.id.txt_plan);

        txtTip.setText("训练列表");
        txtProject.setText("项目：" + projects[yi][shi]);
        txtPlan.setText("计划：每组" +
                plans[yi][shi][rank].num +
                "次起落  共" +
                plans[yi][shi][rank].group +
                "组");
        findViewById(R.id.root).setBackground(new BitmapDrawable(ImageLoader.readBitMap(R.drawable.train_bg)));

        ((ImageView)findViewById(R.id.img)).setImageBitmap(ImageLoader.readBitMap(imgs[yi][shi]));

        findViewById(R.id.btn_action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TrainActivity.this, ActionActivity.class);
                intent.putExtra(App.STR_TO_YI, yi);
                intent.putExtra(App.STR_TO_SHI, shi);
                intent.putExtra(App.STR_TO_RANK, rank);
                startActivity(intent);
            }
        });
    }


    private class Plan{
        public int num;
        public int group;

        public Plan(int num, int group){
            this.num = num;
            this.group = group;
        }
    }
}
