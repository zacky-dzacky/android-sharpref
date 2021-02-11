package com.beautyisis.sharpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharPrefManager {

    private static SharedPreferences preferences;

    synchronized public static void init(Context context){
        if(preferences == null) preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }
}
