package com.reactnativepictureinpicture;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.bridge.LifecycleEventListener;
import android.os.Build;

@ReactModule(name = PictureInPictureModule.NAME)
public class PictureInPictureModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
  public static final String NAME = "PictureInPicture";

  public PictureInPictureModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  @RequiresApi(api = Build.VERSION_CODES.N)
  @ReactMethod
  public void enterPictureInPictureMode() {
    getCurrentActivity().enterPictureInPictureMode();
  }


  @Override
  public void onHostResume() {
  }

  @Override
  public void onHostPause() {
  }

  @Override
  public void onHostDestroy() {
  }
}
