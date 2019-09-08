package com.example.suppermusicplay;

import android.app.Application;

import com.example.suppermusicplay.ui.UIUtils;

public class MyApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    UIUtils.getInstance(this);
  }
}
