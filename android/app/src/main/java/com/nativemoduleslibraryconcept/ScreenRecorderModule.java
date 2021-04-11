package com.nativemoduleslibraryconcept;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import com.hbisoft.hbrecorder.HBRecorder;
import com.hbisoft.hbrecorder.HBRecorderListener;

public class ScreenRecorderModule extends ReactContextBaseJavaModule {

    ScreenRecorderModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "ScreenRecorderModule";
    }

    @ReactMethod
    public void startRecordingScreen(String name){
        Log.d("ScreenRecorderModule", "Start Recording screen called with:" + name + ".");
    }
}

class ScreenRecorder implements HBRecorderListener {

    @Override
    public void HBRecorderOnStart() {

    }

    @Override
    public void HBRecorderOnComplete() {

    }

    @Override
    public void HBRecorderOnError(int errorCode, String reason) {

    }
}