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

public class activity5 extends AppCompatActivity {
    Button btn2,btn3;

     //定义一个String数组用来显示ListView的内容
    private ListView lv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        btn2=(Button) findViewById(R.id.button5);
        btn3=(Button) findViewById(R.id.button6);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(activity5.this,finalpage.class));


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(activity5.this,activity4.class));


            }
        });
        lv = (ListView) findViewById(R.id.list);//得到ListView对象的引用
/*为ListView设置Adapter来绑定数据*/
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, MainActivity.strss));

    }
}
