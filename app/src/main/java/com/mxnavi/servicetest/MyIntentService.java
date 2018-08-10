package com.mxnavi.servicetest;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by zhaoll on 2018/7/18.
 */

public class MyIntentService extends IntentService {

    private static final String TAG = "MyIntentService";
    
    public MyIntentService(){
        super("MyIntentService");  
    }
    
    @Override
    protected void onHandleIntent(Intent intent) {
        // 打印当前线程id
        Log.d(TAG, "Thread is:"+Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: executed");
    }
}
