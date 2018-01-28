package com.nyc.notificationsbackgroundservices;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // Setting a notification ID allows you to update the notification later on.
    private static final int NOTIFICATION_ID = 555;

    // Setting a notification channel allows the user to make choices about groups of notifications in later Android versions
    private static final String NOTIFICATION_CHANNEL = "C4Q Notifications";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launchTestService();
    }
    public void launchTestService() {
        Intent i = new Intent(this, MyNotificationService.class);
        startService(i);
    }
}
