package com.example.bear.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by bear on 2017/3/11.
 */

public class activity4  extends AppCompatActivity {
    Button btn2,btn3;

    private static final String[] strs = new String[] {
            "none", "several days", "several weeks", "several month", "half a year", "one year", "two or three years", "five years", "ten years"," more than ten years"
    };//定义一个String数组用来显示ListView的内容
    private ListView lv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        btn2=(Button) findViewById(R.id.button5);
        btn3=(Button) findViewById(R.id.button6);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(activity4.this,activity5.class));


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(activity4.this,activity34.class));


            }
        });
        lv = (ListView) findViewById(R.id.list);//得到ListView对象的引用
/*为ListView设置Adapter来绑定数据*/
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, strs));
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_checked, strs));
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
    }
}
