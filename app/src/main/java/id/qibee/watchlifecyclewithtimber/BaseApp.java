package id.qibee.watchlifecyclewithtimber;

import android.app.Application;

import timber.log.Timber;

public class BaseApp extends Application {

    //todo create BaseApp for plant Timber

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG){
            Timber.plant(new Timber.DebugTree());
        } else {
            Timber.plant(new NotLoggingTree());
        }
    }
}
