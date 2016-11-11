package com.elclcd.dagger2;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * AppliactionModule
 * <p>
 *
 * @author elc_simayi
 * @since 2016/11/9
 */

@Module
public class AppliactionModule {
    private Application application;

    public AppliactionModule(Application application) {
        this.application = application;
    }

    @Provides
    public Context provideAppliactionContext(){
        return application.getApplicationContext();
    }

    /**
     * Dagger优先识别Module中的Provides, 其次是inject构造参数
     * @return
     */
    @Named("test1")
    @Singleton
    @Provides
    public DeviceInfo provideDeviceInfo(){
        Log.d(MyApplication.TAG,"provideDeviceInfo named test1");
        return new DeviceInfo(application);
    }

    @Named("test2")
    @Singleton
    @Provides
    public DeviceInfo provideDeviceInfo2(){
        Log.d(MyApplication.TAG,"provideDeviceInfo named test2");
        return new DeviceInfo(application);
    }
}
