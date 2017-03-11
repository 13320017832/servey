package com.example.bear.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bear on 2017/3/11.
 */

public class activity3 extends AppCompatActivity {
    CheckBox chk1, chk2, chk3, chk4, chk5;
    Button btn2,btn3;
    TextView tv;
    private List<CheckBox> checkBoxList = new ArrayList<CheckBox>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        btn2=(Button) findViewById(R.id.button3);
        btn3=(Button) findViewById(R.id.button4);
        tv=(TextView)findViewById(R.id.textView3);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(activity3.this,activity32.class));


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(activity3.this,activity28.class));


            }
        });
        addListenerOnCheck1();
    }
    private void addListenerOnCheck1() {
        chk1 = (CheckBox) findViewById(R.id.checkBox);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        chk3 = (CheckBox) findViewById(R.id.checkBox3);
        chk4 = (CheckBox) findViewById(R.id.checkBox4);
        chk5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBoxList.add(chk1);
        checkBoxList.add(chk2);
        checkBoxList.add(chk3);
        checkBoxList.add(chk4);
        checkBoxList.add(chk5);
        chk2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                StringBuffer sb = new StringBuffer();
                //遍历集合中的checkBox,判断是否选择，获取选中的文本
                for (CheckBox checkbox : checkBoxList) {
                    if (checkbox.isChecked()){
                        sb.append(checkbox.getText().toString() + " ");
                    }
                }


             //   MainActivity.strss[8]=sb.toString();

            }
        });
    }
}
