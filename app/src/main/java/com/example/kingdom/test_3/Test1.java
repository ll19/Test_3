package com.example.kingdom.test_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Test1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        final EditText editText=(EditText)findViewById(R.id.edit);
        //内部类
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new MyClickListener1());
        //外部类
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new MyClickListener2(editText));
        //匿名内部类
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("匿名内部类");
            }
        });
        //Activity
        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        //返回
        Button button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


    @Override
    public void onClick(View v) {
        EditText editText=(EditText)findViewById(R.id.edit);
        editText.setText("Activity");
    }

    class MyClickListener1 implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText editText=(EditText)findViewById(R.id.edit);
            editText.setText("内部类");
        }
    }
}
