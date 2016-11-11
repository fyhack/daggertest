package com.elclcd.dagger2;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * MyApplication
 * <p>
 *
 * @author elc_simayi
 * @since 2016/11/7
 */


public class MyApplication extends Application {
    public static final String TAG = "Test";

    @Inject
    Tools tools;
    @Inject
    DeviceInfo deviceInfo;
    @Named("test1")
    @Inject
    DeviceInfo deviceInfo1;
    @Named("test2")
    @Inject
    DeviceInfo deviceInfo2;
    @Named("test2")
    @Inject
    DeviceInfo deviceInfo3;


    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppliactionComponent.builder().appliactionModule(new AppliactionModule(this)).build().inject(this);
    }

    public Tools getTools(){
        return tools;
    }

    public DeviceInfo getDeviceInfo1() {
        return deviceInfo1;
    }

    public DeviceInfo getDeviceInfo2() {
        return deviceInfo2;
    }

    public DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }

    public DeviceInfo getDeviceInfo3() {
        return deviceInfo3;
    }

}
