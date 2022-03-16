package com.example.webviewcrashdemo;

import android.app.Application;
import android.webkit.WebView;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        WebView.setWebContentsDebuggingEnabled(false);
    }
}
