package com.beautyisis.sharpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharPrefManager {

    private static SharedPreferences preferences;

    synchronized public static void init(Context context){
        if(preferences == null) preferences = PreferenceManager.getDefaultSharedPreferences(context);
    }


    public static String getEmail() {
        return preferences.getString("email", "");
    }

    public static void setEmail(String email) {
        preferences.edit().putString("email", email).apply();
    }

    public static boolean isLoggedIn() {
        return preferences.getBoolean("isLoggedIn", false);
    }

    public static void setLoggedIn(boolean loggedIn) {
        preferences.edit().putBoolean("isLoggedIn", loggedIn).apply();
    }
}
