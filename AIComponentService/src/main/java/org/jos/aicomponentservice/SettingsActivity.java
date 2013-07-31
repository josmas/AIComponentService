package org.jos.aicomponentservice;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import java.util.Calendar;

public class SettingsActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);

    //Creating an intent to start ComponentService - This is an IntentService that will
    //shut itself down automatically, and it will be created every 30 seconds by an AlarmManager.
    Calendar cal = Calendar.getInstance();

    Intent intent = new Intent(this, ComponentService.class);
    PendingIntent pIntent = PendingIntent.getService(this, 0, intent, 0);

    AlarmManager alarm = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
    // Start every 30 seconds
    alarm.setRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), 30*1000, pIntent);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.settings, menu);
    return true;
  }

}
