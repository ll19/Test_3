package com.example.kingdom.test_3;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button1=(Button)findViewById(R.id.test1);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Test1.class);
               startActivity(intent);
           }
       });
       Button button2=(Button)findViewById(R.id.test2);
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Test2.class);
               startActivity(intent);
           }
       });
       Button button3=(Button)findViewById(R.id.test3);
       button3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Test3.class);
               startActivity(intent);
           }
       });
       Button button4=(Button)findViewById(R.id.test4);
       button4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(MainActivity.this,Test4.class);
               startActivity(intent);
           }
       });


    }

}
