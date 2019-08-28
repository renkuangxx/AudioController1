package com.example.audiocontroller;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/**
 * Created By：jinheng.liu
 * on 2019/8/27
 */
public class AudioSetService extends Service {

    public void onCreate(){
        super.onCreate();
        Toast.makeText(getApplicationContext(), "我正在后台运行",
                Toast.LENGTH_LONG).show();
    }

    public IBinder onBind(Intent intent){
        Toast.makeText(getApplicationContext(), "不默认Toast样式",
                Toast.LENGTH_LONG).show();
        return null;
    }
}
