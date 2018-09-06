package org.hvdw.gohome;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.ComponentName;

public class GoHome extends Activity {
    public static final String TAG = "GoHomeApp";
    private static Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getApplicationContext();

        Log.d(TAG, "Started GoHomeApp; in OnCreate void");

        Intent sIntent = new Intent(Intent.ACTION_MAIN);
        sIntent.addCategory(Intent.CATEGORY_HOME);
        sIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(sIntent);
        Log.d(TAG, "Programattically going to HOME screen");

        finish();
    }

}
