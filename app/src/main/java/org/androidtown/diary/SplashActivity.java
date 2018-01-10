package org.androidtown.diary;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        // 현재 화면 3초동안 출력
        Handler handler = new Handler() {
            @Override
            public void handleMessage (Message msg) {
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0, 3000);
    }

}
