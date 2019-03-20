package com.example.custombrreceive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/*
 * CustomBRReceive : User define BroadCast message receive example
 * Author : DONGGEUN JUNG (Dennis)
 * Email : topsan72@gmail.com / topofsan@naver.com
 */

public class MainActivity extends AppCompatActivity {
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);

        Intent intent = getIntent();
        String data1 = intent.getStringExtra("data1");
        if( data1 != null )
            editText1.setText(data1);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

}
