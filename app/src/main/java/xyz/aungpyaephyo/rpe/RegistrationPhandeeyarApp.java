package xyz.aungpyaephyo.rpe;

import android.app.Application;
import android.content.Context;

/**
 * Created by aung on 6/19/16.
 */
public class RegistrationPhandeeyarApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
