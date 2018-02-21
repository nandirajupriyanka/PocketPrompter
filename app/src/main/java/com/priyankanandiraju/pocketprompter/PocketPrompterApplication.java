package com.priyankanandiraju.pocketprompter;

import android.app.Application;

import com.priyankanandiraju.pocketprompter.helper.DeviceConfig;

/**
 * Created by priyankanandiraju on 8/20/17.
 */

public class PocketPrompterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize Device Config utility at startup
        final DeviceConfig deviceConfig = DeviceConfig.getInstance();
        deviceConfig.initContext(this);
    }
}
