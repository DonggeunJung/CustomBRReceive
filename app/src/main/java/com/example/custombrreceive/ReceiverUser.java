package com.example.custombrreceive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ReceiverUser extends BroadcastReceiver {
    @Override
    public void onReceive(Context arg0, Intent arg1) {
        String data1 = arg1.getStringExtra("data1");

        // 인텐트를 생성해서 메인 액티비티를 실행
        Intent intentRun = new Intent(arg0, MainActivity.class);
        intentRun.putExtra("data1", data1);
        intentRun.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        arg0.startActivity(intentRun);
    }
}
