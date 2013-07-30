package org.jos.aicomponentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Sample Service (IntentService) to be used in an App Inventor component
 * @author Jose Dominguez <josmasflores@gmail.com>
 */
public class ComponentService extends IntentService {

  private static final String TAG = "ComponentServiceExample";

  public ComponentService() {
    super("ComponentService");
    Log.d(TAG, "ComponentService Created");
  }

  @Override
  protected void onHandleIntent(Intent intent) {
    Log.d(TAG, "Logging to Logcat!!!");
  }

}