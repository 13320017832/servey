package com.example.bear.survey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by bear on 2017/3/11.
 */

public class activity24 extends AppCompatActivity {
    Button btn2,btn3;
    TextView tv;
    RadioButton rd1, rd2, rd3, rd4;
    RadioGroup rdg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity24);
        tv = (TextView) findViewById(R.id.textView2);
        rd1 = (RadioButton) findViewById(R.id.radioButton);
        rd2 = (RadioButton) findViewById(R.id.radioButton2);
        rd3 = (RadioButton) findViewById(R.id.radioButton3);
        rd4 = (RadioButton) findViewById(R.id.radioButton4);
        rdg = (RadioGroup) findViewById(R.id.radioGroup);
        rdg.setOnCheckedChangeListener(rd);
        btn2=(Button) findViewById(R.id.button);
        btn3=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(activity24.this,activity25.class));


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(activity24.this,activity23.class));


            }
        });
    }
    private RadioGroup.OnCheckedChangeListener rd=new RadioGroup.OnCheckedChangeListener() {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            // TODO Auto-generated method stub
            if(checkedId==rd1.getId()){
                MainActivity.strss[3]=rd1.getText().toString();
            }else if(checkedId==rd2.getId()){
                MainActivity.strss[3]=rd2.getText().toString();
            }
            else if(checkedId==rd3.getId()){
                MainActivity.strss[3]=rd3.getText().toString();
            }else if(checkedId==rd4.getId()){
                MainActivity.strss[3]=rd4.getText().toString();
            }
        }
    };
}
