package com.example.kingdom.test_3;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kingdom on 2018/5/5.
 */

public class Fragment_test_1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view=inflater.inflate(R.layout.button_edit,container,false);
        //绑定到标签
        Button button5=(Button)view.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickHandler();
            }
        });
        return view;
    }
    public void clickHandler(){
        EditText editText=(EditText)getActivity().findViewById(R.id.edit);
        editText.setText("绑定到标签");
    }
}
