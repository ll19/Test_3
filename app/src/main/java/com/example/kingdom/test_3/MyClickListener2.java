package com.example.kingdom.test_3;

import android.view.View;
import android.widget.EditText;

/**
 * Created by kingdom on 2018/5/5.
 */

public class MyClickListener2 implements View.OnClickListener{
    private EditText editText;
    public MyClickListener2() {
        super();
    }

    public MyClickListener2(EditText editText) {
        super();
        this.editText=editText;
    }

    @Override
    public void onClick(View v) {
        editText.setText("外部类");
    }
}
