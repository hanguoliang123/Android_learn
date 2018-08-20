package com.ecarx.sendargs;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TheAty extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_aty);

        tv = (TextView) findViewById(R.id.tv);

        Intent i = getIntent();
        //Bundle data = i.getExtras();
//        Bundle data = i.getBundleExtra("data");
//
//        //tv.setText(i.getStringExtra("data"));
//        tv.setText(String.format("name=%s,age=%d,name1=%s",data.getString("name"),data.getInt("age"),data.getString("name1","default")));

            //User user = (User) i.getSerializableExtra("user");
            User user = (User) i.getParcelableExtra("user");
            tv.setText(String.format("User info(name=%s,age=%d)",user.getName(),user.getAge()));
    }
}
