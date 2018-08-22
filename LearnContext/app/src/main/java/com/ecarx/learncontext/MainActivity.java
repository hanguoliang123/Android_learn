package com.ecarx.learncontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        tv = new TextView(MainActivity.this);
        //tv.setText("Hello Android.");
//        tv.setText(R.string.hello_world);
//        setContentView(tv);

        ImageView iv = new ImageView(this);
        iv.setImageResource(R.mipmap.ic_launcher);
        setContentView(iv);

        System.out.println(getResources().getText(R.string.hello_world));
    }
}